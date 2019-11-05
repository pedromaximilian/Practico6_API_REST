package com.example.practico6_api_rest.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.practico6_api_rest.R;

import java.util.List;

public class AdaptadorMunicipios extends BaseAdapter {
    private Context context;
    private List<Municipios> listaMunicipios;

    public AdaptadorMunicipios(Context context, List<Municipios> listaMunicipios) {
        this.context = context;
        this.listaMunicipios = listaMunicipios;
    }

    @Override
    public int getCount() {
        return listaMunicipios.size();
    }

    @Override
    public Object getItem(int i) {
        return listaMunicipios.get(i);
    }

    @Override
    public long getItemId(int i) {
        return Long.parseLong(listaMunicipios.get(i).getId());
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View vista = view;
        LayoutInflater inflater= LayoutInflater.from(context);
        vista = inflater.inflate(R.layout.itemlistview,null);

        TextView nombre = vista.findViewById(R.id.tvNombre);
        TextView id = vista.findViewById(R.id.tvID);

        Municipios municipio = listaMunicipios.get(position);


        nombre.setText(municipio.getNombre());
        id.setText(municipio.getId()+"");


        return view;

    }
}
