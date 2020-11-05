package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

public class UserModelForS extends Packet {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserModelForS(String id) {
        PacketType = com.example.modeulda.serverFiles.PacketType.UserModelForS;
        this.id = id;
    }

    public String id;
}
