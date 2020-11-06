package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;
import com.google.firebase.firestore.auth.User;

public class Follow extends Packet {
    public User Source;

    public Follow() {
    }

    public Follow(User Source) {
        this();
        this.Source = Source;
        PacketType = com.example.modeulda.serverFiles.PacketType.Follow;
    }

    public User getSource() {
        return Source;
    }

    public void setSource(User source) {
        Source = source;
    }
}
