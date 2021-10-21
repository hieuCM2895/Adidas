package com.example.dao;

import com.example.model.Product;
import com.example.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ProductDAOImpl extends AbstractDAO<Product, Object> {

    public Product findNewProduct() {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Product> query = builder.createQuery(Product.class);
            Root<Product> root = query.from(Product.class);

            query.select(root).orderBy(builder.desc(root.get("id")));

            return session.createQuery(query).setMaxResults(1).getSingleResult();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;

    }

    public Product findNewProductByCategoryId(int categoryId) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Product> query = builder.createQuery(Product.class);
            Root<Product> root = query.from(Product.class);

            query.select(root).orderBy(builder.desc(root.get("id")));
            query.where(builder.equal(root.get("category").get("id"), categoryId));

            return session.createQuery(query).setMaxResults(1).setCacheable(true).getSingleResult();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;

    }

    public List<Product> findListProductByCategoryID(int categoryId) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Product> query = builder.createQuery(Product.class);
            Root<Product> root = query.from(Product.class);

            query.select(root).where(builder.equal(root.get("category").get("id"), categoryId));

            return session.createQuery(query).setCacheable(true).getResultList();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public List<Product> searchProductByName(String txt) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Product> query = builder.createQuery(Product.class);
            Root<Product> root = query.from(Product.class);

            query.select(root).where(builder.like(root.get("name"), "%" + txt + "%"));

            return session.createQuery(query).setCacheable(true).getResultList();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public List<Product> searchProductByAccountID(int accountId, int currentNumberPage, int pageSize) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Product> query = builder.createQuery(Product.class);
            Root<Product> root = query.from(Product.class);

            query.select(root).where(builder.equal(root.get("account").get("id"), accountId))
                                .orderBy(builder.asc(root.get("id")));

            Query query1 = session.createQuery(query).setCacheable(true);
            query1.setFirstResult((currentNumberPage - 1) * pageSize);
            query1.setMaxResults(pageSize);

            return query1.getResultList();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public List<Product> searchProductByAccountID(int currentNumberPage, int pageSize) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Product> query = builder.createQuery(Product.class);
            Root<Product> root = query.from(Product.class);

            query.select(root).orderBy(builder.asc(root.get("id")));

            Query query1 = session.createQuery(query).setCacheable(true);
            query1.setFirstResult((currentNumberPage - 1) * pageSize);
            query1.setMaxResults(pageSize);

            return query1.getResultList();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    // category

    public List<Product> searchProductByCategoryId(int categoryId ,int currentNumberPage, int pageSize) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Product> query = builder.createQuery(Product.class);
            Root<Product> root = query.from(Product.class);

            query.select(root).where(builder.equal(root.get("category").get("id"), categoryId))
                    .orderBy(builder.asc(root.get("id")));

            Query query1 = session.createQuery(query).setCacheable(true);
            query1.setFirstResult((currentNumberPage - 1) * pageSize);
            query1.setMaxResults(pageSize);

            return query1.getResultList();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public Object getNumberSellProductByAccountID(int accountId) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Object> query = builder.createQuery(Object.class);
            Root<Product> root = query.from(Product.class);

            query.select(builder.count(root)).where(builder.equal(root.get("account").get("id"), accountId));

            return session.createQuery(query).uniqueResult();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public Object getNumberSellProduct() {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Object> query = builder.createQuery(Object.class);
            Root<Product> root = query.from(Product.class);

            query.select(builder.count(root));

            return session.createQuery(query).uniqueResult();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public Object getNumberSellProductByCategory(int categoryId) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Object> query = builder.createQuery(Object.class);
            Root<Product> root = query.from(Product.class);

            query.select(builder.count(root)).where(builder.equal(root.get("category").get("id"), categoryId));

            return session.createQuery(query).setCacheable(true).uniqueResult();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public List<Product> searchProductByAmount(int amount) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Product> query = builder.createQuery(Product.class);
            Root<Product> root = query.from(Product.class);

            query.select(root).orderBy(builder.asc(root.get("id")));

            Query query1 = session.createQuery(query).setCacheable(true);
            query1.setMaxResults(amount);

            return query1.getResultList();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public List<Product> searchLastProductByAmount(int amount) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Product> query = builder.createQuery(Product.class);
            Root<Product> root = query.from(Product.class);

            query.select(root).orderBy(builder.desc(root.get("id")));

            Query query1 = session.createQuery(query).setCacheable(true);
            query1.setMaxResults(amount);

            return query1.getResultList();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public Object findCategoryIdByProductId(int productId) {

        try {
            Session session = HibernateUtil.getSesstionFactory().openSession();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Object> query = builder.createQuery(Object.class);
            Root<Product> root = query.from(Product.class);

            query.select(root.get("category").get("id")).where(builder.equal(root.get("id"), productId));

            return session.createQuery(query).uniqueResult();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public static void main(String[] args) {
        ProductDAOImpl productDAO = new ProductDAOImpl();
        List<Product> product = productDAO.searchLastProductByAmount(6);
        for (Product product1 : product) {
            System.out.println(product1);
        }

    }

}
