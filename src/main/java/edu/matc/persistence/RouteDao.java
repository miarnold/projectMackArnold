package edu.matc.persistence;

import edu.matc.entity.Cars;
import edu.matc.entity.Routes;
import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


public class RouteDao {
    private final Logger log = Logger.getLogger(this.getClass());


    public List<Cars> getAllRoutes() {
        List<Cars> cars = new ArrayList<Cars>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            cars = session.createCriteria(Routes.class).list();
        } catch (HibernateException he) {
            log.error("Error getting all users", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return cars;
    }

    public void deleteRoute(int routeId){
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            Routes route = (Routes)session.get(Routes.class, routeId);
            session.delete(route);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error("Error getting all users", e);
        }finally {
            session.close();
        }
    }

    public Routes addRoute(Routes route) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            route = new Routes(route.getRouteId(),route.getDriverName(),route.getNumberOfMiles(),route.getNumberOfHighwayMiles(),route.getNumberOfCityMiles(),route.getWhichCar(),route.getDateOfTrip(),route.getGasPrice(),route.getCommuteNotes(),route.getUsername(),route.getTotal());
            session.save(route);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error("Error getting all users", e);
        }finally {
            session.close();
        }
        return route;
    }

    public void updateRoute(Routes route) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(route);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back update of route: " + route, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public Routes selectRoute(int routeId) {
        Routes route = null;
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            route = (Routes)session.get(Routes.class, routeId);
            session.get(Routes.class, routeId);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error("Error getting all users", e);;
        }finally {
            session.close();
        }
        return route;
    }
}
