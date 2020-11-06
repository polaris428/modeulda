package com.example.modeulda.ModelDoc;

import com.example.modeulda.serverFiles.Packet;

public class PDoc extends Packet {
    public PDoc() {
    }

    public PDoc(Document document) {
        this();
        this.doc = document;
        PacketType = com.example.modeulda.serverFiles.PacketType.PDoc;
    }


    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    public Document doc;

}
