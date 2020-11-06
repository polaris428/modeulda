package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;
import com.google.firebase.firestore.auth.User;

public class UnFollow extends Packet {

    public User Source;

    public UnFollow() {
    }

    public UnFollow(User Source) {
        this();
        this.Source = Source;
        PacketType = com.example.modeulda.serverFiles.PacketType.UnFollow;
    }

    public User getSource() {
        return Source;
    }

    public void setSource(User source) {
        Source = source;
    }
}
