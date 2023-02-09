package com.iesam.AlonsoMadrigal.presentacion;

import com.iesam.AlonsoMadrigal.domain.models.*;

public class Main {
    public static void main(String[] args) {
        Alumnos alumno1 = new Alumnos();
        alumno1.setId("1");
        alumno1.setNombre("Javier");
        alumno1.setApellidos("Castillo");
        alumno1.setDni("70845257J");
        alumno1.setDireccion("Agustin rodiguez");
        alumno1.setMadre("Eva");
        alumno1.setPadre("Pedro");
        alumno1.setEmail("nose@gmail.com");

        Alumnos alumno2 = new Alumnos();
        alumno2.setId("1");
        alumno2.setNombre("Javier");
        alumno2.setApellidos("Castillo");
        alumno2.setDni("70845257J");
        alumno2.setDireccion("Agustin rodiguez");
        alumno2.setMadre("Eva");
        alumno2.setPadre("Pedro");
        alumno2.setEmail("nose@gmail.com");

        Profesores profesor1 = new Profesores();
        profesor1.setId("1");
        profesor1.setNombre("Javier");
        profesor1.setApellidos("Castillo");
        profesor1.setDni("70845257J");
        profesor1.setDireccion("Agustin rodiguez");
        profesor1.setTitulo("Magisterio");
        profesor1.setFecha_alta("8/8/1998");

        Clase_docente clase_docente1 = new Clase_docente();
        clase_docente1.setId("1");
        clase_docente1.setPlanta("3ª");
        clase_docente1.setCapacidad(50);
        clase_docente1.setSillas(50);
        clase_docente1.setTipo_pizarra("tactil");

        Clase_ordenadores clase_ordenadores1 = new Clase_ordenadores();
        clase_ordenadores1.setId("1");
        clase_ordenadores1.setPlanta("3ª");
        clase_ordenadores1.setCapacidad(50);
        clase_ordenadores1.setNºordenadores(50);
        clase_ordenadores1.setTipo_ordenadores("oficina");



        Cursos curso1 = new Cursos();
        curso1.setId("1");
        curso1.setNombre("SMR");
        curso1.setDescripcion("Sistemas microinformaticos y redes");


        Matriculas matricula1 = new Matriculas();
        matricula1.setId("1");
        matricula1.getCurso(curso1);
        matricula1.getAlumnos(alumno1);
    }
}