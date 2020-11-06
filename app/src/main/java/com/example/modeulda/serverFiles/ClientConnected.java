package com.example.modeulda.serverFiles;

import com.example.modeulda.ModelUser.User;

public class ClientConnected extends Packet {
    public User ums;
    public Boolean Register;

    public Boolean getRegister() {
        return Register;
    }

    public void setRegister(Boolean register) {
        Register = register;
    }

    public ClientConnected(User user) {
    }

    public ClientConnected(User ums, Boolean register){
        this.ums = ums;
        this.Register = register;
        PacketType = com.example.modeulda.serverFiles.PacketType.ClientConnected;
    }
}
