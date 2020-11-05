package com.example.modeulda.serverFiles;

public class LinkInfo extends Packet {
    public int LinkedClients;
    public int SearchRange;

    public LinkInfo() {
        PacketType = PacketType.LinkInfo;
    }

    public LinkInfo(int linkedClients, int searchRange) {
        LinkedClients = linkedClients;
        SearchRange = searchRange;
    }
}
