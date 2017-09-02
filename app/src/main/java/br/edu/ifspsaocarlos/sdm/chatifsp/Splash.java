package br.edu.ifspsaocarlos.sdm.chatifsp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    private final int OPEN_MAIN_ACTIVITY = 0;
    private final int LOADING_TIME = 3000;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Message mensagem = new Message();
        mensagem.what = OPEN_MAIN_ACTIVITY;
        handler.sendMessageDelayed(mensagem, LOADING_TIME);
    }
    private Handler handler = new Handler(){
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case OPEN_MAIN_ACTIVITY:
                    SharedPreferences sharedPreferences = Utils.getPreferences(Splash.this);
                    Intent intent = new Intent(Splash.this,
                            sharedPreferences.contains(Utils.SP_CURRENT_USER)?MainActivity.class:
                                                                                       LoginActivity.class);
                    startActivity(intent);
                    finish();
                    break;
                default:
                    break;
            }
        }
    };
}
