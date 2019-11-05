package com.example.practico6_api_rest.Request;

import android.util.Log;

import com.example.practico6_api_rest.Model.ResultadoMunicipios;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class ApiMunicipios {

    private static final String PATH="https://apis.datos.gob.ar/georef/api/";
    private static  MyApiInterface myApiInteface;

    public static MyApiInterface getMyApiClient(){

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(PATH)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Log.d("mensaje",retrofit.baseUrl().toString());
        myApiInteface=retrofit.create(MyApiInterface.class);
        return myApiInteface;
    }


    public interface MyApiInterface {

        @GET("municipios")
        Call<ResultadoMunicipios> leer(@Query("provincia") String valor);
        }

}
