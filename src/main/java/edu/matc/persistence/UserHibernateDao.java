package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class UserHibernateDao {
    private final Logger log = Logger.getLogger(this.getClass());

    /** Return a list of all users
     *
     * @return All users
     */
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            users = session.createCriteria(User.class).list();
        } catch (HibernateException he) {
            log.error("Error getting all users", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return users;

    }


    public void deleteUser(int id){
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            User user = (User)session.get(User.class, id);
            session.delete(user);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error("error deleting user", e);
        }finally {
            session.close();
        }
    }


    public User selectUser(int Id) {
        User user = null;
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            user = (User)session.get(User.class, Id);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error("error selecting user",e);
        }finally {
            session.close();
        }
        return user;
    }





    public void updateUser(User user) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(user);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back update of user: " + user, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public User addUser(User user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            user = new User( user.getUserId(), user.getUserName(), user.getUserPass(), user.getFirstName(), user.getLastName(), user.getEmail());
            session.save(user);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error("error adding user", e);
        }finally {
            session.close();
        }
        return user;
    }





}
