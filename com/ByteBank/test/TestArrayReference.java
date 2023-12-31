package com.ByteBank.test;

import com.ByteBank.modelo.Cliente;
import com.ByteBank.modelo.CuentaAhorros;
import com.ByteBank.modelo.CuentaCorriente;

public class TestArrayReference {

    public static void main(String[] args) {
        
        CuentaCorriente cc = new CuentaCorriente(23, 44);
        
        Object[] referencias = new Object[5];
        referencias[1] = cc;

        Cliente cliente = new Cliente();
        referencias[4] = cliente;

        Cliente  obtenido = (Cliente) referencias[4];
        System.out.println(obtenido);

        CuentaAhorros ca = new CuentaAhorros(44, 55);
        referencias[3] = ca;

        System.out.println(cc);
        System.out.println(referencias[1]);

        referencias[0] = new CuentaCorriente(11, 99);
        System.out.println(referencias[0]);

        // Cast: el casteo sirve para convertir un objeto de un tipo a otro tipo.
        CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
        System.out.println(cuenta);

        for (int i = 0; i < referencias.length; i++) {
            System.out.println(referencias[i]);
        }
    }
}
