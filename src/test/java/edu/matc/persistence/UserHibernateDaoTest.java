package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * The type User hibernate dao test.
 */
public class UserHibernateDaoTest {
    private final Logger logger = Logger.getLogger(this.getClass());
    /**
     * The User dao.
     */
    UserHibernateDao userDao;
    /**
     * The User.
     */
    User user;
    /**
     * The List of users.
     */
    int listOfUsers;
    /**
     * The List.
     */
    List<User> list;

    /**
     * Sets up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
        userDao = new UserHibernateDao();
        listOfUsers = userDao.getAllUsers().size();
        user = new User();


    }

    /**
     * Gets all users test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getAllUsersTest() throws Exception {
        List<User> users = userDao.getAllUsers();
        assertEquals("Unexpected number of users returned", listOfUsers, users.size());
    }


    /**
     * Select user test.
     *
     * @throws Exception the exception
     */
    @Test
    public void selectUserTest() throws Exception {
        user = userDao.selectUser(1);
        assertNotNull(user);
        assertEquals("wrong password returned", "admin", user.getUserPass());
    }


    /**
     * Update user test.
     *
     * @throws Exception the exception
     */
    @Test
    public void updateUserTest() throws Exception {
        listOfUsers = userDao.getAllUsers().size();
        user = userDao.selectUser(4);
        //logger.error(user);
        user.setUserPass("briggs");
        //logger.error(user);
        userDao.updateUser(user);
        assertEquals("List size has changed", listOfUsers, userDao.getAllUsers().size());
        assertEquals("Update changes failed to save", user.toString(), userDao.selectUser(4).toString());
    }


    /**
     * Delete user test.
     *
     * @throws Exception the exception
     */
    @Test
    public void deleteUserTest() throws Exception {
        userDao.deleteUser(5);
        assertEquals("Incorrect size of results", listOfUsers - 1, userDao.getAllUsers().size());
    }

    /**
     * Add user test.
     */
    @Test
    public void addUserTest() {
        user = new User(8,"Dena", "cool","Dena","Arnold","booger@me.com");

        userDao.addUser(user);
        assertEquals("Incorrect size of results", listOfUsers + 1, userDao.getAllUsers().size());
        }

}