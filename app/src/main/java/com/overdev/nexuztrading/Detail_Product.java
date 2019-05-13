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

import java.util.ArrayList;
import java.util.List;

public class Detail_Product extends AppCompatActivity {


    private TextView title;
    private TextView description;
    private ImageView image;

    private static final String TAG = "DetailActivity";

    public static final int TEXT_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__product);

        String titulo = getIntent().getStringExtra("titulo");
        String descripcion = getIntent().getStringExtra("descripcion");
        String imagen = getIntent().getStringExtra("imagen");
        Log.d("EJEMPLO", "A VER SI LLEGO " + titulo +" - " + descripcion +" - " + imagen);

        TextView title = findViewById(R.id.titulo);
        title.setText(titulo);
        TextView description = findViewById(R.id.descripcion);
        description.setText(descripcion);
        ImageView image = findViewById(R.id.imgFoto);
        String foto = imagen;
        image.setImageResource(getResources().getIdentifier(foto, "drawable", getPackageName()));





    }

}
