package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserHibernateDaoTest {
    private final Logger logger = Logger.getLogger(this.getClass());
    UserHibernateDao userDao;
    User user;
    int listOfUsers;

    @Before
    public void setUp() throws Exception {
        userDao = new UserHibernateDao();
        listOfUsers = userDao.getAllUsers().size();
        user = new User();

    }
    @Test
    public void getAllUsersTest() throws Exception {
        List<User> users = userDao.getAllUsers();
        assertEquals("Unexpected number of users returned", listOfUsers, users.size());
    }


    @Test
    public void selectUserTest() throws Exception {
        user = userDao.selectUser(1);
        assertNotNull(user);
        assertEquals("wrong password returned", "admin", user.getUserPass());
    }

    @Test
    public void updateUserTest() throws Exception {
        listOfUsers = userDao.getAllUsers().size();
        user = userDao.selectUser(7);
        logger.error(user);
        user.setUserPass("tool");
        logger.error(user);
        userDao.updateUser(user);
        assertEquals("List size has changed", listOfUsers, userDao.getAllUsers().size());
        assertEquals("Update changes failed to save", user.toString(), userDao.selectUser(7).toString());
    }



    @Test
    public void deleteUserTest() throws Exception {
        userDao.deleteUser(8);
        assertEquals("Incorrect size of results", listOfUsers - 1, userDao.getAllUsers().size());
    }

    @Test
    public void addUserTest() {
        user = new User(8,"Dena", "cool","Dena","Arnold","booger@me.com");

        userDao.addUser(user);
        assertEquals("Incorrect size of results", listOfUsers + 1, userDao.getAllUsers().size());
        }

}