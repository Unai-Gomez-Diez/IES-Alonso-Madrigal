package com.iesam.AlonsoMadrigal.domain.models;

import java.util.Date;

public class Profesores extends Persona{
    private String titulo;
    private String  fecha_alta;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
}
