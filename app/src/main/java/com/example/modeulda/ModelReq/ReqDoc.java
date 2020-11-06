package com.example.modeulda.ModelReq;

import com.example.modeulda.ModelUser.User;
import com.example.modeulda.serverFiles.Packet;

public class ReqDoc extends Packet {
    public ReqDoc(){}
    public ReqDoc(Boolean isPrivate,
                  User author, String docName){
        this();
        this.Author = author;
        this.DocName = docName;
        this.IsPrivate = isPrivate;
        PacketType = com.example.modeulda.serverFiles.PacketType.ReqDoc;
    }


    public Boolean getPrivate() {
        return IsPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        IsPrivate = aPrivate;
    }



    public String getDocName() {
        return DocName;
    }

    public void setDocName(String docName) {
        DocName = docName;
    }

    public Boolean IsPrivate;

    public com.example.modeulda.ModelUser.User getAuthor() {
        return Author;
    }

    public void setAuthor(com.example.modeulda.ModelUser.User author) {
        Author = author;
    }

    public com.example.modeulda.ModelUser.User Author;
    public String DocName;


}
