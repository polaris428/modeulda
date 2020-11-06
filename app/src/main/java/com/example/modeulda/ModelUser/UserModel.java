package com.example.modeulda.ModelUser;

import com.example.modeulda.serverFiles.Packet;

public class UserModel extends Packet {
    public String id;
    public String email;
    public String pw;
    public String time;
    public UserModel(){}

    public UserModel(String id, String email, String pw, String time) {
        this.id = id;
        this.email = email;
        this.pw = pw;
        this.time = time;
        PacketType = com.example.modeulda.serverFiles.PacketType.UserModel;
    }

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
}
