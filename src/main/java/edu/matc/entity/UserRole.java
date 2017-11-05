package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

public class UserRole {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column (name="role_id")
    private int roleId;
    @Column(name = "user_name")
    private String userName;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "user_id")
    private int userId;

    public UserRole() {

    }

    public UserRole(int roleId, String userName, String roleName, int userId) {
        this.roleId = roleId;
        this.userName = userName;
        this.roleName = roleName;
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @ManyToOne
    @JoinColumn(name = "users", referencedColumnName = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "User{" +
                "userName ='" + userName + '\'' +
                ", roleName ='" + roleName + '\'' +
                '}';
    }
}
