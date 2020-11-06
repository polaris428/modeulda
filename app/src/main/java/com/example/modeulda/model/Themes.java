package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

import java.util.List;

public class Themes extends Packet {
    public List<String> ThemeList;
public Themes(){ }
public Themes(List<String> themeList){
   this();
    this.ThemeList= themeList;
    PacketType = com.example.modeulda.serverFiles.PacketType.Themes;
}
    public List<String> getThemeList() {
        return ThemeList;
    }

    public void setThemeList(List<String> themeList) {
        ThemeList = themeList;
    }
}
