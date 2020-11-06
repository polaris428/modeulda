package com.example.modeulda.model;

import com.example.modeulda.serverFiles.Packet;

import java.util.List;

public class PrivatePageData extends Packet {
    public PrivatePageData() {
    }

    public PrivatePageData(List<Thumbnail> docThumbnailPage) {
        this();
        this.DocThumbnailPage = docThumbnailPage;
        PacketType = com.example.modeulda.serverFiles.PacketType.PrivatePageData;
    }

    public List<Thumbnail> getDocThumbnailPage() {
        return DocThumbnailPage;
    }

    public void setDocThumbnailPage(List<Thumbnail> docThumbnailPage) {
        DocThumbnailPage = docThumbnailPage;
    }

    public List<Thumbnail> DocThumbnailPage;
}
