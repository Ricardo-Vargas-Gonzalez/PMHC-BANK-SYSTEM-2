package com.ByteBank.test;

import java.util.ArrayList;
import java.util.List;

public class TestComplementArray {
    public static void main(String[] args) {
        int numero = 40;
        // wrapper class o clase envolvente sirve para convertir un tipo de dato primitivo en un objeto, es decir, que se puede convertir un int en un Integer, un double en un Double, etc. Lo que facilita el uso de los metodos de las clases.
        // Integer numeroObjeto =new Integer(40); deprecated
        Integer numeroObjeto = Integer.valueOf(40);

        List<Integer> lista = new ArrayList<>();

        // primitivo != objeto
        lista.add(numero); // Autoboxing es la conversion automatica de un tipo de dato primitivo a un objeto
        lista.add(Integer.valueOf(40));
        lista.add(numeroObjeto);

        // unboxing
        // Int valorPrimitivo = numeroObjeto;
        int valorPrimitivo = numeroObjeto.intValue(); // Unboxing es la conversion automatica de un objeto a un tipo de dato primitivo

        Byte byteInteger = numeroObjeto.byteValue();
        double doubleInteger = numeroObjeto.doubleValue();
        float floatInteger = numeroObjeto.floatValue();

        System.out.println(Integer.MAX_VALUE); // 2^31 - 1, esto significa que el valor maximo que puede tener un int es 2^31 - 1
        System.out.println(Integer.MIN_VALUE); // -2^31, esto significa que el valor minimo que puede tener un int es -2^31

        System.out.println(Integer.SIZE); // 32 BITS
        System.out.println(Integer.BYTES); // 4 BYTES
    }
}
