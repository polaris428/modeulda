package com.example.modeulda.ModelSocial;

import com.example.modeulda.serverFiles.Packet;

public class Like extends Packet {
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


    public Like(){}
    public Like(String Theme, String DocName){
       this();
       this.Theme = Theme;
       this.DocName = DocName;
        PacketType = com.example.modeulda.serverFiles.PacketType.Like;
    }

}
