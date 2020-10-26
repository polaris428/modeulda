package com.example.modeulda.model;

public class WrittenModel {
    public String title, author, content, time, likes;
    public WrittenModel(){}
    public WrittenModel(String title, String author, String content, String time, String likes){
        this.title = title;
        this.author = author;
        this.content = content;
        this.time = time;
        this.likes = likes;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }


}
