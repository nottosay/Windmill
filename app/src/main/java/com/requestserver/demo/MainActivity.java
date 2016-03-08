package com.requestserver.demo;

import android.app.Activity;
import android.os.Bundle;

import com.requestserver.RequestClient;
import com.requestserver.callback.Callback;

import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RequestClient.post().url("").build().execute(new Callback() {
            @Override
            public Object parseNetworkResponse(Response response) throws Exception {
                return null;
            }

            @Override
            public void onError(Call call, Exception e) {

            }

            @Override
            public void onResponse(Object response) {

            }
        });
    }
}