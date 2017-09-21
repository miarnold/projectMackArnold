package edu.matc.persistence;

import edu.matc.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserHibernateDaoTest {
    UserHibernateDao userDao;

    @Before
    public void setUp() throws Exception {
        userDao = new UserHibernateDao();

    }
    @Test
    public void getAllUsersTest() throws Exception {
        List<User> users = userDao.getAllUsers();
        assertEquals("Unexpected number of users returned", 2, users.size());
    }

    @Test
    public void deleteUserTest() throws Exception {
    }

    @Test
    public void updateUserTest() throws Exception {
    }

}