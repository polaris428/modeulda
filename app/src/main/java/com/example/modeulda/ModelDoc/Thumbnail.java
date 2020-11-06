package com.example.modeulda.ModelDoc;

import com.example.modeulda.serverFiles.Packet;

public class Thumbnail extends Packet {
    public String Author;
    public String content;
    public int likes;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String title;
    public Thumbnail(){}
    public Thumbnail(String Author, String content, int likes, String title){
       this.Author = Author;
       this.content = content;
       this.likes = likes;
       this.title = title;
       PacketType = com.example.modeulda.serverFiles.PacketType.Thumbnail;
    }
    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String time;
}
