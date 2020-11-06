package com.example.modeulda.serverFiles;

import com.example.modeulda.model.UserModelForS;

public class ClientConnected extends Packet {
    public UserModelForS ums;
    public Boolean Register;

    public Boolean getRegister() {
        return Register;
    }

    public void setRegister(Boolean register) {
        Register = register;
    }

    public ClientConnected(UserModelForS userModelForS) {
    }

    public ClientConnected(UserModelForS ums, Boolean register){
        this.ums = ums;
        this.Register = register;
        PacketType = com.example.modeulda.serverFiles.PacketType.ClientConnected;
    }
}
