package com.example.modeulda.ModelReq;

import com.example.modeulda.serverFiles.Packet;

public class ReqPrivatePageData extends Packet {
  public ReqPrivatePageData(){}
  public ReqPrivatePageData(int startIndex, int count){
      this();
      this.StartIndex = startIndex;
      this.Count = count;
      PacketType = com.example.modeulda.serverFiles.PacketType.ReqPrivatePageData;
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

    public int StartIndex;
    public int Count;

}
