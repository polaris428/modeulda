package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

public class Thumbnail extends Packet {
    public String Author;
    public String Thumb;
    public int likes;
    public Thumbnail(){}
    public Thumbnail(String Author, String Thumb, int likes){
       this.Author = Author;
       this.Thumb = Thumb;
       this.likes = likes;
       PacketType = com.example.modeulda.serverFiles.PacketType.Thumbnail;
    }
    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getThumb() {
        return Thumb;
    }

    public void setThumb(String thumb) {
        Thumb = thumb;
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
