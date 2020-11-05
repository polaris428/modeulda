package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

public class ThemeModel extends Packet {
    private String InRE;
    private String InTop;

public ThemeModel(){}
public ThemeModel(String theme){
    this.InRE= theme;
    this.InTop= theme;
    PacketType = com.example.modeulda.serverFiles.PacketType.ThemeModel;
}
    public String getInRE() {
        return InRE;
    }

    public void setInRE(String inRE) {
        InRE = inRE;
    }

    public String getInTop() {
        return InTop;
    }

    public void setInTop(String inTop) {
        InTop = inTop;
    }

}
