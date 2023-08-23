package com.ByteBank.test;

public class TestWrappers {
    public static void main(String[] args) {
        
        Double doubleNumber = 33.0; // autoboxing
        Boolean verdadero = true; // autoboxing

        Double doubleNumber2 = Double.valueOf(33);

        String numeroString = "77"; // autoboxing

        /* Un string puede ser convertido a un numero de tres formas posibles. 
        * La primera es el metodo stringToDouble, 
        * la segunda es el metodo stringToInteger 
        * y la tercera es el metodo parseDouble  */

        /* El metodo stringToDouble convierte un string a un double */
        Double stringToDouble = Double.valueOf(numeroString);

        /* El metodo stringToInteger convierte un string a un integer */
        Integer stringToInteger = Integer.valueOf(numeroString);

        /* El metodo parseDouble, al igual que el metodo stringToDouble, convierte un string a un double */
        Double stringToDouble2 = Double.parseDouble(numeroString);

        System.out.println(stringToDouble);
        System.out.println(stringToInteger);
        System.out.println(stringToDouble2);

        Number number = Integer.valueOf(5);
        double numberDoublePrim = number.doubleValue(); // unboxing // Es primitivo porque no es un objeto

        Boolean falso =  Boolean.FALSE;

    }
}
