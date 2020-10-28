package com.example.modeulda.model;

public class UserModel {
    private String id;
    private String email;
    private String pw;
    private String time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public UserModel(){}

    public UserModel(String id, String email, String pw, String time) {
        this.id = id;
        this.email = email;
        this.pw = pw;
        this.time = time;
    }


}
