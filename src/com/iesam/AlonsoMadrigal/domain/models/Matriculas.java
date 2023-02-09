package com.iesam.AlonsoMadrigal.domain.models;

public class Matriculas {
    private String id;
    private Cursos curso;

    private Alumnos alumnos;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cursos getCurso(Cursos curso1) {
        return curso;
    }



    public Alumnos getAlumnos(Alumnos alumno1){
        return alumnos;
    }
}
