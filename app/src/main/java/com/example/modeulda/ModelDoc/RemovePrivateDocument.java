package com.example.modeulda.ModelDoc;

import com.example.modeulda.serverFiles.Packet;

public class RemovePrivateDocument extends Packet {
    public String DocName;

    public RemovePrivateDocument() {
    }

    public RemovePrivateDocument(String DocName) {
        this();
        this.DocName = DocName;
        PacketType = com.example.modeulda.serverFiles.PacketType.RemovePrivateDocument;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String docName) {
        DocName = docName;
    }
}
