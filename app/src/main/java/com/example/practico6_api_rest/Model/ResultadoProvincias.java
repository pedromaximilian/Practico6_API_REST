package com.example.practico6_api_rest.Model;

import java.util.List;

public class ResultadoProvincias {


    //https://apis.datos.gob.ar/georef/api/provincias?campos=id,nombre
        private List<Provincias> provincias;

        private String total;

        private String inicio;

        private String cantidad;

        private Parametros parametros;

    public ResultadoProvincias() {
    }

    public ResultadoProvincias(List<Provincias> provincias, String total, String inicio, String cantidad, Parametros parametros) {
        this.provincias = provincias;
        this.total = total;
        this.inicio = inicio;
        this.cantidad = cantidad;
        this.parametros = parametros;
    }

    public List<Provincias> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincias> provincias) {
        this.provincias = provincias;
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
        return "ResultadoProvincias{" +
                "provincias=" + provincias +
                ", total='" + total + '\'' +
                ", inicio='" + inicio + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", parametros=" + parametros +
                '}';
    }
}
