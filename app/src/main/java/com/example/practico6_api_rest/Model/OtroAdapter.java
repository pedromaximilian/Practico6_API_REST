package com.example.practico6_api_rest.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.practico6_api_rest.R;

import java.util.List;

public class OtroAdapter extends ArrayAdapter<Municipios> {

    private Context context;
    private List<Municipios> listaMunicipios;
    private LayoutInflater li;

    public OtroAdapter(@NonNull Context context, int resource, @NonNull Municipios[] objects, Context context1, List<Municipios> listaMunicipios, LayoutInflater li) {
        super(context, resource, objects);
        this.context = context1;
        this.listaMunicipios = listaMunicipios;
        this.li = li;
    }

    public OtroAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public OtroAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public OtroAdapter(@NonNull Context context, int resource, @NonNull Municipios[] objects) {
        super(context, resource, objects);
    }

    public OtroAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Municipios[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public OtroAdapter(@NonNull Context context, int resource, @NonNull List<Municipios> objects) {
        super(context, resource, objects);
    }

    public OtroAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Municipios> objects) {
        super(context, resource, textViewResourceId, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;

        if (itemView==null){
            itemView = li.inflate(R.layout.itemlistview,parent,false);

        }
        Municipios municipios = listaMunicipios.get(position);

        TextView tvNombre = itemView.findViewById(R.id.tvNombre);
        tvNombre.append(municipios.getNombre());

        TextView tvID = itemView.findViewById(R.id.tvID);
        tvID.setText(municipios.getId());

        return itemView;
    }
}
