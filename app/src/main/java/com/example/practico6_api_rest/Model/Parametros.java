package com.example.practico6_api_rest.Model;

import java.util.List;

class Parametros {

    private List<String> campos;

    private List<String> provincia;


    public Parametros() {
    }

    public Parametros(List<String> campos) {
        this.campos = campos;
    }

    public List<String> getCampos() {
        return campos;
    }

    public void setCampos(List<String> campos) {
        this.campos = campos;
    }

    public List<String> getProvincia() {
        return provincia;
    }

    public void setProvincia(List<String> provincia) {
        this.provincia = provincia;
    }


    @Override
    public String toString() {
        return "Parametros{" +
                "campos=" + campos +
                ", provincia=" + provincia +
                '}';
    }
}
