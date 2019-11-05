package com.example.practico6_api_rest.Model;

import java.util.List;

public class ResultadoMunicipios {
    private List<Municipios> municipios;

    private String total;

    private String inicio;

    private String cantidad;

    private Parametros parametros;


    public ResultadoMunicipios() {
    }

    public ResultadoMunicipios(List<Municipios> municipios, String total, String inicio, String cantidad, Parametros parametros) {
        this.municipios = municipios;
        this.total = total;
        this.inicio = inicio;
        this.cantidad = cantidad;
        this.parametros = parametros;
    }

    public List<Municipios> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipios> municipios) {
        this.municipios = municipios;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Parametros getParametros() {
        return parametros;
    }

    public void setParametros(Parametros parametros) {
        this.parametros = parametros;
    }


    @Override
    public String toString() {
        return "ResultadoMunicipios{" +
                "municipios=" + municipios +
                ", total='" + total + '\'' +
                ", inicio='" + inicio + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", parametros=" + parametros +
                '}';
    }
}
