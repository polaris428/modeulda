package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

import org.w3c.dom.Document;

public class PDoc extends Packet {
    public PDoc() {
    }

    public PDoc(Document doc) {
        this();
        this.Doc = doc;
    }

    public Document getDoc() {
        return Doc;
    }

    public void setDoc(Document doc) {
        Doc = doc;
    }

    public Document Doc;

}
