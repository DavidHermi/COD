package com.PROG;

public class Singlenton {

    private String nombre;
    private Integer edad;


    private static Singlenton instance = null;


    private Singlenton() {
    }


    public static Singlenton getInstance() {

        if (instance == null) {

            instance = new Singlenton();
        }

        return instance;
    }


    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
