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
    public void getAllCarsTest() throws Exception {
        List<Cars> cars = carDao.getAllCars();
        assertEquals("Unexpected number of cars returned", listOfCars, cars.size());
    }

    @Test
    public void selectcarsTest() throws Exception {
        carObject = carDao.selectCar(1);
        assertNotNull(carObject);
        assertEquals("wrong car selected", 1, carObject.getCar_id());
    }

    @Test
    public void addCarTest() {
        carObject = new Cars(6,"Coupe", "Gas", 24, 21, 2009,17171717,1,"Mini Couper");
        logger.info("---------");
        logger.error(carObject);
        carDao.addCar(carObject);
        assertEquals("Incorrect size of results", listOfCars + 1, carDao.getAllCars().size());
    }

    @Test
    public void deleteUserTest() throws Exception {
        carDao.deleteCar(4);
        assertEquals("Incorrect size of results", listOfCars - 1, carDao.getAllCars().size());
    }

    @Test
    public void updateUserTest() throws Exception {
        listOfCars = carDao.getAllCars().size();
        carObject = carDao.selectCar(2);
        //logger.error(carObject);
        carObject.setVehicleType("Rav4");
        //logger.error(carObject);
        carDao.updateCar(carObject);
        assertEquals("List size has changed", listOfCars, carDao.getAllCars().size());
         }

}