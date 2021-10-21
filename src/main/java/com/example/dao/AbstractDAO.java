package com.example.dao;

import com.example.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

public abstract class AbstractDAO<T, K> {

    Session session = null;

    public List<T> findAll(Class<T> clazz) {

        try {
            session = HibernateUtil.getSesstionFactory().openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<T> query = builder.createQuery(clazz);
            Root<T> root = query.from(clazz);
            return session.createQuery(query).setCacheable(true).getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;

    }

    public boolean save(T entity) {

        try {
            session = HibernateUtil.getSesstionFactory().openSession();
            session.getTransaction().begin();
            Serializable result = session.save(entity);
            session.getTransaction().commit();
            return (result != null);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return false;

    }

    public boolean update(T entity) {

        try {
            session = HibernateUtil.getSesstionFactory().openSession();
            session.getTransaction().begin();
            session.update(entity);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return false;

    }

    public boolean delete(T entity) {

        try {
            session = HibernateUtil.getSesstionFactory().openSession();
            session.getTransaction().begin();
            session.delete(entity);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return false;

    }

    public T findById(Class<T> clazz, K object) {

        try {
            session = HibernateUtil.getSesstionFactory().openSession();
            return session.find(clazz, object);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;

    }
}
