package com.overdev.nexuztrading;

import android.content.Intent;
import android.graphics.drawable.Drawable;
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
                    title = findViewById(R.id.text_item1);
                    description = findViewById(R.id.text_description1);
                    image = findViewById(R.id.image_item1);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    title = findViewById(R.id.text_item2);
                    description = findViewById(R.id.text_description2);
                    image = findViewById(R.id.image_item2);
                    title.setText("");
                    description.setText("");
                    image.setVisibility(View.INVISIBLE);
                    break;
                case 2:
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
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "Cafaro");
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                Bundle reply = data.getExtras();
                String title_team = reply.getString("title_team");
                String description_team = reply.getString("description_team");
                //String image_team = reply.getString("image_team");
                Log.d(TAG, "Mensaje Recibido");

                switch (title_team){
                    case "FC Real Madrid":
                        Log.d(TAG, "Real Madrid");
                        title = findViewById(R.id.text_item1);
                        description = findViewById(R.id.text_description1);
                        image = findViewById(R.id.image_item1);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable real_madrid = getResources().getDrawable(R.drawable.camisa_rea);
                        image.setImageDrawable(real_madrid);
                        break;

                    case "AC Milan":
                        title = findViewById(R.id.text_item2);
                        description = findViewById(R.id.text_description2);
                        image = findViewById(R.id.image_item2);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable milan = getResources().getDrawable(R.drawable.camisa_mil);
                        image.setImageDrawable(milan);
                        break;

                    case "FC Barcelona":
                        title = findViewById(R.id.text_item3);
                        description = findViewById(R.id.text_description3);
                        image = findViewById(R.id.image_item3);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable barcelona = getResources().getDrawable(R.drawable.camisa_bar);
                        image.setImageDrawable(barcelona);
                        break;

                    case "FC Liverpool":
                        title = findViewById(R.id.text_item4);
                        description = findViewById(R.id.text_description4);
                        image = findViewById(R.id.image_item4);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable liverpool = getResources().getDrawable(R.drawable.camisa_liv);
                        image.setImageDrawable(liverpool);
                        break;

                    case "FC Bayern Munich":
                        title = findViewById(R.id.text_item5);
                        description = findViewById(R.id.text_description5);
                        image = findViewById(R.id.image_item5);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable bayern_munich = getResources().getDrawable(R.drawable.camisa_bay);
                        image.setImageDrawable(bayern_munich);
                        break;

                    case "AFC Ajax":
                        title = findViewById(R.id.text_item6);
                        description = findViewById(R.id.text_description6);
                        image = findViewById(R.id.image_item6);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable ajax = getResources().getDrawable(R.drawable.camisa_aja);
                        image.setImageDrawable(ajax);
                        break;

                    case "FC Manchester United":
                        title = findViewById(R.id.text_item7);
                        description = findViewById(R.id.text_description7);
                        image = findViewById(R.id.image_item7);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable manchester_united = getResources().getDrawable(R.drawable.camisa_man);
                        image.setImageDrawable(manchester_united);
                        break;

                    case "FC Juventus":
                        title = findViewById(R.id.text_item8);
                        description = findViewById(R.id.text_description8);
                        image = findViewById(R.id.image_item8);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable juventus = getResources().getDrawable(R.drawable.camisa_juv);
                        image.setImageDrawable(juventus);
                        break;

                    case "SL Benfica":
                        title = findViewById(R.id.text_item9);
                        description = findViewById(R.id.text_description9);
                        image = findViewById(R.id.image_item9);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable benfica = getResources().getDrawable(R.drawable.camisa_ben);
                        image.setImageDrawable(benfica);
                        break;

                    case "FC Porto":
                        title = findViewById(R.id.text_item10);
                        description = findViewById(R.id.text_description10);
                        image = findViewById(R.id.image_item10);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable porto = getResources().getDrawable(R.drawable.camisa_por);
                        image.setImageDrawable(porto);
                        break;

                    case "Olympique de Marsella":
                        title = findViewById(R.id.text_item11);
                        description = findViewById(R.id.text_description11);
                        image = findViewById(R.id.image_item11);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable olym_marsella = getResources().getDrawable(R.drawable.camisa_mar);
                        image.setImageDrawable(olym_marsella);
                        break;

                    case "FC Chelsea":
                        title = findViewById(R.id.text_item12);
                        description = findViewById(R.id.text_description12);
                        image = findViewById(R.id.image_item12);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable chelsea = getResources().getDrawable(R.drawable.camisa_che);
                        image.setImageDrawable(chelsea);
                        break;

                    case "BV Borussia Dordmunt":
                        title = findViewById(R.id.text_item13);
                        description = findViewById(R.id.text_description13);
                        image = findViewById(R.id.image_item13);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable borussia_dordmunt = getResources().getDrawable(R.drawable.camisa_dor);
                        image.setImageDrawable(borussia_dordmunt);
                        break;

                    case "FC Atletico de Madrid":
                        title = findViewById(R.id.text_item14);
                        description = findViewById(R.id.text_description14);
                        image = findViewById(R.id.image_item14);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable atletico_madrid = getResources().getDrawable(R.drawable.camisa_atl);
                        image.setImageDrawable(atletico_madrid);
                        break;

                    case "FC Manchester City":
                        title = findViewById(R.id.text_item15);
                        description = findViewById(R.id.text_description15);
                        image = findViewById(R.id.image_item15);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable manchester_city = getResources().getDrawable(R.drawable.camisa_cit);
                        image.setImageDrawable(manchester_city);
                        break;

                    case "FC Olympique de Lyon":
                        title = findViewById(R.id.text_item16);
                        description = findViewById(R.id.text_description16);
                        image = findViewById(R.id.image_item16);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable olympique_lyon = getResources().getDrawable(R.drawable.camisa_lyo);
                        image.setImageDrawable(olympique_lyon);
                        break;

                    case "FC Napoli":
                        title = findViewById(R.id.text_item17);
                        description = findViewById(R.id.text_description17);
                        image = findViewById(R.id.image_item17);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable napoli = getResources().getDrawable(R.drawable.camisa_nap);
                        image.setImageDrawable(napoli);
                        break;

                    case "FC Paris Saint-Germain":
                        title = findViewById(R.id.text_item18);
                        description = findViewById(R.id.text_description18);
                        image = findViewById(R.id.image_item18);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable psg = getResources().getDrawable(R.drawable.camisa_psg);
                        image.setImageDrawable(psg);
                        break;

                    case "FC Tottenham Hotspur":
                        title = findViewById(R.id.text_item19);
                        description = findViewById(R.id.text_description19);
                        image = findViewById(R.id.image_item19);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable tottenham = getResources().getDrawable(R.drawable.camisa_tot);
                        image.setImageDrawable(tottenham);
                        break;

                    case "FC Valencia":
                        title = findViewById(R.id.text_item20);
                        description = findViewById(R.id.text_description20);
                        image = findViewById(R.id.image_item20);
                        title.setText(title_team);
                        description.setText(description_team);
                        Drawable valencia = getResources().getDrawable(R.drawable.camisa_val);
                        image.setImageDrawable(valencia);
                        break;
                }
            }
        }
    }
}
