package com.overdev.nexuztrading;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Detail_Product extends AppCompatActivity {
    private String titulo, descripcion, imagen, foto;

    private static final String TAG = "DetailActivity";
    public static final String EXTRA_REPLY_TITLE = "com.overdev.nexuztrading.extra.REPLY";
    public static final String EXTRA_REPLY_DESCRIPTION = "com.overdev.nexuztrading.extra.REPLY_1";
    public static final String EXTRA_REPLY_IMAGE = "com.overdev.nexuztrading.extra.REPLY_2";
    public static final int TEXT_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__product);
        titulo = getIntent().getStringExtra("titulo");
        descripcion = getIntent().getStringExtra("descripcion");
        imagen = getIntent().getStringExtra("imagen");
        TextView title = findViewById(R.id.titulo);
        title.setText(titulo);
        TextView description = findViewById(R.id.descripcion);
        description.setText(descripcion);
        TextView history = findViewById(R.id.history);
        ImageView image = findViewById(R.id.imgFoto);
        foto = imagen;
        switch (imagen){
            case "camisa_aja_nc":
                history.setText("Hola que tal AJA");
                break;

            case "camisa_atl_nc":
                history.setText("Hola que tal ATL");
                break;

            case "camisa_bar_nc":
                history.setText("Hola que tal BAR");
                break;

            case "camisa_bay_nc":
                history.setText("Hola que tal BAY");
                break;

            case "camisa_ben_nc":
                history.setText("Hola que tal BEN");
                break;

            case "camisa_che_nc":
                history.setText("Hola que tal CHE");
                break;

            case "camisa_cit_nc":
                history.setText("Hola que tal CIT");
                break;

            case "camisa_dor_nc":
                history.setText("Hola que tal DOR");
                break;

            case "camisa_juv_nc":
                history.setText("Hola que tal JUV");
                break;

            case "camisa_liv_nc":
                history.setText("Hola que tal LIV");
                break;

            case "camisa_lyo_nc":
                history.setText("Hola que tal LYO");
                break;

            case "camisa_man_nc":
                history.setText("Hola que tal MAN");
                break;

            case "camisa_mar_nc":
                history.setText("Hola que tal MAR");
                break;

            case "camisa_mil_nc":
                history.setText("Hola que tal MIL");
                break;

            case "camisa_nap_nc":
                history.setText("Hola que tal NAP");
                break;

            case "camisa_por_nc":
                history.setText("Hola que tal POR");
                break;

            case "camisa_psg_nc":
                history.setText("Hola que tal PSG");
                break;

            case "camisa_rea_nc":
                history.setText("Hola que tal REA");
                break;

            case "camisa_tot_nc":
                history.setText("Hola que tal TOT");
                break;

            case "camisa_val_nc":
                history.setText("Hola que tal VAL");
                break;
        }
        image.setImageResource(getResources().getIdentifier(foto, "drawable", getPackageName()));

    }
}
