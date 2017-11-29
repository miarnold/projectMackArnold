package edu.matc.entity;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * A class to represent a user.
 *
 * @author marnold
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column (name="user_id")
    private int userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_pass")
    private String userPass;
    @Column (name="first_name")
    private String firstName;
    @Column (name="last_name")
    private String lastName;
    @Column (name="email")
    private String email;


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param userId    the user id
     * @param userName  the user name
     * @param userPass  the user password
     * @param firstName the first name
     * @param lastName  the last name
     * @param email     the email
     */
    public User(int userId, String userName, String userPass, String firstName, String lastName, String email ) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets user pass.
     *
     * @return the user pass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * Sets user pass.
     *
     * @param userPass the user pass
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "User")
    public int getUserId() {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }





    @Override
    public String toString() {
        return "User{" +
                "userName ='" + userName + '\'' +
                ", userPass ='" + userPass + '\'' +
                '}';
    }


}