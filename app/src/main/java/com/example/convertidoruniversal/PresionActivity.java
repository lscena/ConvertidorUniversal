package com.example.convertidoruniversal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PresionActivity extends AppCompatActivity {

    //Variables globales:
    Spinner fromUnitSpinner;
    Spinner toUnitSpinner;
    Float intermediateValue;
    Float resultValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presion);

        //Creo una lista con los elementos que usará el spinner:
        //El tipado "E" dentro del list es para indicar que no está definido, pero en este caso uso "String"
        List<String> listUnits = new ArrayList<>();
        //Agrego valores a la lista:
        listUnits.add("Pa");
        listUnits.add("bar");
        listUnits.add("kPa");
        listUnits.add("MPa");
        listUnits.add("PSI");
        listUnits.add("atm");
        listUnits.add("mmHg");
        listUnits.add("kg/cm²");

        //Creo un adaptador (recibe string y devuelve elementos para el spinner)
        ArrayAdapter<String> adaptadorPresion= new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,listUnits);
        //Parametros: context, formato, lista que quiero usar
        //Nota: el formato simple_spinner_dropdown_item son items más amplios visualmente.

        //pongo los spinner en variable
        fromUnitSpinner=findViewById(R.id.fromUnitSpinner);
        toUnitSpinner=findViewById(R.id.toUnitSpinner);

        //Le seteo el adaptador al spinner:
        fromUnitSpinner.setAdapter(adaptadorPresion);
        toUnitSpinner.setAdapter(adaptadorPresion);
    }

    public void convertirPresion(View view) {
        String selectionFrom = fromUnitSpinner.getSelectedItem().toString();
        String selectionTo = fromUnitSpinner.getSelectedItem().toString();

        if(selectionFrom.isEmpty() || selectionTo.isEmpty()){
            Toast.makeText(getApplicationContext(),"Ingrese una presión.",Toast.LENGTH_LONG).show();
            return;
        }

        switch(selectionFrom){
            case("Pa"):
                intermediateValue=2f; //poner la formula

        }

    }
}
