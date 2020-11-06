package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;
import com.google.firebase.firestore.auth.User;

public class Follow extends Packet {
    public User Target;

    public Follow() {
    }

    public Follow(User Target) {
        this();
        this.Target = Target;
        PacketType = com.example.modeulda.serverFiles.PacketType.Follow;
    }

    public User getTarget() {
        return Target;
    }

    public void setTarget(User Target) {
       this.Target = Target;
    }
}
