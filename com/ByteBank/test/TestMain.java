package com.ByteBank.test;

public class TestMain {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
       
        int edad = 20;
        int edad2 = 15;
        int edad3 = 67;

        // ¿Existe modo de agrupar las edades en una sola referencia? Si lo hay, los arrays Los arrays son un tipo de dato que nos permite agrupar datos de un mismo tipo en una sola referencia.
        // Indices son los numeros que se encuentran dentro de los corchetes. Los indices empiezan en 0. 

        int[] edades = new int[5];
        edades[2] = 30;

        System.out.println(edades[2]);
        System.out.println(edades[0]);

        int LengthArray = edades.length;
        System.out.println(LengthArray);
 
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }

    }
}
