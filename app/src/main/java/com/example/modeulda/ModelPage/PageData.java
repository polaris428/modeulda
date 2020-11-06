package com.example.modeulda.ModelPage;

import com.example.modeulda.ModelDoc.Thumbnail;
import com.example.modeulda.serverFiles.Packet;

import java.util.List;

public class PageData extends Packet{
    public List<Thumbnail> DocThumbnailPage;
    public PageData(){}
    public PageData(List<Thumbnail> docThumbnailPage){
        this();
        this.DocThumbnailPage = docThumbnailPage;
        PacketType = com.example.modeulda.serverFiles.PacketType.PageData;
    }
    public List<Thumbnail> getDocThumbnailPage() {
        return DocThumbnailPage;
    }

    public void setDocThumbnailPage(List<Thumbnail> docThumbnailPage) {
        DocThumbnailPage = docThumbnailPage;
    }
}
