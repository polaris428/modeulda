package com.example.modeulda.serverFiles;

import com.example.modeulda.model.UserModelForS;

class ClientConnected extends Packet {
    public UserModelForS ums;

    public ClientConnected() {
        PacketType = com.example.modeulda.serverFiles.PacketType.ClientConnected;
    }

    public ClientConnected(UserModelForS ums){
        this();
        this.ums = ums;
    }
}
