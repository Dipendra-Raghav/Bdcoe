package com.example.bdcoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

public class Domains extends AppCompatActivity {
    private SliderLayout sliderLayout;

    ImageView webAkg,webBdcoe,webLinkdin,webInsta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domains);
        sliderLayout=findViewById(R.id.slider_s);
        webAkg=findViewById(R.id.webAkg);
        webBdcoe=findViewById(R.id.webBdcoe);
        webLinkdin=findViewById(R.id.webLinkdin);
        webInsta=findViewById(R.id.webInsta);

        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(3);
        setSliderViews();


        webAkg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.akgec.ac.in/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        webBdcoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.bdcoe.co.in/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        webInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/bdcoe/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        webLinkdin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.linkedin.com/school/big-data-centre-of-excellence/about/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
    private void setSliderViews() {
        for(int i=0;i<6;i++){
            DefaultSliderView sliderView=new DefaultSliderView(getApplicationContext());
            switch(i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bdcoe-c7aa7.appspot.com/o/Domain%2Fad.png?alt=media&token=4bfecb05-a7b8-4b88-9e77-84f14f80c606");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bdcoe-c7aa7.appspot.com/o/Domain%2Fbd.png?alt=media&token=e4af015d-cddc-4283-9982-3a80ea59fefa");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bdcoe-c7aa7.appspot.com/o/Domain%2Fcc.png?alt=media&token=2e0c94e9-1181-4c94-8e54-62724c5400ea");
                    break;

                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bdcoe-c7aa7.appspot.com/o/Domain%2Fds.png?alt=media&token=dcd1d023-9818-4e81-80b3-af3817ab78d7");
                    break;

                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bdcoe-c7aa7.appspot.com/o/Domain%2Fml.png?alt=media&token=d45d970b-24d9-44f2-bb03-3ba90e22f454");
                    break;
                case 5:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bdcoe-c7aa7.appspot.com/o/Domain%2Fwd.png?alt=media&token=6ab80260-e65e-45ab-b6c8-383d98c60dfe");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderLayout.addSliderView(sliderView);
        }
    }
}