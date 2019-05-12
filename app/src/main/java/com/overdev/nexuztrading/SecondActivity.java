package com.overdev.nexuztrading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView title, description;
    private ImageView image;
    Bundle data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void sendData1(View view) {
        title = findViewById(R.id.text_item1);
        description = findViewById(R.id.text_description1);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_rea");
        startActivity(intent);
    }

    public void sendData2(View view) {
        title = findViewById(R.id.text_item2);
        description = findViewById(R.id.text_description2);
        image = findViewById(R.id.image_item2);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_mil");
        startActivity(intent);
    }

    public void sendData3(View view) {
        title = findViewById(R.id.text_item3);
        description = findViewById(R.id.text_description3);
        image = findViewById(R.id.image_item3);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_bar");
        startActivity(intent);
    }

    public void sendData4(View view) {
        title = findViewById(R.id.text_item4);
        description = findViewById(R.id.text_description4);
        image = findViewById(R.id.image_item4);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_liv");
        startActivity(intent);
    }

    public void sendData5(View view) {
        title = findViewById(R.id.text_item5);
        description = findViewById(R.id.text_description5);
        image = findViewById(R.id.image_item5);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_bay");
        startActivity(intent);
    }

    public void sendData6(View view) {
        title = findViewById(R.id.text_item6);
        description = findViewById(R.id.text_description6);
        image = findViewById(R.id.image_item6);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_aja");
        startActivity(intent);
    }

    public void sendData7(View view) {
        title = findViewById(R.id.text_item7);
        description = findViewById(R.id.text_description7);
        image = findViewById(R.id.image_item7);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_man");
        startActivity(intent);
    }

    public void sendData8(View view) {
        title = findViewById(R.id.text_item8);
        description = findViewById(R.id.text_description8);
        image = findViewById(R.id.image_item8);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_juv");
        startActivity(intent);
    }

    public void sendData9(View view) {
        title = findViewById(R.id.text_item9);
        description = findViewById(R.id.text_description9);
        image = findViewById(R.id.image_item9);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_ben");
        startActivity(intent);
    }

    public void sendData10(View view) {
        title = findViewById(R.id.text_item10);
        description = findViewById(R.id.text_description10);
        image = findViewById(R.id.image_item10);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_por");
        startActivity(intent);
    }

    public void sendData11(View view) {
        title = findViewById(R.id.text_item11);
        description = findViewById(R.id.text_description11);
        image = findViewById(R.id.image_item11);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_mar");
        startActivity(intent);
    }

    public void sendData12(View view) {
        title = findViewById(R.id.text_item12);
        description = findViewById(R.id.text_description12);
        image = findViewById(R.id.image_item12);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_che");
        startActivity(intent);
    }

    public void sendData13(View view) {
        title = findViewById(R.id.text_item13);
        description = findViewById(R.id.text_description13);
        image = findViewById(R.id.image_item13);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_dor");
        startActivity(intent);
    }

    public void sendData14(View view) {
        title = findViewById(R.id.text_item14);
        description = findViewById(R.id.text_description14);
        image = findViewById(R.id.image_item14);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_atl");
        startActivity(intent);
    }

    public void sendData15(View view) {
        title = findViewById(R.id.text_item15);
        description = findViewById(R.id.text_description15);
        image = findViewById(R.id.image_item15);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_cit");
        startActivity(intent);
    }

    public void sendData16(View view) {
        title = findViewById(R.id.text_item16);
        description = findViewById(R.id.text_description16);
        image = findViewById(R.id.image_item16);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_lyo");
        startActivity(intent);
    }

    public void sendData17(View view) {
        title = findViewById(R.id.text_item17);
        description = findViewById(R.id.text_description17);
        image = findViewById(R.id.image_item17);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_nap");
        startActivity(intent);
    }

    public void sendData18(View view) {
        title = findViewById(R.id.text_item18);
        description = findViewById(R.id.text_description18);
        image = findViewById(R.id.image_item18);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_psg");
        startActivity(intent);
    }

    public void sendData19(View view) {
        title = findViewById(R.id.text_item19);
        description = findViewById(R.id.text_description19);
        image = findViewById(R.id.image_item19);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_tot");
        startActivity(intent);
    }

    public void sendData20(View view) {
        title = findViewById(R.id.text_item20);
        description = findViewById(R.id.text_description20);
        image = findViewById(R.id.image_item20);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("title_team", title.getText());
        intent.putExtra("description_team", description.getText());
        intent.putExtra("image_team", "camisa_val");
        startActivity(intent);
    }


}
