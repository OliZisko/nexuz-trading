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

public class SecondActivity extends AppCompatActivity {
    private TextView title, description;
    public static final String EXTRA_REPLY_TITLE = "com.overdev.nexuztrading.extra.REPLY";
    public static final String EXTRA_REPLY_DESCRIPTION = "com.overdev.nexuztrading.extra.REPLY_1";
    public static final String EXTRA_REPLY_IMAGE = "com.overdev.nexuztrading.extra.REPLY_2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void sendData1(View view) {
        title = findViewById(R.id.text_item1);
        description = findViewById(R.id.text_description1);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_rea);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData2(View view) {
        title = findViewById(R.id.text_item2);
        description = findViewById(R.id.text_description2);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_mil);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData3(View view) {
        title = findViewById(R.id.text_item3);
        description = findViewById(R.id.text_description3);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_bar);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData4(View view) {
        title = findViewById(R.id.text_item4);
        description = findViewById(R.id.text_description4);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_liv);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData5(View view) {
        title = findViewById(R.id.text_item5);
        description = findViewById(R.id.text_description5);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_bay);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData6(View view) {
        title = findViewById(R.id.text_item6);
        description = findViewById(R.id.text_description6);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_aja);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData7(View view) {
        title = findViewById(R.id.text_item7);
        description = findViewById(R.id.text_description7);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_man);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData8(View view) {
        title = findViewById(R.id.text_item8);
        description = findViewById(R.id.text_description8);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_juv);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData9(View view) {
        title = findViewById(R.id.text_item9);
        description = findViewById(R.id.text_description9);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_ben);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData10(View view) {
        title = findViewById(R.id.text_item10);
        description = findViewById(R.id.text_description10);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_por);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData11(View view) {
        title = findViewById(R.id.text_item11);
        description = findViewById(R.id.text_description11);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_mar);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData12(View view) {
        title = findViewById(R.id.text_item12);
        description = findViewById(R.id.text_description12);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_che);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData13(View view) {
        title = findViewById(R.id.text_item13);
        description = findViewById(R.id.text_description13);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_dor);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData14(View view) {
        title = findViewById(R.id.text_item14);
        description = findViewById(R.id.text_description14);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_atl);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData15(View view) {
        title = findViewById(R.id.text_item15);
        description = findViewById(R.id.text_description15);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_cit);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData16(View view) {
        title = findViewById(R.id.text_item16);
        description = findViewById(R.id.text_description16);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_lyo);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData17(View view) {
        title = findViewById(R.id.text_item17);
        description = findViewById(R.id.text_description17);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_nap);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData18(View view) {
        title = findViewById(R.id.text_item18);
        description = findViewById(R.id.text_description18);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_psg);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData19(View view) {
        title = findViewById(R.id.text_item19);
        description = findViewById(R.id.text_description19);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_tot);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void sendData20(View view) {
        title = findViewById(R.id.text_item20);
        description = findViewById(R.id.text_description20);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.camisa_val);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_REPLY_TITLE, title.getText());
        intent.putExtra(EXTRA_REPLY_DESCRIPTION, description.getText());
        intent.putExtra(EXTRA_REPLY_IMAGE, byteArray);
        setResult(RESULT_OK, intent);
        finish();
    }

}
