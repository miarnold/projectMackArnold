package edu.matc.persistence;

import edu.matc.entity.Cars;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * The type Cars hib dao test.
 */
public class CarsHibDaoTest {
    private final Logger logger = Logger.getLogger(this.getClass());
    /**
     * The Car dao.
     */
    CarsHibDao carDao;
    /**
     * The Car object.
     */
    Cars carObject;
    /**
     * The List of cars.
     */
    int listOfCars;

    /**
     * Sets up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
        carDao = new CarsHibDao();
        listOfCars = carDao.getAllCars().size();
        carObject = new Cars();

    }


    /**
     * Gets all cars test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getAllCarsTest() throws Exception {
        List<Cars> cars = carDao.getAllCars();
        assertEquals("Unexpected number of cars returned", listOfCars, cars.size());
    }

    /**
     * Selectcars test.
     *
     * @throws Exception the exception
     */
    @Test
    public void selectcarsTest() throws Exception {
        carObject = carDao.selectCar(2);
        logger.info("The car you selected is: " + carObject.getCarName());
        assertNotNull(carObject);
        assertEquals("wrong car selected", 2, carObject.getCar_id());
    }

    /**
     * Add car test.
     */
    @Test
    public void addCarTest() {
        carObject = new Cars(6,"Coupe", "Gas", 24, 21, 2009,17171717,"sam","Mini Couper");
        logger.info("---------");
        logger.error(carObject);
        carDao.addCar(carObject);
        assertEquals("Incorrect size of results", listOfCars + 1, carDao.getAllCars().size());
    }

    /**
     * Delete user test.
     *
     * @throws Exception the exception
     */
    @Test
    public void deleteUserTest() throws Exception {
        carDao.deleteCar(4);
        assertEquals("Incorrect size of results", listOfCars - 1, carDao.getAllCars().size());
    }

    /**
     * Update user test.
     *
     * @throws Exception the exception
     */
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