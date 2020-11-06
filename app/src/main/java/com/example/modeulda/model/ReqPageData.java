package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

public class ReqPageData extends Packet {
    public String getTheme() {
        return Theme;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }

    public int getStartIndex() {
        return StartIndex;
    }

    public void setStartIndex(int startIndex) {
        StartIndex = startIndex;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public com.example.modeulda.model.DocOrder getDocOrder() {
        return DocOrder;
    }

    public void setDocOrder(com.example.modeulda.model.DocOrder docOrder) {
        DocOrder = docOrder;
    }

    public String Theme;
    public int StartIndex;
    public int Count;
    public DocOrder DocOrder;
    public ReqPageData(){}

    public ReqPageData(String theme, int startIndex, int count, DocOrder docOrder){
       this();
        this.Theme = theme;
        this.StartIndex = startIndex;
        this.Count = count;
        this.DocOrder = docOrder;
        PacketType = com.example.modeulda.serverFiles.PacketType.ReqPageData;
    }
}
