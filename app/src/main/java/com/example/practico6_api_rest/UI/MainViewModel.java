package com.example.practico6_api_rest.UI;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.practico6_api_rest.Model.Municipios;
import com.example.practico6_api_rest.Model.ResultadoMunicipios;
import com.example.practico6_api_rest.Request.ApiMunicipios;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends AndroidViewModel {

    private MutableLiveData<ResultadoMunicipios> resulradoMunicipiosLiveData;
    Context context;
    List munis;


    public MainViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();

    }



    public void buscarMunicipios(String provincias){

        final Call<ResultadoMunicipios> datos = ApiMunicipios.getMyApiClient().leer(provincias);
        
        datos.enqueue(new Callback<ResultadoMunicipios>() {
            @Override
            public void onResponse(Call<ResultadoMunicipios> call, Response<ResultadoMunicipios> response) {
                munis= response.body().getMunicipios();

                ResultadoMunicipios resultadoMunicipios = response.body();
                setResulradoMunicipiosLiveData(resultadoMunicipios);
                //Toast.makeText(context, "Estoy en el if  del onresponse", Toast.LENGTH_SHORT).show();
                //Toast.makeText(context, munis.get(2).toString(), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFailure(Call<ResultadoMunicipios> call, Throwable t) {

                t.getMessage();


                Toast.makeText(context, "No existen respuestas a este codigo de ciudad", Toast.LENGTH_LONG).show();
                Toast.makeText(context, datos.request().url().toString(), Toast.LENGTH_LONG).show();







            }
        });


    }

    public LiveData<ResultadoMunicipios> getResultadoMunicipios(){
        if (resulradoMunicipiosLiveData==null){
            resulradoMunicipiosLiveData = new MutableLiveData<>();
        }

        return resulradoMunicipiosLiveData;
    }


    public void setResulradoMunicipiosLiveData(ResultadoMunicipios resultadoMunicipios){
        if (resulradoMunicipiosLiveData!=null){
            resulradoMunicipiosLiveData.postValue(resultadoMunicipios);
            //Toast.makeText(context, "resultado seteado", Toast.LENGTH_SHORT).show();
        }
    }



}
