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

/**
 @author: Alberto Garcia - Francisco De Oliveira - Jose Cafaro
 Nexus Trading - App movil para carrito de compra
 Proyecto de la materia de Programación Bajo Ambiente Android en la UCAB
 @version 1.0.0. / 16-05-2019
 */
public class Detail_Product extends AppCompatActivity {
    private String titulo, descripcion, imagen, foto; //Variables para trabajar con los String que se reciben por el Intend con el metddo getStringExtra.



    /**
     * Este metodo onCreate es para inicializar la Activity de Detail_Product
     * Se reciben el titulo, descripcion e imagen de cada item seleccionado en el Second Activity
     * Se realiza un Switch - Case para enviar la historia correspondiente a cada detalle que se quiera mostrar por cada equipo
     * Se recibe el nombre del recurso con un String para luego buscar la imagen por su nombre en el directorio Drawable
     */
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
                history.setText("Es un club de fútbol neerlandés de la ciudad de Ámsterdam. Fue fundado en 1900 y juega en la primera división de la Eredivisie, categoría que ocupa desde los primeros años de la competición. Es históricamente uno de los tres clubes que dominan el fútbol de elite de los Países Bajos formando De Grote Drie (los tres grandes) junto a sus rivales el P. S. V., con el que disputa De Topper y el Feyenoord, con el que disputa De Klassieker o clásico neerlandés.");
                break;

            case "camisa_atl_nc":
                history.setText("Es un club de fútbol (y antiguo club polideportivo) español de la ciudad de Madrid, fundado el 26 de abril de 1903. Su primer equipo masculino milita en la Primera División de España y disputa sus partidos como local desde la temporada 2017/18, en el Estadio Metropolitano, con capacidad de 69 829 espectadores.");
                break;

            case "camisa_bar_nc":
                history.setText("Es una entidad polideportiva de Barcelona, España. Fue fundado como club de fútbol el 29 de noviembre de 1899. Es uno de los cuatro clubes profesionales de España junto a Real Madrid, Athletic Club y Osasuna que no es sociedad anónima, de manera que la propiedad del club recae en sus socios.");
                break;

            case "camisa_bay_nc":
                history.setText("Es una entidad deportiva de la ciudad de Múnich, Alemania. Fue fundado el 27 de febrero de 1900 por once jugadores liderados por Franz John. Es uno de los clubes de mayor prestigio en el mundo, es conocido por su sección de fútbol profesional, que participa en la 1. Bundesliga.");
                break;

            case "camisa_ben_nc":
                history.setText("Es un club polideportivo de la ciudad de Lisboa, Portugal. Fue fundado como club de fútbol con la denominación Grupo Sport Lisboa el 28 de febrero de 1904. Desde 2003 juega de local en el Estádio da Luz, que lleva el mismo nombre que el original de 1954. El Benfica viste camiseta roja y pantalón blanco.");
                break;

            case "camisa_che_nc":
                history.setText("Es un club de fútbol profesional de Inglaterra con sede en el distrito de Fulham (Londres), que disputa actualmente la Premier League, máxima competición futbolística de ese país. Fundado el 10 de marzo de 1905, el club se mantuvo la mayor parte de su historia en la máxima categoría del fútbol británico. ");
                break;

            case "camisa_cit_nc":
                history.setText("Es un club de fútbol de Mánchester, Inglaterra que juega en la Premier League. Fue fundado en 1880 bajo el nombre de St. Mark's (West Gorton), luego pasó a llamarse Ardwick Association Football Club en 1887 y finalmente, el 16 de abril de 1894, se convirtió en el Manchester City.");
                break;

            case "camisa_dor_nc":
                history.setText("Es un club de fútbol del oeste de Alemania, de la ciudad de Dortmund, en el estado federado de Renania del Norte-Westfalia. Fue fundado el 19 de diciembre de 1909 y utiliza históricamente como uniforme titular camiseta amarilla y pantalón negro. Juega en la primera división de la Bundesliga, donde se ubica en la cuarta posición en la tabla histórica con ocho títulos.");
                break;

            case "camisa_juv_nc":
                history.setText("Es un club de fútbol italiano con sede en la ciudad de Turín, capital de la región del Piamonte. Fue fundado el 1 de noviembre de 1897 con el nombre de «Sport Club Juventus» por un grupo de estudiantes locales.");
                break;

            case "camisa_liv_nc":
                history.setText("Es un club de fútbol profesional con sede en Liverpool, Inglaterra, que disputa la Premier League, máxima competición futbolística en ese país. Es el club inglés con mayor número de títulos internacionales, con cinco Copas de Europa, tres Copas de la UEFA y tres Supercopas de Europa. A nivel nacional, ha ganado dieciocho títulos de liga, siete FA Cups, ocho Copas de la Liga");
                break;

