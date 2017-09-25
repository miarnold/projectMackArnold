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
            car = new Cars(car.getVehicleType(), car.getVehicleCategory(), car.getVehicleSize(),
                    car.getFuelType(), car.getDrivingWheels(), car.getHighwayMiles(), car.getCityMiles(),
                     car.getYearOfMake(), car.getVin());
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
}
