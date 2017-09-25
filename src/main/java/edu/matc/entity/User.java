package edu.matc.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * A class to represent a user.
 *
 * @author marnold
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_pass")
    private String userPass;


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param userName the user name
     * @param userPass  the user password
     */
    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }




    @Override
    public String toString() {
        return "User{" +
                "userName ='" + userName + '\'' +
                ", userPass ='" + userPass + '\'' +
                '}';
    }


}