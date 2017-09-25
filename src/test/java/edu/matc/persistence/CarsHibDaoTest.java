package edu.matc.persistence;

import edu.matc.entity.Cars;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CarsHibDaoTest {
    private final Logger logger = Logger.getLogger(this.getClass());
    CarsHibDao carDao;
    Cars car;
    int listOfCars;

    @Before
    public void setUp() throws Exception {
        carDao = new CarsHibDao();
        listOfCars = carDao.getAllCars().size();
        car = new Cars();

    }



    @Test
    public void getAllUsersTest() throws Exception {
        List<Cars> cars = carDao.getAllCars();
        assertEquals("Unexpected number of cars returned", listOfCars, cars.size());
    }

    @Test
    public void addCarTest() {
        car = new Cars( );

        carDao.addCar(car);
        assertEquals("Incorrect size of results", listOfCars + 1, carDao.getAllCars().size());
    }

}