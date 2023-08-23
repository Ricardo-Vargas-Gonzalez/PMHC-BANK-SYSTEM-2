package com.ByteBank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ByteBank.modelo.Cliente;
import com.ByteBank.modelo.Cuenta;
import com.ByteBank.modelo.CuentaAhorros;
import com.ByteBank.modelo.CuentaCorriente;

public class TestLamba {
    public static void main(String[] args) {

        Cuenta cc1 = new CuentaCorriente(2, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new  CuentaAhorros(62, 44);
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

        // Esto es una función  anónima, porque no tiene nombre, y se le llama lambda porque se puede pasar como parámetro. lo que te reduce muchas lineas de código
        lista.sort(/*new Comparator<Cuenta>() {
            *Al eliminarse esta parte de código solo te quedas con lo que está dentro del método compare, y es por eso que se le llama expresión lambda, porque es una expresión que se reduce a lo que te interesa, que es la lógica, y se elimina todo lo demás.
            @Override
            public int compare*/(Cuenta o1, Cuenta o2) ->
             Integer.compare(o1.getNumero(), o2.getNumero())
        ); /* lambda permite quitar la llave y el return tambien y hacer mas directa la implementación de la interfaz funcional */

        System.out.println("Despues de ordenar por numero de cuenta: ");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        // Otra implementación del lambda
        Collections.sort(lista, (c1, c2) -> c1.getTitular().getNombre()
                .compareTo(c2.getTitular().getNombre())
        ); // Básiamente es una operación matematica que se puede reducir a una expresión lambda

        System.out.println("Despues de ordenar por nombre de Titular: ");

        // por medio de los lambdas las listas tambien pueden ordenarse por si mismas:
        
        lista.forEach( cuenta -> System.out.println(cuenta));

        // Los lambdas son muy utiles para ordenar listas, pero tambien se pueden usar para filtrar listas, por ejemplo: 
        // lista.removeIf(cuenta -> cuenta.getSaldo() < 200); o tambien se puede hacer asi:
        // lista.removeIf(cuenta -> { return cuenta.getSaldo() < 200; });

        Collections.sort(lista, new OrdenadorPorNombreTitular());
        System.out.println("Despues de ordenar por nombre de Titular: ");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        
        Collections.sort(lista);
        System.out.println("Despues de ordenar por Orden Natural: ");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }
    
}
