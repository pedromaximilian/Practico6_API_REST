package com.example.practico6_api_rest.Model;

class Campos {
    private int id;
    private String nombre;

    public Campos(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Campos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
