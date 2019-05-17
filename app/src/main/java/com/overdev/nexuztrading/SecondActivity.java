package com.overdev.nexuztrading;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
/**

 @author: Alberto Garcia - Francisco De Oliveira - Jose Cafaro
 Nexus Trading - App movil para carrito de compra
 Proyecto de la materia de Programación Bajo Ambiente Android en la UCAB
 @version 1.0.0. / 16-05-2019

 */

public class SecondActivity extends AppCompatActivity {
    private TextView title, description;
    private String title1, description1;

    public static final String EXTRA_REPLY_TITLE = "com.overdev.nexuztrading.extra.REPLY";
    public static final String EXTRA_REPLY_DESCRIPTION = "com.overdev.nexuztrading.extra.REPLY_1";
    public static final String EXTRA_REPLY_IMAGE = "com.overdev.nexuztrading.extra.REPLY_2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Real Madrid
     */
    public void sendData1(View view) {
        title = findViewById(R.id.text_item1);
        description = findViewById(R.id.text_description1);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_rea_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Milan
     */
    public void sendData2(View view) {
        title = findViewById(R.id.text_item2);
        description = findViewById(R.id.text_description2);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_mil_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Barcelona
     */
    public void sendData3(View view) {
        title = findViewById(R.id.text_item3);
        description = findViewById(R.id.text_description3);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_bar_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Liverpool
     */
    public void sendData4(View view) {
        title = findViewById(R.id.text_item4);
        description = findViewById(R.id.text_description4);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_liv_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Bayern Munich
     */
    public void sendData5(View view) {
        title = findViewById(R.id.text_item5);
        description = findViewById(R.id.text_description5);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_bay_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Ajax
     */
    public void sendData6(View view) {
        title = findViewById(R.id.text_item6);
        description = findViewById(R.id.text_description6);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_aja_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Manchester United
     */
    public void sendData7(View view) {
        title = findViewById(R.id.text_item7);
        description = findViewById(R.id.text_description7);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_man_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Juventus
     */
    public void sendData8(View view) {
        title = findViewById(R.id.text_item8);
        description = findViewById(R.id.text_description8);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_juv_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Benfica
     */
    public void sendData9(View view) {
        title = findViewById(R.id.text_item9);
        description = findViewById(R.id.text_description9);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_ben_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Porto
     */
    public void sendData10(View view) {
        title = findViewById(R.id.text_item10);
        description = findViewById(R.id.text_description10);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_por_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Marsella
     */
    public void sendData11(View view) {
        title = findViewById(R.id.text_item11);
        description = findViewById(R.id.text_description11);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_mar_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Chelsea
     */
    public void sendData12(View view) {
        title = findViewById(R.id.text_item12);
        description = findViewById(R.id.text_description12);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_che_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Dormunt
     */
    public void sendData13(View view) {
        title = findViewById(R.id.text_item13);
        description = findViewById(R.id.text_description13);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_dor_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Atletico
     */
    public void sendData14(View view) {
        title = findViewById(R.id.text_item14);
        description = findViewById(R.id.text_description14);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_atl_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }


    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: City
     */
    public void sendData15(View view) {
        title = findViewById(R.id.text_item15);
        description = findViewById(R.id.text_description15);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_cit_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Lyon
     */
    public void sendData16(View view) {
        title = findViewById(R.id.text_item16);
        description = findViewById(R.id.text_description16);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_lyo_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Napoli
     */
    public void sendData17(View view) {
        title = findViewById(R.id.text_item17);
        description = findViewById(R.id.text_description17);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_nap_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: PSG
     */
    public void sendData18(View view) {
        title = findViewById(R.id.text_item18);
        description = findViewById(R.id.text_description18);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_psg_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Tottenham
     */
    public void sendData19(View view) {
        title = findViewById(R.id.text_item19);
        description = findViewById(R.id.text_description19);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_tot_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad MainActivity.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se usa el tipo de dato Bitmap para enviar la imagen de una activity a otra
     * Esto para el caso del equipo de futbol de: Valencia
     */
    public void sendData20(View view) {
        title = findViewById(R.id.text_item20);
        description = findViewById(R.id.text_description20);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_val_nc);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title1);
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description1);
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Real Madrid
     */
    public void sendDetail1(View view) {
        title = findViewById(R.id.text_item1);
        description = findViewById(R.id.text_description1);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_rea_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Milan
     */
    public void sendDetail2(View view) {
        title = findViewById(R.id.text_item2);
        description = findViewById(R.id.text_description2);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_mil_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Barcelona
     */
    public void sendDetail3(View view) {
        title = findViewById(R.id.text_item3);
        description = findViewById(R.id.text_description3);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_bar_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Liverpool
     */
    public void sendDetail4(View view) {
        title = findViewById(R.id.text_item4);
        description = findViewById(R.id.text_description4);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_liv_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Bayern Munich
     */
    public void sendDetail5(View view) {
        title = findViewById(R.id.text_item5);
        description = findViewById(R.id.text_description5);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_bay_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Ajax
     */
    public void sendDetail6(View view) {
        title = findViewById(R.id.text_item6);
        description = findViewById(R.id.text_description6);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_aja_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Manchester United
     */
    public void sendDetail7(View view) {
        title = findViewById(R.id.text_item7);
        description = findViewById(R.id.text_description7);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_man_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Juventus
     */
    public void sendDetail8(View view) {
        title = findViewById(R.id.text_item8);
        description = findViewById(R.id.text_description8);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_juv_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Benfica
     */
    public void sendDetail9(View view) {
        title = findViewById(R.id.text_item9);
        description = findViewById(R.id.text_description9);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_ben_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Porto
     */
    public void sendDetail10(View view) {
        title = findViewById(R.id.text_item10);
        description = findViewById(R.id.text_description10);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_por_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Marsella
     */
    public void sendDetail11(View view) {
        title = findViewById(R.id.text_item11);
        description = findViewById(R.id.text_description11);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_mar_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Chelsea
     */
    public void sendDetail12(View view) {
        title = findViewById(R.id.text_item12);
        description = findViewById(R.id.text_description12);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_che_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Dormunt
     */
    public void sendDetail13(View view) {
        title = findViewById(R.id.text_item13);
        description = findViewById(R.id.text_description13);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_dor_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Atletico de Madrid
     */
    public void sendDetail14(View view) {
        title = findViewById(R.id.text_item14);
        description = findViewById(R.id.text_description14);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_atl_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: City
     */
    public void sendDetail15(View view) {
        title = findViewById(R.id.text_item15);
        description = findViewById(R.id.text_description15);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_cit_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Lyon
     */
    public void sendDetail16(View view) {
        title = findViewById(R.id.text_item16);
        description = findViewById(R.id.text_description16);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_lyo_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Napoli
     */
    public void sendDetail17(View view) {
        title = findViewById(R.id.text_item17);
        description = findViewById(R.id.text_description17);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_nap_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: PSG
     */
    public void sendDetail18(View view) {
        title = findViewById(R.id.text_item18);
        description = findViewById(R.id.text_description18);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_psg_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Tottenham
     */
    public void sendDetail19(View view) {
        title = findViewById(R.id.text_item19);
        description = findViewById(R.id.text_description19);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_tot_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }

    /**
     * Este metodo envia los datos de la view seleccionada a la actividad Detalle_Product.
     * Se envia el titulo, descripcion e imagen por medio de los Intentd
     * Se envia el nombre del recurso por medio de un String, para proceder a bsucarlo en el detalle del producto
     * Esto para el caso del equipo de futbol de: Valencia
     */
    public void sendDetail20(View view) {
        title = findViewById(R.id.text_item20);
        description = findViewById(R.id.text_description20);
        Intent intent = new Intent(this, Detail_Product.class);
        String img = "camisa_val_nc";
        title1 = title.getText().toString();
        description1 = description.getText().toString();
        intent.putExtra("titulo", title1);
        intent.putExtra("descripcion", description1);
        intent.putExtra("imagen", img);
        startActivity(intent);

    }
}
