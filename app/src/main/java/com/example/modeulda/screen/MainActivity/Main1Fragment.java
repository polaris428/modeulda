package com.example.modeulda.screen.MainActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.modeulda.R;
import com.example.modeulda.databinding.FragmentMainBinding;
import com.example.modeulda.model.ThemeModel;

import java.net.Socket;


public class Main1Fragment extends Fragment {

    public static Main1Fragment newInstance() {
        return new Main1Fragment();
    }
    private ObservableArrayList<ThemeModel> items = new ObservableArrayList<>();

    private Context mContext;
    private FragmentMainBinding binding;

    private Socket socket;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);

        binding.setItems(items);

        binding.recMain1Theme.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));

        binding.txtMain1to2.setOnClickListener(view -> switchFinF());

        ThemeAdapter adapter = new ThemeAdapter();
        binding.recMain1Theme.setAdapter(adapter);

        adapter.setOnItemClickListener((view, item) -> {

        });

        return binding.getRoot();
    }

    //주제 불러오기
    public void onResume() {
        getThemes();
        super.onResume();
    }

    private void getThemes() {
        items.clear();

    }

    //오늘의 주제로 넘어가기
    private void switchFinF() {
        ((MainActivity) getActivity()).switchFragment(new Main2Fragment());
    }

    //서버 관련

//
//    public void AsyncSend(String data) {
//        DataThread thread = new DataThread(data);
//        thread.start();
//    }
//    public void AsyncConnect(String initData, RecivedDataFunc recivedDataFunc) {
//        ConnectThread thread = new ConnectThread(initData, recivedDataFunc);
//        thread.start();
//    }
//
//    public void AsyncListening(RecivedDataFunc recivedDataFunc) {
//        ListenerThread thread = new ListenerThread(recivedDataFunc);
//        thread.start();
//    }
//    class ConnectThread extends Thread {
//        RecivedDataFunc recivedDataFunc;
//        String connectPacket;
//
//        public ConnectThread(String connectPacket, RecivedDataFunc recivedDataFunc) {
//            this.connectPacket = connectPacket;
//            this.recivedDataFunc = recivedDataFunc;
//        }
//
//
//        public void run() {
//            try {
//                socket = new Socket("112.154.88.112", 20310);
//
//                AsyncListening(recivedDataFunc);
//                AsyncSend(connectPacket);
//
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Toast.makeText(getApplicationContext(), "Connected", Toast.LENGTH_LONG).show();
//                    }
//                });
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public <T> String ObjectToJson(T object) {
//        Gson json = new Gson();
//        return json.toJson(object);
//    }
}