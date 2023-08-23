package com.ByteBank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.ByteBank.modelo.Cliente;
import com.ByteBank.modelo.Cuenta;
import com.ByteBank.modelo.CuentaCorriente;


public class TestArrayList {

    /* El metodo ArrayList es una clase que permite crear un array dinamico
    * es decir, que no tiene un limite de elementos como el array tradicional
    * y que ademas permite agregar elementos de cualquier tipo de dato 
    * (int, String, boolean, etc) */

    public static void main(String[] args) {
        
        /* El operador de diamante o <> sirve para indicar que el array dinamico
         * Solo puede almacenar objetos de tipo Cuenta o de sus subclases
         * (CuentaCorriente, CuentaAhorro, etc).
         * con el operador de diamante se fuerza a que acepte un solo tipo de objeto 
         * como en este caso que se indica que el array dinamico es de tipo Cuenta
         */

         // En el primer diamante es obligatorio especificar, en el segun no lo es
        List<Cliente> listaClientes = new LinkedList<>();
        // Existe otro metodo de array lista que es el Vector, pero este es mas antiguo y no se usa mucho en la actualidad, el vector es un array dinamico sincronizado, thread safe o seguro para hilos de ejecucion (multihilos), es decir, que es seguro para hilos, pero es mas lento que el ArrayList y el LinkedList.
        
        List<Cuenta> lista = new ArrayList<>();

        Cuenta cc = new CuentaCorriente(22, 33);
        Cuenta cc2 = new CuentaCorriente(13, 27);
        Cuenta cc3 = new CuentaCorriente(22, 33);

        /* El metodo adicionar o add sirve para agregar elementos al array dinamico */
        lista.add(cc);
        lista.add(cc2);

        // Cliente cliente = new Cliente();
        // lista.add(cliente);

        /* Mientras que el metodo obtener o get sirve para obtener un elemento del array dinamico */

        Cuenta obtenerCuenta = (Cuenta) lista.get(0);
        System.out.println(obtenerCuenta);

        /* El metodo size sirve para obtener el tamaño del array dinamico */
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        /* El metodo for each  */
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        

        boolean contiene = lista.contains(cc);
        if (contiene) {
            System.out.println("si, es igual (equals)");
        }
    }
}
