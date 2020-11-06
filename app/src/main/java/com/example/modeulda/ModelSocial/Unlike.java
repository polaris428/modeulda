package com.example.modeulda.ModelSocial;

import com.example.modeulda.serverFiles.Packet;

public class Unlike extends Packet {

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String docName) {
        DocName = docName;
    }

    public String Theme;
    public String DocName;


    public Unlike(){}
    public Unlike(String Theme, String DocName){
        this();
        this.Theme = Theme;
        this.DocName = DocName;
        PacketType = com.example.modeulda.serverFiles.PacketType.Unlike;
    }
}
