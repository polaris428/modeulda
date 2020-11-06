package com.example.modeulda.ModelUser;

import com.example.modeulda.serverFiles.Packet;

public class User extends Packet {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User(String id) {
        PacketType = com.example.modeulda.serverFiles.PacketType.UserModelForS;
        this.id = id;
    }

    public String id;
}
