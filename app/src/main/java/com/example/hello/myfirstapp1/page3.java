package com.example.hello.myfirstapp1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class page3 extends AppCompatActivity {

    ImageView imageView;
    Button button;
    Random r;

    Integer[] images={
            R.drawable.full1,
            R.drawable.full2,
            R.drawable.full3,
            R.drawable.full4,
            R.drawable.full5,
            R.drawable.full6,
            R.drawable.full7,
            R.drawable.full8,
            R.drawable.full9,
            R.drawable.full10,
            R.drawable.full11,
            R.drawable.full12,
            R.drawable.full13,
            R.drawable.full14,
            R.drawable.full15,
            R.drawable.full16,
            R.drawable.full17,
            R.drawable.full18,
            R.drawable.full19,
            R.drawable.full20,
            R.drawable.full21,
            R.drawable.full22,
            R.drawable.full23,
            R.drawable.full24,
            R.drawable.full25,
            R.drawable.full26,
            R.drawable.full27,
            R.drawable.full28,
            R.drawable.full29,
            R.drawable.full30,



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        Button btn_B=findViewById(R.id.btn_B);
        btn_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imageView=findViewById(R.id.imageView);
        button=findViewById(R.id.button);
        r=new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.setImageResource(images[r.nextInt(images.length)]);
            }
        });
    }
}
