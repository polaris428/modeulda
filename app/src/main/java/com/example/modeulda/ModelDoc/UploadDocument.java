package com.example.modeulda.ModelDoc;

import com.example.modeulda.serverFiles.Packet;

import org.w3c.dom.Document;

public class UploadDocument extends Packet {
    public Document doc;
public UploadDocument(){}
public UploadDocument(Document doc){
    this();
    this.doc = doc;
    PacketType = com.example.modeulda.serverFiles.PacketType.UploadDocument;
}
    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }
}
