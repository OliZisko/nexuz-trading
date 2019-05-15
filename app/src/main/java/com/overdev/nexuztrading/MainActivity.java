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

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ArrayList<TextView> shopList  = new ArrayList<TextView>();
    public List<ImageView> imageList = new ArrayList<ImageView>();
    public List<TextView> detailList = new ArrayList<TextView>();
    public List<ImageView> deleteList = new ArrayList<ImageView>();

    public int count;

    private TextView title;
    private TextView description;
    private ImageView image, delete;

    private static final String TAG = "MyActivity";

    public static final int TEXT_REQUEST = 1;

    public TextView title_1, title_2, title_3, title_4, title_5, title_6, title_7, title_8, title_9, title_10;

    public TextView description_1, description_2, description_3, description_4, description_5, description_6, description_7, description_8, description_9, description_10;

    public ImageView delete_1, delete_2, delete_3, delete_4, delete_5, delete_6, delete_7, delete_8, delete_9, delete_10;

    public ImageView image_1, image_2, image_3, image_4, image_5, image_6, image_7, image_8, image_9, image_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title_1 = findViewById(R.id.text_item1);
        title_2 = findViewById(R.id.text_item2);
        title_3 = findViewById(R.id.text_item3);
        title_4 = findViewById(R.id.text_item4);
        title_5 = findViewById(R.id.text_item5);
        title_6 = findViewById(R.id.text_item6);
        title_7 = findViewById(R.id.text_item7);
        title_8 = findViewById(R.id.text_item8);
        title_9 = findViewById(R.id.text_item9);
        title_10 = findViewById(R.id.text_item10);

        description_1 = findViewById(R.id.text_description1);
        description_2 = findViewById(R.id.text_description2);
        description_3 = findViewById(R.id.text_description3);
        description_4 = findViewById(R.id.text_description4);
        description_5 = findViewById(R.id.text_description5);
        description_6 = findViewById(R.id.text_description6);
        description_7 = findViewById(R.id.text_description7);
        description_8 = findViewById(R.id.text_description8);
        description_9 = findViewById(R.id.text_description9);
        description_10 = findViewById(R.id.text_description10);

        image_1 = findViewById(R.id.image_item1);
        image_2 = findViewById(R.id.image_item2);
        image_3 = findViewById(R.id.image_item3);
        image_4 = findViewById(R.id.image_item4);
        image_5 = findViewById(R.id.image_item5);
        image_6 = findViewById(R.id.image_item6);
        image_7 = findViewById(R.id.image_item7);
        image_8 = findViewById(R.id.image_item8);
        image_9 = findViewById(R.id.image_item9);
        image_10 = findViewById(R.id.image_item10);

        delete_1 = findViewById(R.id.image_delete1);
        delete_2 = findViewById(R.id.image_delete2);
        delete_3 = findViewById(R.id.image_delete3);
        delete_4 = findViewById(R.id.image_delete4);
        delete_5 = findViewById(R.id.image_delete5);
        delete_6 = findViewById(R.id.image_delete6);
        delete_7 = findViewById(R.id.image_delete7);
        delete_8 = findViewById(R.id.image_delete8);
        delete_9 = findViewById(R.id.image_delete9);
        delete_10 = findViewById(R.id.image_delete10);

        for (int i = 0; i < 10; i++){
            switch (i){
                case 0:
                    initialSettings(title_1, description_1, image_1, delete_1);
                    break;
                case 1:
                    initialSettings(title_2, description_2, image_2, delete_2);
                    break;
                case 2:
                    initialSettings(title_3, description_3, image_3, delete_3);
                    break;
                case 3:
                    initialSettings(title_4, description_4, image_4, delete_4);
                    break;
                case 4:
                    initialSettings(title_5, description_5, image_5, delete_5);
                    break;
                case 5:
                    initialSettings(title_6, description_6, image_6, delete_6);
                    break;
                case 6:
                    initialSettings(title_7, description_7, image_7, delete_7);
                    break;
                case 7:
                    initialSettings(title_8, description_8, image_8, delete_8);
                    break;
                case 8:
                    initialSettings(title_9, description_9, image_9, delete_9);
                    break;
                case 9:
                    initialSettings(title_10, description_10, image_10, delete_10);
                    break;
            }
        }

        if (savedInstanceState != null) {

            title_1.setText(savedInstanceState.getString("text_1"));
            description_1.setText(savedInstanceState.getString("description_1"));
            //delete_1.setVisibility(View.VISIBLE);
            if(title_1.getText().toString() != ""){
                delete_1.setVisibility(View.VISIBLE);
                saveImages(title_1.getText().toString(), image_1);
            } else{
                delete_1.setVisibility(View.INVISIBLE);
            }

            title_2.setText(savedInstanceState.getString("text_2"));
            description_2.setText(savedInstanceState.getString("description_2"));
            if(title_2.getText().toString() != ""){
                delete_2.setVisibility(View.VISIBLE);
                saveImages(title_2.getText().toString(), image_2);
            } else{
                delete_2.setVisibility(View.INVISIBLE);
            }

            title_3.setText(savedInstanceState.getString("text_3"));
            description_3.setText(savedInstanceState.getString("description_3"));
            if(title_3.getText().toString() != ""){
                delete_3.setVisibility(View.VISIBLE);
                saveImages(title_3.getText().toString(), image_3);
            } else{
                delete_3.setVisibility(View.INVISIBLE);
            }

            title_4.setText(savedInstanceState.getString("text_4"));
            description_4.setText(savedInstanceState.getString("description_4"));
            if(title_4.getText().toString() != ""){
                delete_4.setVisibility(View.VISIBLE);
                saveImages(title_4.getText().toString(), image_4);
            } else{
                delete_4.setVisibility(View.INVISIBLE);
            }

            title_5.setText(savedInstanceState.getString("text_5"));
            description_5.setText(savedInstanceState.getString("description_5"));
            if(title_5.getText().toString() != ""){
                delete_5.setVisibility(View.VISIBLE);
                saveImages(title_5.getText().toString(), image_5);
            } else{
                delete_5.setVisibility(View.INVISIBLE);
            }

            title_6.setText(savedInstanceState.getString("text_6"));
            description_6.setText(savedInstanceState.getString("description_6"));
            if(title_6.getText().toString() != ""){
                delete_6.setVisibility(View.VISIBLE);
                saveImages(title_6.getText().toString(), image_6);
            } else{
                delete_6.setVisibility(View.INVISIBLE);
            }

            title_7.setText(savedInstanceState.getString("text_7"));
            description_7.setText(savedInstanceState.getString("description_7"));
            if(title_7.getText().toString() != ""){
                delete_7.setVisibility(View.VISIBLE);
                saveImages(title_7.getText().toString(), image_7);
            } else{
                delete_7.setVisibility(View.INVISIBLE);
            }

            title_8.setText(savedInstanceState.getString("text_8"));
            description_8.setText(savedInstanceState.getString("description_8"));
            if(title_8.getText().toString() != ""){
                delete_8.setVisibility(View.VISIBLE);
                saveImages(title_8.getText().toString(), image_8);
            } else{
                delete_8.setVisibility(View.INVISIBLE);
            }

            title_9.setText(savedInstanceState.getString("text_9"));
            description_9.setText(savedInstanceState.getString("description_9"));
            if(title_9.getText().toString() != ""){
                delete_9.setVisibility(View.VISIBLE);
                saveImages(title_9.getText().toString(), image_9);
            } else{
                delete_9.setVisibility(View.INVISIBLE);
            }

            title_10.setText(savedInstanceState.getString("text_10"));
            description_10.setText(savedInstanceState.getString("description_10"));
            if(title_10.getText().toString() != ""){
                delete_10.setVisibility(View.VISIBLE);
                saveImages(title_10.getText().toString(), image_10);
            } else{
                delete_10.setVisibility(View.INVISIBLE);
            }
        } else {

        }
    }

    public void initialSettings(TextView title, TextView description, ImageView image, ImageView delete){
        title.setText("");
        description.setText("No hay producto seleccionado");
        image.setImageResource(getResources().getIdentifier("no_product", "drawable", getPackageName()));
        delete.setVisibility(View.INVISIBLE);
        shopList.add(title);
        imageList.add(image);
        detailList.add(description);
        deleteList.add(delete);
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

    public void saveImages(String title_team, ImageView img){
        switch (title_team){
            case "FC Real Madrid":
                img.setImageResource(getResources().getIdentifier("camisa_rea_nc", "drawable", getPackageName()));
                break;

            case "AC Milan":
                img.setImageResource(getResources().getIdentifier("camisa_mil_nc", "drawable", getPackageName()));
                break;

            case "FC Barcelona":
                img.setImageResource(getResources().getIdentifier("camisa_bar_nc", "drawable", getPackageName()));
                break;

            case "FC Liverpool":
                img.setImageResource(getResources().getIdentifier("camisa_liv_nc", "drawable", getPackageName()));
                break;

            case "FC Bayern Munich":
                img.setImageResource(getResources().getIdentifier("camisa_bay_nc", "drawable", getPackageName()));
                break;

            case "AFC Ajax":
                img.setImageResource(getResources().getIdentifier("camisa_aja_nc", "drawable", getPackageName()));
                break;

            case "FC Manchester United":
                img.setImageResource(getResources().getIdentifier("camisa_man_nc", "drawable", getPackageName()));
                break;

            case "FC Juventus":
                img.setImageResource(getResources().getIdentifier("camisa_juv_nc", "drawable", getPackageName()));
                break;

            case "SL Benfica":
                img.setImageResource(getResources().getIdentifier("camisa_ben_nc", "drawable", getPackageName()));
                break;

            case "FC Porto":
                img.setImageResource(getResources().getIdentifier("camisa_por_nc", "drawable", getPackageName()));
                break;

            case "Olympique de Marsella":
                img.setImageResource(getResources().getIdentifier("camisa_mar_nc", "drawable", getPackageName()));
                break;

            case "FC Chelsea":
                img.setImageResource(getResources().getIdentifier("camisa_che_nc", "drawable", getPackageName()));
                break;

            case "BV Borussia Dordmunt":
                img.setImageResource(getResources().getIdentifier("camisa_dor_nc", "drawable", getPackageName()));
                break;

            case "FC Atletico de Madrid":
                img.setImageResource(getResources().getIdentifier("camisa_atl_nc", "drawable", getPackageName()));
                break;

            case "FC Manchester City":
                img.setImageResource(getResources().getIdentifier("camisa_cit_nc", "drawable", getPackageName()));
                break;

            case "FC Olympique de Lyon":
                img.setImageResource(getResources().getIdentifier("camisa_lyo_nc", "drawable", getPackageName()));
                break;

            case "FC Napoli":
                img.setImageResource(getResources().getIdentifier("camisa_nap_nc", "drawable", getPackageName()));
                break;

            case "FC Paris Saint-Germain":
                img.setImageResource(getResources().getIdentifier("camisa_psg_nc", "drawable", getPackageName()));
                break;

            case "FC Tottenham Hotspur":
                img.setImageResource(getResources().getIdentifier("camisa_tot_nc", "drawable", getPackageName()));
                break;

            case "FC Valencia":
                img.setImageResource(getResources().getIdentifier("camisa_val_nc", "drawable", getPackageName()));
                break;
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
                deleteList.get(count).setVisibility(View.VISIBLE);
                break;
            } else if (count == shopList.size()){
                Log.d(TAG, "Completo");
            }
            count++;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("text_1", title_1.getText().toString());
        outState.putString("description_1", description_1.getText().toString());

        outState.putString("text_2", title_2.getText().toString());
        outState.putString("description_2", description_2.getText().toString());

        outState.putString("text_3", title_3.getText().toString());
        outState.putString("description_3", description_3.getText().toString());

        outState.putString("text_4", title_4.getText().toString());
        outState.putString("description_4", description_4.getText().toString());

        outState.putString("text_5", title_5.getText().toString());
        outState.putString("description_5", description_5.getText().toString());

        outState.putString("text_6", title_6.getText().toString());
        outState.putString("description_6", description_6.getText().toString());

        outState.putString("text_7", title_7.getText().toString());
        outState.putString("description_7", description_7.getText().toString());

        outState.putString("text_8", title_8.getText().toString());
        outState.putString("description_8", description_8.getText().toString());

        outState.putString("text_9", title_9.getText().toString());
        outState.putString("description_9", description_9.getText().toString());

        outState.putString("text_10", title_10.getText().toString());
        outState.putString("description_10", description_10.getText().toString());

    }
}
