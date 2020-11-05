package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

public class AlertModel extends Packet {

    private String who;
    private int type;

    public AlertModel() {
    };

    public AlertModel(String who, int type) {
        this.who = who;
        this.type = type;
       PacketType = PacketType.AlertModel;
    }
    //type0: 글을 올렸습니다
    //type1: 좋아요를 누르셨습니다
    //type2: 팔로우했습니다


    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


}
