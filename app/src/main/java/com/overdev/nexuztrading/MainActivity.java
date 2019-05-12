package com.overdev.nexuztrading;

import android.content.Intent;
import android.os.Debug;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<TextView> shopList;
    public List<ImageView> imageList;
    public List<TextView> detailList;

    private TextView title;
    private TextView description;
    private ImageView image;

    private static final String TAG = "MyActivity";

    public static final int TEXT_REQUEST = 1;

    private TextView mReplyTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 10; i++){
            switch (i){
                case 0:
                    Log.d(TAG,"Here");
                    title = findViewById(R.id.text_item1);
                    description = findViewById(R.id.text_description1);
                    image = findViewById(R.id.image_item1);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    Log.d(TAG,"Here 1");
                    title = findViewById(R.id.text_item2);
                    description = findViewById(R.id.text_description2);
                    image = findViewById(R.id.image_item2);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
                case 2:

                    Log.d(TAG,"Here 2");
                    title = findViewById(R.id.text_item3);
                    description = findViewById(R.id.text_description3);
                    image = findViewById(R.id.image_item3);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
                case 3:
                    title = findViewById(R.id.text_item4);
                    description = findViewById(R.id.text_description4);
                    image = findViewById(R.id.image_item4);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
                case 4:
                    title = findViewById(R.id.text_item5);
                    description = findViewById(R.id.text_description5);
                    image = findViewById(R.id.image_item5);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
                case 5:
                    title = findViewById(R.id.text_item6);
                    description = findViewById(R.id.text_description6);
                    image = findViewById(R.id.image_item6);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
                case 6:
                    title = findViewById(R.id.text_item7);
                    description = findViewById(R.id.text_description7);
                    image = findViewById(R.id.image_item7);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
                case 7:
                    title = findViewById(R.id.text_item8);
                    description = findViewById(R.id.text_description8);
                    image = findViewById(R.id.image_item8);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
                case 8:
                    title = findViewById(R.id.text_item9);
                    description = findViewById(R.id.text_description9);
                    image = findViewById(R.id.image_item9);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
                case 9:
                    title = findViewById(R.id.text_item10);
                    description = findViewById(R.id.text_description10);
                    image = findViewById(R.id.image_item10);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
            }
        }
    }

    public void showSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
