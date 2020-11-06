package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

public class ReqPageData extends Packet {
    public String Theme;
    public int StartIndex;
    public int Count;
    public ReqPageData(){}
    public ReqPageData(String theme, int startIndex, int count){
       this();
        this.Theme = theme;
        this.StartIndex = startIndex;
        this.Count = count;
        PacketType = com.example.modeulda.serverFiles.PacketType.ReqPageData;
    }
}
