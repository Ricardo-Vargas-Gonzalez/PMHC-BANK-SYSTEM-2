package com.ByteBank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ByteBank.modelo.Cliente;
import com.ByteBank.modelo.Cuenta;
import com.ByteBank.modelo.CuentaAhorros;
import com.ByteBank.modelo.CuentaCorriente;

public class TestOrdenarLista {
    public static void main(String[] args) {

        Cuenta cc1 = new CuentaCorriente(2, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaAhorros(62, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Renato");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaAhorros(32, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Noel");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Antes de ordenar: ");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        // Ordenar las cuentas por el numero de cuenta
        // Cualquier clase hija Cuenta
        // Comparator <T> es una interfaz funcional, es decir, que solo tiene un metodo
        // abstracto
        // Comparator <? extends Cuenta> c
        // Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
        // lista.sort(comparator);
        lista.sort(new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
            return Integer.compare(o1.getNumero(), o2.getNumero());
            }
        });

        System.out.println("Despues de ordenar por numero de cuenta: ");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        // Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular();
        // se puede ordenar de otro modo, usando una interfaz funcional, es decir que solo tiene un metodo abstracto
        // lista.sort(new OrdenadorPorNombreTitular());

        //Forma antigua 
        Collections.sort(lista, new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre()); // Java entiende este codigo, a pesar de no tener una sintaxis visible, esta la implementa de manera implicita, esto se implementó a partir de java 8
            }
        });

        System.out.println("Despues de ordenar por nombre de Titular: ");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        // Existe un metodo mas el cual estaba vigente hasta java 8, el metodo collections.sort que recibe una lista y un comparator, ordenando la lista con el comparator que se le pasa como parametro
        Collections.sort(lista, new OrdenadorPorNombreTitular());
        System.out.println("Despues de ordenar por nombre de Titular: ");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        // No obstane este es un metodo sobrecargado, por lo cual se puede usar de la siguiente manera
        Collections.sort(lista);
        System.out.println("Despues de ordenar por Orden Natural: ");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta o1, Cuenta o2) {

        /* Forma basicas de ordenar
        * if (o1.getNumero() < o2.getNumero()) {
        * return 0;
        * } else if (o1.getNumero() > o2.getNumero()) { return 1;
        * } else { return -1; } */
        // Forma intermedia
        //return o1.getNumero() - o2.getNumero();
        // forma Wrapper
        return Integer.compare(o1.getNumero(), o2.getNumero());
    
    }
}

class OrdenadorPorNombreTitular implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        return o1.getTitular().getNombre()
                .compareTo(o2.getTitular().getNombre());
    }
}