            case "camisa_lyo_nc":
                history.setText("Conocido como Olympique de Lyon en los países hispanohablantes, o simplemente OL o Lyon) es un club de fútbol de Francia con sede en Lyon. Es uno de los equipos más populares y el tercero más laureado en la historia del fútbol francés, con 7 campeonatos de liga. Juegan en la división mayor del fútbol de Francia, la Ligue 1. El club Lyon Olympique Universitaire (LOU) se formó en 1899, de acuerdo con muchos partidarios y los historiadores del deporte, pero no se estableció a nivel nacional como un club profesional.");
                break;

            case "camisa_man_nc":
                history.setText("Es un club de fútbol de la ciudad de Mánchester (Inglaterra) que compite en la Premier League y disputa sus partidos como local en el estadio Old Trafford. Fue fundado el 5 de marzo de 1878 bajo el nombre de Newton Heath LYR Football Club y se incorporó a la First Division en 1892. Después de estar cerca de la bancarrota en 1902, J. H. Davies tomó las riendas del club y cambio su nombre por el actual");
                break;

            case "camisa_mar_nc":
                history.setText("Es una entidad polideportiva con sede en Marsella, Bocas del Ródano, Francia. Fue declarada oficialmente registrada por sus socios en agosto de 1899 con el objeto principal de la práctica y desarrollo del fútbol, si bien data sus orígenes como club polideportivo al año 1892 con su pionera sección de rugby");
                break;

            case "camisa_mil_nc":
                history.setText("Es un club de fútbol italiano de la ciudad de Milán, en la región de Lombardía. Fundado el 16 de diciembre de 1899 por Alfred Edwards bajo el nombre de Milan Foot-Ball & Cricket Club, adoptó su actual denominación en 2003 si bien ya la utilizó desde 1938 con mínimas variaciones");
                break;

            case "camisa_nap_nc":
                history.setText("Es un club de fútbol italiano con sede en la ciudad de Nápoles, en la región de Campania. Fue fundado en 1926 y refundado en 2004. Actualmente participa en la Serie A, correspondiente a la máxima división del fútbol en Italia.");
                break;

            case "camisa_por_nc":
                history.setText("Es un club de fútbol de la ciudad de Oporto, Portugal. Fue fundado el 28 de septiembre de 1893 y juega en la Primera División de Portugal. Disputa sus encuentros como equipo local en el Estádio do Dragão desde 2003, y utiliza camiseta azul y blanca a franjas verticales con pantalón azul.");
                break;

            case "camisa_psg_nc":
                history.setText("Es un club de fútbol profesional con sede en París, Francia El club fue fundado el 12 de agosto de 1970 gracias a la fusión del Paris Football Club y el Stade Saint-Germanois. Disputa la Ligue 1, máxima categoría del fútbol francés, desde 1974, el récord de más participaciones de manera consecutiva del campeonato en curso, siendo el único equipo francés que nunca ha descendidon y uno de los equipos más reconocidos del país tras haber conquistado siete Ligas, doce Copas, ocho Copas de Liga y ocho Supercopas. Es junto con el Olympique de Marsella y Olympique Lyonnais, uno de los tres clubes franceses que han ganado un título europeo, la Recopa de Europa de 1996 y la Copa Intertoto de la UEFA de 2001");
                break;

            case "camisa_rea_nc":
                history.setText("Es una entidad polideportiva con sede en Madrid, España. Fue declarada oficialmente registrada como club de fútbol por sus socios el 6 de marzo de 1902 con el objeto de la práctica y desarrollo de este deporte. Si bien sus orígenes datan al año 1900 y su denominación de (Sociedad) Madrid Foot-ball Club a noviembre de 1901. Tuvo a Julián Palacios y los hermanos Juan Padrós y Carlos Padrós como principales valedores de su creación.");
                break;

            case "camisa_tot_nc":
                history.setText("Es un club de fútbol profesional de Inglaterra con sede en el distrito de Tottenham, Londres, que compite en la Premier League. Ejerció como local en el White Hart Lane hasta la temporada 2016-17, cuando este fue demolido para ser reconstruido por completo. Su nuevo estadio, Tottenham Hotspur Stadium, se erige en el mismo lugar y fue inaugurado el 3 de abril de 2019.");
                break;

            case "camisa_val_nc":
                history.setText("Es una sociedad anónima deportiva con sede en la ciudad de Valencia, España. El club de fútbol fue fundado el 18 de marzo de 1919. Su primer equipo juega en la LaLiga Santander, la máxima competición de fútbol en España, y disputa sus encuentros como local en el estadio de Mestalla, que dispone de una capacidad para 49 500 espectadores");
                break;
        }
        image.setImageResource(getResources().getIdentifier(foto, "drawable", getPackageName()));

    }
}
