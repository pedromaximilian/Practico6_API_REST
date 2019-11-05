package com.example.practico6_api_rest.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.practico6_api_rest.Model.AdaptadorMunicipios;
import com.example.practico6_api_rest.Model.Municipios;
import com.example.practico6_api_rest.Model.ResultadoMunicipios;
import com.example.practico6_api_rest.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerProvincias;
    ListView listViewMunicipios;
    MainViewModel mainViewModel;
    List<Municipios> listaMunicipios;
    Button btnBuscar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        configView();
    }

    private void configView() {

        spinnerProvincias = findViewById(R.id.spinnerProvincias);
        listViewMunicipios = findViewById(R.id.listviewPrincipal);
        btnBuscar = findViewById(R.id.btnBuscar);
        listaMunicipios = new ArrayList<>();


        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getResultadoMunicipios().observe(this, new Observer<ResultadoMunicipios>() {
            @Override
            public void onChanged(ResultadoMunicipios resultadoMunicipios) {
                //listaMunicipios.clear();
                listaMunicipios = resultadoMunicipios.getMunicipios();
                Toast.makeText(MainActivity.this, listaMunicipios.get(1).toString(), Toast.LENGTH_SHORT).show();
                //AdaptadorMunicipios adaptadorMunicipios = new AdaptadorMunicipios(getApplicationContext(), listaMunicipios);
                //listViewMunicipios.setAdapter(adaptadorMunicipios);
            }
        });





        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //listaMunicipios.add(new Municipios(1, "muni 1"));



                mainViewModel.buscarMunicipios("San Luis");
            }
        });


    }
}