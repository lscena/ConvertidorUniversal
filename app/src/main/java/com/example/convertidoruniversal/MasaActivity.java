package com.example.convertidoruniversal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MasaActivity extends AppCompatActivity {

    //variables globales a esta clase:
    Float intermediateValue;
    EditText masaInputEditText;
    Float resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masa);

        masaInputEditText=findViewById(R.id.masaInputEditText);
    }

    //Evento al checkearse uno de los radio button de "From Unit":
    public void fromUnitChecked(View view) {
        //Veo si el radio button clickeado fue checkeado o descheckeado
        boolean chequed = ((RadioButton) view).isChecked();

        String masaInputStr=masaInputEditText.getText().toString();
        Float masaInputFlt=Float.parseFloat(masaInputStr);

        //Veo cual de todos los radio button está checkeado:
        switch (view.getId()){
            case R.id.kgFromRB:
                if (chequed){
                    //el valor intermedio lo pongo en kilogramos:
                    intermediateValue=masaInputFlt;
                    break;
                }
            case R.id.gFromRB:
                if (chequed){
                    intermediateValue=masaInputFlt/1000;
                    break;
                }
            case R.id.lbFromRB:
                if (chequed){
                    intermediateValue=masaInputFlt/2.205f;
                    break;
                }
        }
    }


    //Evento al checkearse uno de los radio button de "To Unit":
    public void toUnitChecked(View view) {
        //Veo si el radio button clickeado fue checkeado o descheckeado
        boolean chequed = ((RadioButton) view).isChecked();

        //Veo cual de todos los radio button está checkeado:
        switch (view.getId()){
            case R.id.kgToRB:
                if (chequed){
                    //el valor intermedio está en kilogramos:
                    resultado=intermediateValue;
                    break;
                }
            case R.id.gToRB:
                if (chequed){
                    resultado=intermediateValue*1000;
                    break;
                }
            case R.id.lbToRB:
                if (chequed){
                    resultado=intermediateValue*2.205f;
                    break;
                }
        }
    }

    //Calculo el valor en la nueva unidad:
    public void calculateMass(View view) {
            //Muestro el resultado en el text view:
            TextView resultMass=findViewById(R.id.resultMass);
            resultMass.setText(resultado.toString());
    }
}
