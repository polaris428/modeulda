package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

public class RemoveDocument extends Packet {
    public String DocName;
    public String Theme;

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }

    public RemoveDocument() {
    }

    public RemoveDocument(String DocName, String theme) {
        this();
        this.DocName = DocName;
        this.Theme = theme;
        PacketType = com.example.modeulda.serverFiles.PacketType.RemoveDocument;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String docName) {
        DocName = docName;
    }
}
