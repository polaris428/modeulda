package com.example.modeulda.model;

public class UserModel {
    private String id, email, time;

    public UserModel(){}

    public UserModel(String id, String email, String time) {
        this.id = id;
        this.email = email;
        this.time = time;
    }

    public String getName() {
        return id;
    }

    public void setName(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
