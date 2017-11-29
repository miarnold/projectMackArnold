package edu.matc.persistence;

import edu.matc.entity.Routes;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * The type Route dao test.
 */
public class RouteDaoTest {

    private final Logger logger = Logger.getLogger(this.getClass());
    /**
     * The Route dao.
     */
    RouteDao routeDao;
    /**
     * The Route object.
     */
    Routes routeObject;
    /**
     * The List of routes.
     */
    int listOfRoutes;

    /**
     * Sets up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
        routeDao = new RouteDao();
        listOfRoutes = routeDao.getAllRoutes().size();
        routeObject = new Routes();

    }

    /**
     * Gets all routes test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getAllRoutesTest() throws Exception {
        List<Routes> routes = routeDao.getAllRoutes();
        assertEquals("Unexpected number of cars returned", listOfRoutes, routes.size());
    }

    /**
     * Delete route.
     *
     * @throws Exception the exception
     */
    @Test
    public void deleteRoute() throws Exception {
        routeDao.deleteRoute(7);
        assertEquals("Incorrect size of results", listOfRoutes - 1, routeDao.getAllRoutes().size());
    }

    /**
     * Add route.
     *
     * @throws Exception the exception
     */
    @Test
    public void addRoute() throws Exception {
        routeObject = new Routes(6,"Sam",24,12,12,"trek wingra","11-25-2017",2.45,"this is a test","mack","$12.54","21","45");
        routeDao.addRoute(routeObject);
        assertEquals("Incorrect size of results", listOfRoutes + 1, routeDao.getAllRoutes().size());
    }

    /**
     * Update route.
     *
     * @throws Exception the exception
     */
    @Test
    public void updateRoute() throws Exception {
        listOfRoutes = routeDao.getAllRoutes().size();
        routeObject = routeDao.selectRoute(1);
        routeObject.setDriverName("Sam");
        routeDao.updateRoute(routeObject);
        assertEquals("List size has changed", listOfRoutes, routeDao.getAllRoutes().size());
    }

    /**
     * Select route.
     *
     * @throws Exception the exception
     */
    @Test
    public void selectRoute() throws Exception {

        routeObject = routeDao.selectRoute(1);
        assertNotNull(routeObject);
        assertEquals("wrong route selected", 1, routeObject.getRouteId());
    }

}