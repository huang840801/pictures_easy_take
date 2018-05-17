package com.example.hello.myfirstapp1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class page2 extends AppCompatActivity {

    ImageView imageView;
    Button button;
    Random r;
    Integer[] images= {
            R.drawable.upper1,
            R.drawable.upper2,
            R.drawable.upper4,
            R.drawable.upper5,
            R.drawable.upper6,
            R.drawable.upper7,
            R.drawable.upper8,
            R.drawable.upper9,
            R.drawable.upper10,
            R.drawable.upper11,
            R.drawable.upper12,
            R.drawable.upper13,
            R.drawable.upper14,
            R.drawable.upper15,
            R.drawable.upper16,
            R.drawable.upper17,
            R.drawable.upper18,
            R.drawable.upper19,
            R.drawable.upper20,
            R.drawable.upper21,
            R.drawable.upper22,
            R.drawable.upper23,
            R.drawable.upper24,
            R.drawable.upper25,
            R.drawable.upper26,
            R.drawable.upper27,
            R.drawable.upper28,
            R.drawable.upper29,
            R.drawable.upper30,




    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);


        Button btn_B=findViewById(R.id.btn_B);
        btn_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        imageView=(ImageView)findViewById(R.id.imageView);

        button=(Button)findViewById(R.id.button);

        r=new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.setImageResource(images[r.nextInt(images.length)]);

            }
        });


    }
}
