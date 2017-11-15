package edu.matc.persistence;

import edu.matc.entity.Cars;
import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


public class CarsHibDao {
    private final Logger log = Logger.getLogger(this.getClass());


    public List<Cars> getAllCars() {
        List<Cars> cars = new ArrayList<Cars>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            cars = session.createCriteria(Cars.class).list();
        } catch (HibernateException he) {
            log.error("Error getting all users", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return cars;
    }

    public void deleteCar(int carId){
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            Cars car = (Cars)session.get(Cars.class, carId);
            session.delete(car);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public Cars addCar(Cars car) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            car = new Cars(car.getCar_id(),car.getVehicleType(),
                    car.getFuelType(), car.getHighwayMiles(), car.getCityMiles(),
                     car.getYearOfMake(), car.getVin(), car.getUserId(),car.getCarName());
            session.save(car);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return car;
    }

    public void updateCar(Cars car) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(car);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back update of user: " + car, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public Cars selectCar(int carId) {
        Cars car = null;
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            car = (Cars)session.get(Cars.class, carId);
            session.get(Cars.class, carId);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return car;
    }
}
