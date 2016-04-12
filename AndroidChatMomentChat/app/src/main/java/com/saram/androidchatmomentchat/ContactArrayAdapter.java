package com.saram.androidchatmomentchat;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactArrayAdapter extends ArrayAdapter<Contact> {

    public ContactArrayAdapter(Context context, List<Contact> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //GET ALL THE CONTACTS IN THE DATABASE WITH NAME AND PHONE

        //Salvando la referencia del View de la fila
        View listItemView = convertView;

        //Comprobando si el View no existe
        if (null == convertView) {
            //Si no existe, entonces inflarlo con image_list_view.xml
            listItemView = inflater.inflate(
                    R.layout.list_item,
                    parent,
                    false);
        }

        //Obteniendo instancias de los elementos
        TextView titulo = (TextView)listItemView.findViewById(R.id.text_item_name);
        TextView subtitulo = (TextView)listItemView.findViewById(R.id.text_item_phone);


        //Obteniendo instancia de la Tarea en la posición actual
        Contact item = getItem(position);

        titulo.setText(item.getName());
        subtitulo.setText(item.getPhone());

        //Devolver al ListView la fila creada
        return listItemView;

    }
}