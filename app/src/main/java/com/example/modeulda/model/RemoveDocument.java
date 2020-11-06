package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

public class RemoveDocument extends Packet {
    public String DocName;

    public RemoveDocument() {
    }

    public RemoveDocument(String DocName) {
        this();
        this.DocName = DocName;
        PacketType = com.example.modeulda.serverFiles.PacketType.RemoveDocument;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String docName) {
        DocName = docName;
    }
}
