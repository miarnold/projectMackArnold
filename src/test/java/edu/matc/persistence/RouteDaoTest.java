package edu.matc.persistence;

import edu.matc.entity.Routes;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RouteDaoTest {

    private final Logger logger = Logger.getLogger(this.getClass());
    RouteDao routeDao;
    Routes routeObject;
    int listOfRoutes;

    @Before
    public void setUp() throws Exception {
        routeDao = new RouteDao();
        listOfRoutes = routeDao.getAllRoutes().size();
        routeObject = new Routes();

    }
    @Test
    public void getAllRoutesTest() throws Exception {
        List<Routes> routes = routeDao.getAllRoutes();
        assertEquals("Unexpected number of cars returned", listOfRoutes, routes.size());
    }

    @Test
    public void deleteRoute() throws Exception {
    }

    @Test
    public void addRoute() throws Exception {
    }

    @Test
    public void updateRoute() throws Exception {
    }

    @Test
    public void selectRoute() throws Exception {
    }

}