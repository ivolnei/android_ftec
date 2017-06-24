package br.com.trinopolo.meuappdeimagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivTime = (ImageView) findViewById(R.id.ivTime);

        if(savedInstanceState != null) {
            ivTime.setImageResource(R.drawable.lakers);
        } else {
            ivTime.setImageResource(R.drawable.chicago_bulls);
        }
    }
}
