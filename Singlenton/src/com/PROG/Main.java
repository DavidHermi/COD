package com.PROG;

public class Main {

    public static void main(String[] args) {
        System.out.println("Proyecto para aprender a hacer un Singleton");



        Singlenton miUnicaInstancia = Singlenton.getInstance();

        miUnicaInstancia.setEdad(20);
        miUnicaInstancia.setNombre("Pepe");


        Singlenton otraInstanciaSeraLaMisma = Singlenton.getInstance();

        otraInstanciaSeraLaMisma.setEdad(34);



        Singlenton versionInstancia = Singlenton.getInstance();
        versionInstancia.setNombre("version 1.1");


    }
}
