package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * Access users in the user table.
 *
 * @author marnold
 *
 */
public class UserDao {

    private final Logger logger = Logger.getLogger(this.getClass());

    public List<User> getAllUsers() {

        String sql = "SELECT * FROM users";
        return executeQuery(sql);

    }

    /*public List<User> getUsersByLastName(String lastName) {
        String sql = "SELECT * FROM users WHERE last_name like '%" + lastName + "%'";
        return executeQuery(sql);
    }
    */

    public List<User> executeQuery(String sql) {
        List<User> users = new ArrayList<User>();
        Database database = Database.getInstance();
        Connection connection = null;
        logger.info("this is the info error");
        try {
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            ResultSet results = selectStatement.executeQuery(sql);
            demoWhile(users, results);
            database.disconnect();
        } catch (SQLException e) {
            logger.info("SearchUser.getAllUsers()...SQL Exception: " + e);
        } catch (Exception e) {
            logger.info("SearchUser.getAllUsers()...Exception: " + e);
        }
        return users;
    }

    private void demoWhile(List<User> users, ResultSet results) throws SQLException {
        while (results.next()) {
            User employee = createUserFromResults(results);
            users.add(employee);
        }

    }

    //TODO add a method or methods to return a single user based on search criteria

    private User createUserFromResults(ResultSet results) throws SQLException {
        User user = new User();
        user.setUserName(results.getString("user_name"));
        user.setUserPass(results.getString("user_pass"));
        // TODO map the remaining fields
        return user;
    }

}