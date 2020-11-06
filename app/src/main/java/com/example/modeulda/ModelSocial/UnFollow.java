package com.example.modeulda.ModelSocial;

import com.example.modeulda.serverFiles.Packet;
import com.google.firebase.firestore.auth.User;

public class UnFollow extends Packet {

    public User Target;

    public UnFollow() {
    }

    public UnFollow(User Target) {
        this();
        this.Target = Target;
        PacketType = com.example.modeulda.serverFiles.PacketType.UnFollow;
    }

    public User getTarget() {
        return Target;
    }

    public void setTarget(User Target) {
       this.Target = Target;
    }
}
