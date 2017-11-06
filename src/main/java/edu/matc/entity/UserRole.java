package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRole {

    private int roleId;
    private String userName;
    private String roleName;

    public UserRole() {

    }

    public UserRole(int roleId, String userName, String roleName) {
        this.roleId = roleId;
        this.userName = userName;
        this.roleName = roleName;

    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column (name="role_id")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Basic
    @Column(name = "role_name")
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
