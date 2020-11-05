package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

public class Written extends Packet {
    public Written Written;
    public WrittenModel WrittenModel;
    public String id;

    public Written() {
        PacketType = PacketType.Written;
    }

    public Written(String id, WrittenModel wModel) {
        this.id = id;
        this.WrittenModel = wModel;
    }
}
