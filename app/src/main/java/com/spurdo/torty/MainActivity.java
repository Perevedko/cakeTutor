package com.spurdo.torty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends Activity{

    private AdView mAdView;

    EditText editText;

    ListView list;
    String[] itemname ={
            "Простой торт",
            "Сметанник шоколадный",
            "Воздушный сникерс",
            "Творожный крем с кофе",
            "Медовый с заварным кремом",
            "С фруктами без выпечки",
            "Наполеон",
            "Шоколадный с грушевым кремом",
            "Блинный с клубникой",
            "Бискитный с кремом",
            "Слоенный со сгущенкой",
            "Морковный"
    };

    String[] itemname2 ={
            "30 минут",
            "1 час",
            "1 час",
            "10 минут",
            "2 часа",
            "1 час",
            "3 часа",
            "1 час",
            "3 часа",
            "1 час",
            "45 минут",
            "1 час"
    };

    Integer[] imgid={
            R.drawable.b1,
            R.drawable.b2,
            R.drawable.b3,
            R.drawable.b4,
            R.drawable.b5,
            R.drawable.b6,
            R.drawable.b7,
            R.drawable.b8,
            R.drawable.b9,
            R.drawable.b10,
            R.drawable.b11,
            R.drawable.b12
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,
                "ca-app-pub-1950220727109099~3026136093");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, itemname2, imgid);
        list=(ListView)findViewById(R.id.list);
        //editText=(EditText)findViewById(R.id.txtsearch);
        list.setAdapter(adapter);




                list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                if (position==0) {
                    Intent myintent = new Intent(view.getContext(), Page01Activity.class);
                    startActivityForResult(myintent, 0);
                }

                if (position==1) {
                    Intent myintent = new Intent(view.getContext(), Page02Activity.class);
                    startActivityForResult(myintent, 1);
                }

                if (position==2) {
                    Intent myintent = new Intent(view.getContext(), Page03Activity.class);
                    startActivityForResult(myintent, 2);
                }

                if (position==3) {
                    Intent myintent = new Intent(view.getContext(), Page04Activity.class);
                    startActivityForResult(myintent, 3);
                }

                if (position==4) {
                    Intent myintent = new Intent(view.getContext(), Page05Activity.class);
                    startActivityForResult(myintent, 4);
                }

                if (position==5) {
                    Intent myintent = new Intent(view.getContext(), Page06Activity.class);
                    startActivityForResult(myintent, 5);
                }

                if (position==6) {
                    Intent myintent = new Intent(view.getContext(), Page07Activity.class);
                    startActivityForResult(myintent, 6);
                }

                if (position==7) {
                    Intent myintent = new Intent(view.getContext(), Page08Activity.class);
                    startActivityForResult(myintent, 7);
                }

                if (position==8) {
                    Intent myintent = new Intent(view.getContext(), Page09Activity.class);
                    startActivityForResult(myintent, 8);
                }

                if (position==9) {
                    Intent myintent = new Intent(view.getContext(), Page10Activity.class);
                    startActivityForResult(myintent, 9);
                }

                if (position==10) {
                    Intent myintent = new Intent(view.getContext(), Page11Activity.class);
                    startActivityForResult(myintent, 10);
                }

                if (position==11) {
                    Intent myintent = new Intent(view.getContext(), Page12Activity.class);
                    startActivityForResult(myintent, 11);
                }
                }
        });
    }
}