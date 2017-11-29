package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type User role.
 */
@Entity
@Table(name = "user_roles")
public class UserRole {

    private int roleId;
    private String userName;
    private String roleName;

    /**
     * Instantiates a new User role.
     */
    public UserRole() {

    }

    /**
     * Instantiates a new User role.
     *
     * @param roleId   the role id
     * @param userName the user name
     * @param roleName the role name
     */
    public UserRole(int roleId, String userName, String roleName) {
        this.roleId = roleId;
        this.userName = userName;
        this.roleName = roleName;

    }

    /**
     * Gets role id.
     *
     * @return the role id
     */
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column (name="role_id")
    public int getRoleId() {
        return roleId;
    }

    /**
     * Sets role id.
     *
     * @param roleId the role id
     */
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    @Basic
    @Column(name = "user_name")
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
     * Gets role name.
     *
     * @return the role name
     */
    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets role name.
     *
     * @param roleName the role name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }







    @Override
    public String toString() {
        return "User{" +
                "userName ='" + userName + '\'' +
                ", roleName ='" + roleName + '\'' +
                '}';
    }
}
