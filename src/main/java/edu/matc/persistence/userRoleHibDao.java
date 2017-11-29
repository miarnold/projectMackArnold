package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.entity.UserRole;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * The type User role hib dao.
 */
public class userRoleHibDao {

    private final Logger log = Logger.getLogger(this.getClass());


    /**
     * Gets all roles.
     *
     * @return the all roles
     */
    public List<UserRole> getAllRoles() {
        List<UserRole> roles = new ArrayList<UserRole>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            roles = session.createCriteria(UserRole.class).list();
        } catch (HibernateException he) {
            log.error("Error getting all Roles", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return roles;

    }


    /**
     * Delete roles.
     *
     * @param role_id the role id
     */
    public void deleteRoles(int role_id){
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            UserRole role = (UserRole)session.get(UserRole.class, role_id);
            session.delete(role);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error("error deleting role", e);
        }finally {
            session.close();
        }
    }


    /**
     * Select role user role.
     *
     * @param role_id the role id
     * @return the user role
     */
    public UserRole selectRole(int role_id) {
        UserRole role = null;
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            role = (UserRole)session.get(UserRole.class, role_id);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error("error selecting role",e);
        }finally {
            session.close();
        }
        return role;
    }


    /**
     * Update role.
     *
     * @param role the role
     */
    public void updateRole(UserRole role) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(role);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back update of roles: " + role, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    /**
     * Add role user role.
     *
     * @param role the role
     * @return the user role
     */
    public UserRole addRole(UserRole role) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            role = new UserRole(role.getRoleId(),role.getUserName(), role.getRoleName());
            session.save(role);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error("error adding user", e);
        }finally {
            session.close();
        }
        return role;
    }
}
