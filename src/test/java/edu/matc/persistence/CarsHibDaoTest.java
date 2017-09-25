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
    Cars carObject;
    int listOfCars;

    @Before
    public void setUp() throws Exception {
        carDao = new CarsHibDao();
        listOfCars = carDao.getAllCars().size();
        carObject = new Cars();

    }



    @Test
    public void getAllUsersTest() throws Exception {
        List<Cars> cars = carDao.getAllCars();
        assertEquals("Unexpected number of cars returned", listOfCars, cars.size());
    }

    @Test
    public void addCarTest() {
        carObject = new Cars("Compass","SUV", "Medium","Gas", "4-Wheel", 29, 24, 2013,15151515);
        logger.info("---------");
        logger.error(carObject);
        carDao.addCar(carObject);
        assertEquals("Incorrect size of results", listOfCars + 1, carDao.getAllCars().size());
    }

}