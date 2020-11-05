package com.example.modeulda.screen.MainActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.modeulda.R;
import com.example.modeulda.databinding.ActivityMainBinding;
import com.example.modeulda.screen.AlertActivity.AlertFragment;
import com.example.modeulda.screen.MyActivity.MyFragment;
import com.example.modeulda.screen.SearchActivity.SearchFragment;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.bottomMain.setOnNavigationItemSelectedListener(item -> {
                switch (item.getItemId()) {
                    case R.id.action_1:
                        switchFragment(Main1Fragment.newInstance());
                        break;
                    case R.id.action_2:
                        switchFragment(SearchFragment.newInstance());
                        break;
                    case R.id.action_3:
                        switchFragment(AlertFragment.newInstance());
                        break;
                    case R.id.action_4:
                        switchFragment(MyFragment.newInstance());
                        break;
                }
            return true;
        });
        switchFragment(Main1Fragment.newInstance());

    }


//switchFragment
    public void switchFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_main, fragment);
        transaction.commit();
    }


    //Listener Thread
    class ListenerThread extends Thread{
        RecivedDataFunc Func;
        byte[] data;
        private Socket socket;
        public ListenerThread(RecivedDataFunc recivedDataFunc) {
            this.Func = recivedDataFunc;
        }

        public void run() {
            try {
                while (true) {
                    InputStream input = socket.getInputStream();
                    byte[] header = new byte[8];
                    int recivedBytes = input.read(header);
                    while (recivedBytes <= 8) {
                        recivedBytes += input.read(header);
                    }
                    ByteBuffer wrapped = ByteBuffer.wrap(header, 4, 4);
                    int contentsize = wrapped.getInt();

                    data = new byte[contentsize];
                    int recivedContentBytes = 0;
                    while (recivedContentBytes < contentsize) {
                        recivedContentBytes += input.read(data);
                    }
                    runOnUiThread(() -> Func.OnRecivedData(new String(data, StandardCharsets.UTF_8)));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    







    interface RecivedDataFunc {
        void OnRecivedData(String data);
    }
}