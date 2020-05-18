package com.example.convertidoruniversal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CocinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocina);

        //El listview se carga dinámicamente desde código.
        ListView cocinaListView=findViewById(R.id.cocinaListView);

        //Creo una lista de objetos:
        List<ClassCocinaMeasure> listMedidasCocina = new ArrayList<>();

        //Agrego un objeto a la lista:
        listMedidasCocina.add(new ClassCocinaMeasure("Harina", "125g","60g","30g"));
        listMedidasCocina.add(new ClassCocinaMeasure("Azucar", "125g","60g","30g"));

        CocinaAdapter adaptador=new CocinaAdapter(getApplicationContext(),listMedidasCocina);

        cocinaListView.setAdapter(adaptador);

        //OLD - IN
        //creo una lista
        //List<String> listCocina = new ArrayList<String>();
        //asigno elementos a la lista
        //listCocina.add("azucar");
        //listCocina.add("harina");

        //creo un adaptador
//        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
//                getApplicationContext(),
//                android.R.layout.simple_list_item_1,
//                listCocina
//        );

        //asigno el adaptador
//        cocinaListView.setAdapter(adaptador);
        //OLD - OUT
    }


}
