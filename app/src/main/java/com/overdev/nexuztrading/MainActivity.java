package com.overdev.nexuztrading;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Debug;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ArrayList<TextView> shopList  = new ArrayList<TextView>();
    public List<ImageView> imageList = new ArrayList<ImageView>();
    public List<TextView> detailList = new ArrayList<TextView>();

    public int count;

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
                    title = findViewById(R.id.text_item1);
                    description = findViewById(R.id.text_description1);
                    image = findViewById(R.id.image_item1);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    shopList.add(title);
                    imageList.add(image);
                    detailList.add(description);
                    break;
                case 1:
                    title = findViewById(R.id.text_item2);
                    description = findViewById(R.id.text_description2);
                    image = findViewById(R.id.image_item2);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    shopList.add(title);
                    imageList.add(image);
                    detailList.add(description);
                    break;
                case 2:
                    title = findViewById(R.id.text_item3);
                    description = findViewById(R.id.text_description3);
                    image = findViewById(R.id.image_item3);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    shopList.add(title);
                    imageList.add(image);
                    detailList.add(description);
                    break;
                case 3:
                    title = findViewById(R.id.text_item4);
                    description = findViewById(R.id.text_description4);
                    image = findViewById(R.id.image_item4);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    shopList.add(title);
                    imageList.add(image);
                    detailList.add(description);
                    break;
                case 4:
                    title = findViewById(R.id.text_item5);
                    description = findViewById(R.id.text_description5);
                    image = findViewById(R.id.image_item5);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    shopList.add(title);
                    imageList.add(image);
                    detailList.add(description);
                    break;
                case 5:
                    title = findViewById(R.id.text_item6);
                    description = findViewById(R.id.text_description6);
                    image = findViewById(R.id.image_item6);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    shopList.add(title);
                    imageList.add(image);
                    detailList.add(description);
                    break;
                case 6:
                    title = findViewById(R.id.text_item7);
                    description = findViewById(R.id.text_description7);
                    image = findViewById(R.id.image_item7);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    shopList.add(title);
                    imageList.add(image);
                    detailList.add(description);
                    break;
                case 7:
                    title = findViewById(R.id.text_item8);
                    description = findViewById(R.id.text_description8);
                    image = findViewById(R.id.image_item8);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    shopList.add(title);
                    imageList.add(image);
                    detailList.add(description);
                    break;
                case 8:
                    title = findViewById(R.id.text_item9);
                    description = findViewById(R.id.text_description9);
                    image = findViewById(R.id.image_item9);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    shopList.add(title);
                    imageList.add(image);
                    detailList.add(description);
                    break;
                case 9:
                    title = findViewById(R.id.text_item10);
                    description = findViewById(R.id.text_description10);
                    image = findViewById(R.id.image_item10);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    shopList.add(title);
                    imageList.add(image);
                    detailList.add(description);
                    break;
            }
        }
    }

    public void showSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String title_team = data.getStringExtra(SecondActivity.EXTRA_REPLY_TITLE);
                String description_team = data.getStringExtra(SecondActivity.EXTRA_REPLY_DESCRIPTION);
                byte[] byteArray = data.getByteArrayExtra(SecondActivity.EXTRA_REPLY_IMAGE);

                switch (title_team){
                    case "FC Real Madrid":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "AC Milan":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Barcelona":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Liverpool":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Bayern Munich":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "AFC Ajax":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Manchester United":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Juventus":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "SL Benfica":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Porto":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "Olympique de Marsella":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Chelsea":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "BV Borussia Dordmunt":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Atletico de Madrid":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Manchester City":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Olympique de Lyon":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Napoli":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Paris Saint-Germain":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Tottenham Hotspur":
                        setValues(title_team, description_team, byteArray);
                        break;

                    case "FC Valencia":
                        setValues(title_team, description_team, byteArray);
                        break;
                }
            }
        }
    }

    public void setValues(String title_team, String description_team, byte[] byteArray){
        count = 0;
        for (TextView element: shopList) {
            if (element.getText() == "") {
                element.setText(title_team);
                detailList.get(count).setText(description_team);
                Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                imageList.get(count).setImageBitmap(bmp);
                imageList.get(count).setVisibility(View.VISIBLE);
                break;
            } else if (count == shopList.size()){
                Log.d(TAG, "Completo");
            }
            count++;
        }
    }
}
