package com.example.modeulda.ModelDoc;

import com.example.modeulda.ModelUser.UserModel;
import com.example.modeulda.serverFiles.Packet;

import java.util.List;

public class WrittenModel extends Packet {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UserModel getAuthor() {
        return author;
    }

    public void setAuthor(UserModel author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    private String title;
    private UserModel author;
    private String time;
    private int likes;
    private String theme;

    private List<String> content;

    public WrittenModel(){}

    public WrittenModel(String title, UserModel author, List<String> content, String time, int likes, String theme){
        this.title = title;
        this.author = author;
        this.content = content;
        this.time = time;
        this.likes = likes;
        this.theme = theme;
        PacketType = com.example.modeulda.serverFiles.PacketType.WrittenModel;
    }
}
