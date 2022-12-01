package com.tutorialesprogramacionya.proyecto079;

public class Signo {
    private String nombre;
    private int imagen;
    private String titulo;
    private String descripcion;

    public Signo(String nombre,int imagen, String titulo, String descripcion) {
        this.nombre=nombre;
        this.imagen = imagen;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre(){
        return nombre;
    }
}