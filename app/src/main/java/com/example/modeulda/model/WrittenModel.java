package com.example.modeulda.model;

import java.util.List;

public class WrittenModel {
    private String title;
    private String author;
    private String time;
    private String likes;
    private String theme;
    private int pages;
    private List<String> content;

    public WrittenModel(){}

    public WrittenModel(String title, String author, List<String> content, String time, String likes, String theme){
        this.title = title;
        this.author = author;
        this.content = content;
        this.time = time;
        this.likes = likes;
        this.theme = theme;
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

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }
}
