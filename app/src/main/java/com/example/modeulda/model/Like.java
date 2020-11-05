package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

public class Like extends Packet {
    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }
    public Like(){}
    public Like(Boolean like){
       this.like = like;
        PacketType = com.example.modeulda.serverFiles.PacketType.Like;
    }
    public Boolean like;
}
