package com.example.convertidoruniversal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.convertidoruniversal.ClassCocinaMeasure;

import java.util.List;

public class CocinaAdapter extends ArrayAdapter<ClassCocinaMeasure> {


    public CocinaAdapter(@NonNull Context context, @NonNull List<ClassCocinaMeasure> medidasCocina) {
        super(context, 0, medidasCocina);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View ItemLista=convertView;

        if(ItemLista==null){
            ItemLista=LayoutInflater.from(getContext()).inflate(R.layout.fila_cocina,parent, false);
        }

        ClassCocinaMeasure objMedidaActual=getItem(position);

        //Obtengo los text views:
        TextView nombreMedidaTV=ItemLista.findViewById(R.id.nombreMedidaTV);
        TextView medida1TV=ItemLista.findViewById(R.id.medida1TV);
        TextView medida2TV=ItemLista.findViewById(R.id.medida2TV);
        TextView medida3TV=ItemLista.findViewById(R.id.medida3TV);

        //Cambio el texto de los text views, en base a los valores del objeto:
        nombreMedidaTV.setText(objMedidaActual.getNombre());
        medida1TV.setText(objMedidaActual.getMedida1());
        medida2TV.setText(objMedidaActual.getMedida2());
        medida3TV.setText(objMedidaActual.getMedida3());

        //Devuelvo el item con los valores del Objeto:
        return ItemLista;
    }
}