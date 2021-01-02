package ru.ekbapp.b13_reborn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SpawnActivity extends AppCompatActivity {

    public static final String SETTINGS_S="SETTINGS_S";
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spawn);

        final TextView title=findViewById(R.id.textView);
        Animation titleAnimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.login_title);
        title.setAnimation(titleAnimation);
        sharedPreferences=getSharedPreferences(SETTINGS_S,MODE_PRIVATE);


    }
}