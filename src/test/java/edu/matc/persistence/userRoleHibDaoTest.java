package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.entity.UserRole;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * The type User role hib dao test.
 */
public class userRoleHibDaoTest {
    private final Logger logger = Logger.getLogger(this.getClass());
    /**
     * The Role dao.
     */
    userRoleHibDao roleDao;
    /**
     * The Role.
     */
    UserRole role;
    /**
     * The List of roles.
     */
    int listOfRoles;

    /**
     * Sets up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
        roleDao = new userRoleHibDao();
        listOfRoles = roleDao.getAllRoles().size();
        role = new UserRole();

    }

    /**
     * Gets all roles test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getAllRolesTest() throws Exception {
        List<UserRole> roles = roleDao.getAllRoles();
        assertEquals("Unexpected number of users returned", listOfRoles, roles.size());
    }

    /**
     * Update role test.
     *
     * @throws Exception the exception
     */

    @Test
    public void updateRoleTest() throws Exception {
        listOfRoles = roleDao.getAllRoles().size();
        role = roleDao.selectRole(1);
        logger.error(role);
        role.setRoleName("Admin");
        //logger.error(user);
        roleDao.updateRole(role);
        assertEquals("List size has changed", listOfRoles, roleDao.getAllRoles().size());
        //assertEquals("Update changes failed to save", role.getRoleName(), roleDao.);
    }


    /**
     * Select role test.
     *
     * @throws Exception the exception
     */
    @Test
    public void selectRoleTest() throws Exception {
        logger.info("MACK");
        role = roleDao.selectRole(2);
        logger.error("this is the role error: SSSSSSSSSAAAAAAMMMMMMM" + role);
        assertNotNull(role);
        assertEquals("wrong role returned", 2, role.getRoleId());
    }


    /**
     * Delete user test.
     *
     * @throws Exception the exception
     */
    @Test
    public void deleteUserTest() throws Exception {
        roleDao.deleteRoles(3);
        assertEquals("Incorrect size of results", listOfRoles - 1, roleDao.getAllRoles().size());
    }

    /**
     * Add role test.
     */
    @Test
    public void addRoleTest() {
        role = new UserRole();
        role.setRoleId(4);
        role.setUserName("Dena");
        role.setRoleName("Administrator");

        roleDao.addRole(role);
        assertEquals("Incorrect size of results", listOfRoles + 1, roleDao.getAllRoles().size());
    }

}