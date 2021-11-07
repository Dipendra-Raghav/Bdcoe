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

public class AboutUs extends AppCompatActivity {
    private SliderLayout sliderLayout;
   // ImageView webAkg,webBdcoe,webLinkdin,webInsta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        sliderLayout=findViewById(R.id.slider);
//        webAkg=findViewById(R.id.webAkg);
//        webBdcoe=findViewById(R.id.webBdcoe);
//        webLinkdin=findViewById(R.id.webLinkdin);
//        webInsta=findViewById(R.id.webInsta);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(1);
        setSliderViews();
//
//        webAkg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = "https://www.akgec.ac.in/";
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
//            }
//        });
//        webBdcoe.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = "http://www.bdcoe.co.in/";
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
//            }
//        });
//        webInsta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = "https://www.instagram.com/bdcoe/";
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
//            }
//        });
//        webLinkdin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = "https://www.linkedin.com/school/big-data-centre-of-excellence/about/";
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
//            }
//        });
    }

    private void setSliderViews() {
        for(int i=0;i<4;i++){
            DefaultSliderView sliderView=new DefaultSliderView(getApplicationContext());
            switch(i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bdcoe-c7aa7.appspot.com/o/slide%20Image%2Fbdcoe%20team.jpg?alt=media&token=a5ca6e46-b007-4bf5-97c0-d7f10f06e09b");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bdcoe-c7aa7.appspot.com/o/slide%20Image%2Fteam%202.jpg?alt=media&token=0882e189-d933-47d1-9fe5-feda0be62004");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bdcoe-c7aa7.appspot.com/o/slide%20Image%2Fteam%203.png?alt=media&token=749b7669-210a-476e-84ff-d92484c0e329");
                    break;

                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bdcoe-c7aa7.appspot.com/o/slide%20Image%2Fteam%203.jpg?alt=media&token=1652c99f-16cf-43c2-ad79-4adbf148be20");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderLayout.addSliderView(sliderView);
        }
    }
}