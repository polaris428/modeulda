package com.example.modeulda.screen.MainActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.modeulda.R;
import com.example.modeulda.Util.UserCache;
import com.example.modeulda.databinding.FragmentTListBinding;
import com.example.modeulda.model.Thumbnail;
import com.example.modeulda.model.UserModelForS;
import com.example.modeulda.serverFiles.ClientConnected;
import com.example.modeulda.serverFiles.LinkInfo;
import com.example.modeulda.serverFiles.Packet;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;


public class TListFragment extends Fragment {
    private FragmentTListBinding binding;
    private Context mContext;
    private ObservableArrayList<Thumbnail> items = new ObservableArrayList<>();
    private int showMe;
    private Socket socket;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_t_list, container, false);

        binding.setItem(items);

        binding.recTlist.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));

        TlistAdapter adapter = new TlistAdapter();
        binding.recTlist.setAdapter(adapter);
        adapter.setOnItemClickListener((view, item) -> {

        });

        binding.spiTlistmenu.setOnItemClickListener((adapterView, view, position, id) -> {
            if (position == 0) {
                showMe = 0;
            } else if (position == 1) {
                showMe = 1;
            }
        });
        return binding.getRoot();
    }

    public void setTheme(String theme){
        binding.setTheme(theme);
    }
    public void setItems(ObservableArrayList<Thumbnail> items){
        this.items.addAll(items);
    }

    //주제 불러오기
    public void onResume() {
        super.onResume();
        try {
            if (socket != null)
                socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        Toast.makeText(getActivity().getApplicationContext(), "Connecting to server...", Toast.LENGTH_SHORT).show();

        ClientConnected clientConnected = new ClientConnected(new UserModelForS(
                UserCache.getUser(mContext).getId()));
        String ccdString = ObjectToJson(clientConnected);
        AsyncConnect(ccdString, (string) -> {
            Gson gson = new Gson();
            Packet convertedObject = gson.fromJson(string, Packet.class);
            switch (convertedObject.PacketType) {
                case LinkInfo:
                    LinkInfo linkInfo = (LinkInfo) gson.fromJson(string, LinkInfo.class);
                    break;
                case Thumbnail:
//                    Thumbnail[] thumbnails = gson.fromJson(string, Thumbnail[].class);
//                    List<Thumbnail> list = thumbnails.asList(Thumbnail);
//                    this.setItems(thumbnails);

            }
        });
    }
//    ThemeModel themeModel = (ThemeModel) gson.fromJson(string, ThemeModel.class);
//                    fMain1.setThemes(themeModel);

    //json으로
    public <T> String ObjectToJson(T object) {
        Gson json = new Gson();
        return json.toJson(object);
    }

    public void AsyncDelay(int initData, DelayFunc delayFunc) {
        DelayThread thread = new DelayThread(initData, delayFunc);
        thread.start();
    }

    public void AsyncConnect(String initData, RecivedDataFunc recivedDataFunc) {
        ConnectThread thread = new ConnectThread(initData, recivedDataFunc);
        thread.start();
    }

    public void AsyncListening(RecivedDataFunc recivedDataFunc) {
        ListenerThread thread = new ListenerThread(recivedDataFunc);
        thread.start();
    }

    public void AsyncSend(String data) {
        DataThread thread = new DataThread(data);
        thread.start();
    }

interface DelayFunc {
    void OnDelayed();
}

//오류 없애기 위해서 지연시간을 주는듯
class DelayThread extends Thread {
    DelayFunc delayFunc;
    int delay;

    public DelayThread(int delay, DelayFunc delayFunc) {
        this.delay = delay;
        this.delayFunc = delayFunc;
    }

    public void run() {

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getActivity().runOnUiThread(() -> delayFunc.OnDelayed());
    }
}

//데이터를 받는거인 듯
interface RecivedDataFunc {
    void OnRecivedData(String data);
}

class ListenerThread extends Thread {
    RecivedDataFunc Func;
    byte[] data;

    public ListenerThread(RecivedDataFunc recivedDataFunc) {
        this.Func = recivedDataFunc;
    }

    public void run() {
        try {
            while (true) {
                InputStream input = socket.getInputStream();

                byte[] header = new byte[4];
                int recivedBytes = input.read(header);
                while (recivedBytes < 4) {
                    input.read(header);
                }
                ByteBuffer wrapped = ByteBuffer.wrap(header);
                int contentsize = wrapped.getInt();

                data = new byte[contentsize];
                int recivedContentBytes = 0;
                while (recivedContentBytes < contentsize) {
                    recivedContentBytes += input.read(data);
                }
                getActivity().runOnUiThread(() -> Func.OnRecivedData(new String(data, StandardCharsets.UTF_8)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//데이터를 전송할 수 있는 형식으로 바꾸는건가..
class DataThread extends Thread {
    private String data;

    public DataThread(String data) {
        this.data = data;
    }

    public void run() {
        try {
            byte[] contentBuffer = data.getBytes(StandardCharsets.UTF_8);
            byte[] header = ByteBuffer.allocate(4).putInt(contentBuffer.length).array();
            byte[] sendBuffer = new byte[header.length + contentBuffer.length];
            System.arraycopy(header, 0, sendBuffer, 0, header.length);
            System.arraycopy(contentBuffer, 0, sendBuffer, header.length, contentBuffer.length);
            if (socket == null)
                return;
            OutputStream output = socket.getOutputStream();
            output.write(sendBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//서버에 연결
class ConnectThread extends Thread {
    RecivedDataFunc recivedDataFunc;
    String connectPacket;

    public ConnectThread(String connectPacket, RecivedDataFunc recivedDataFunc) {
        this.connectPacket = connectPacket;
        this.recivedDataFunc = recivedDataFunc;
    }

    public void run() {
        try {
            socket = new Socket("112.154.88.112", 20310);

            AsyncListening(recivedDataFunc);
            AsyncSend(connectPacket);

            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(getActivity().getApplicationContext(), "Connected", Toast.LENGTH_LONG).show();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}