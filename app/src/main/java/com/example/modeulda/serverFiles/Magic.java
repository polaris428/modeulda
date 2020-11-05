package com.example.modeulda.serverFiles;

import com.google.firebase.firestore.auth.User;

import org.w3c.dom.Document;


public class Magic {

    public Boolean TryAddDoc(Document doc){
        return true;
    }
    public Boolean RemoveDoc(String theme, String userId, String docName){
       return true;
    }
    public Boolean TryAddPrivateDoc(Document doc){
        return true;
    }
    public Boolean RemovePrivateDoc(String userId, String docName){
        return true;
    }
    public Boolean TryAddUser(User user){
        return true;
    }
    public Boolean RemoveUser(User user){
        return true;
    }
    public Boolean TryLike(String theme, String DocName){
        return true;
    }
    public Boolean TryUnlike(String theme, String DocName){
        return true;
    }
    public Boolean AddFollower(String TargetUserId, String SourceUserId){
        return true;
    }
    public Boolean RemoveFollower(String TargetUserId, String SourceUserId){
        return true;
    }

    //수정할 것 void -> doc
    public void GetUserDoc(String userid, String docname){
    }
    public void GetUserPrivateDoc(String userid, String docname ){

    }
    //수정할 것 void -> List

        //docOrder이 뭘까
    public void GetPublicDocThumb(String theme, int startIndex, int count ){
    }
    public void  GetPrivateDocThumb(String UserId, int startIndex, int count){}
    public void GetTheme(){
    }
}
