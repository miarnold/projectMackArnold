package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserRole {

    @Id
    @Column(name = "user_name")
    private String userName;
    @Id
    @Column(name = "role_name")
    private String roleName;

    public UserRole() {

    }

    public UserRole(String userName, String roleName) {
        this.userName = userName;
        this.roleName = roleName;
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

    @Override
    public String toString() {
        return "User{" +
                "userName ='" + userName + '\'' +
                ", roleName ='" + roleName + '\'' +
                '}';
    }
}