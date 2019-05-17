package com.overdev.nexuztrading;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**

 @author: Alberto Garcia - Francisco De Oliveira - Jose Cafaro
 Nexus Trading - App movil para carrito de compra
 Proyecto de la materia de Programación Bajo Ambiente Android en la UCAB
 @version 1.0.0. / 16-05-2019

 */

public class SplashScreen extends AppCompatActivity {

    /**
     * Este metodo callback que se ejecuta al iniciar el Activity. Luego espera 3 seg cargando
     * la barra de carga y mostrando el logo de la aplicación. Luego llama al MainActivity.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }//Cierre del método
}
