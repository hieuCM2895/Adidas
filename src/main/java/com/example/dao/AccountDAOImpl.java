package com.example.dao;

import com.example.model.Account;
import com.example.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class AccountDAOImpl extends AbstractDAO<Account, Object> {

    public Account loginByUserAndPassword(String userName, String pass) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Account> query = builder.createQuery(Account.class);
            Root<Account> root = query.from(Account.class);

            Predicate user = builder.like(root.get("user"), userName);
            Predicate password = builder.like(root.get("password"), pass);

            query.select(root).where(builder.and(user, password));

            return session.createQuery(query).getSingleResult();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public boolean checkUserExits(String userName) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Account> query = builder.createQuery(Account.class);
            Root<Account> root = query.from(Account.class);

            Predicate user = builder.like(root.get("user"), userName);

            query.select(root).where(user);

            return session.createQuery(query) != null;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;

    }

    public static void main(String[] args) {

        AccountDAOImpl accountDAO = new AccountDAOImpl();
        System.out.println(accountDAO.loginByUserAndPassword("Hieu2893", "123"));

    }
}
