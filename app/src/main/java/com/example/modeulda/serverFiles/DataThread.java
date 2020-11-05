package com.example.modeulda.serverFiles;
import java.net.Socket;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

class DataThread extends Thread {
    private String data;
    private Socket socket;
    public DataThread(String data) {
        this.data = data;
    }

    public void run() {
        try {
            byte[] contentBuffer = data.getBytes(StandardCharsets.UTF_8);
            byte[] typeheader = ByteBuffer.allocate(4).putInt(0).array();
            byte[] header = ByteBuffer.allocate(4).putInt(contentBuffer.length).array();
            byte[] sendBuffer = new byte[typeheader.length + header.length + contentBuffer.length];
            System.arraycopy(typeheader, 0, sendBuffer, 0, typeheader.length);
            System.arraycopy(header, 0, sendBuffer, typeheader.length, header.length);
            System.arraycopy(contentBuffer, 0, sendBuffer, typeheader.length + header.length, contentBuffer.length);
            if (socket == null)
                return;
            OutputStream output = socket.getOutputStream();
            output.write(sendBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}