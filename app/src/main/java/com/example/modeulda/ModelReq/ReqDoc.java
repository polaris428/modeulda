package com.example.modeulda.ModelReq;

import com.example.modeulda.serverFiles.Packet;
import com.google.firebase.firestore.auth.User;

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

    public User getAuthor() {
        return Author;
    }

    public void setAuthor(User author) {
        Author = author;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String docName) {
        DocName = docName;
    }

    public Boolean IsPrivate;
    public User Author;
    public String DocName;


}
