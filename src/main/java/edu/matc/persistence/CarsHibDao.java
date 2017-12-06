package edu.matc.persistence;

import edu.matc.entity.Cars;
import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


/**
 * The type Cars hib dao.
 */
public class CarsHibDao {
    private final Logger log = Logger.getLogger(this.getClass());


    /**
     * Gets all cars.
     *
     * @return the all cars
     */
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

    /**
     * Delete car.
     *
     * @param carId the car id
     */
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
            log.error("error deleting car" + e);
        }finally {
            session.close();
        }
    }

    /**
     * Add car cars.
     *
     * @param car the car
     * @return the cars
     */
    public Cars addCar(Cars car) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            car = new Cars(car.getCar_id(),car.getVehicleType(),
                    car.getFuelType(), car.getHighwayMiles(), car.getCityMiles(),
                     car.getYearOfMake(), car.getVin(), car.getUserName(),car.getCarName());
            session.save(car);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction!=null) transaction.rollback();
            log.error("error adding car" + e);
        }finally {
            session.close();
        }
        return car;
    }

    /**
     * Update car.
     *
     * @param car the car
     */
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

    /**
     * Select car cars.
     *
     * @param carId the car id
     * @return the cars
     */
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
            log.error("error selecting car" + e);
        }finally {
            session.close();
        }
        return car;
    }
}
