package com.jnshu.model;

/**
 * Created by Tom on 2017/5/4.
 */
public class User {
    int id;
    String UserName;
    String pwd;

    public User() {
    }

    public User(int id, String userName, String pwd) {
        this.id = id;
        UserName = userName;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", UserName='" + UserName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
