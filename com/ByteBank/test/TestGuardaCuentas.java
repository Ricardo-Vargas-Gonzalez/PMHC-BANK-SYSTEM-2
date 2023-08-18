package com.ByteBank.test;

import com.ByteBank.modelo.Cuenta;
import com.ByteBank.modelo.CuentaCorriente;
import com.ByteBank.modelo.GuardaCuentas;

public class TestGuardaCuentas {

    public static void main(String[] args) {
        
        GuardaCuentas guardaCuentas = new GuardaCuentas();
        Cuenta cc = new CuentaCorriente(11, 22);
        guardaCuentas.adicionar(cc);
        Cuenta cc2 = new CuentaCorriente(22, 44);
        guardaCuentas.adicionar(cc2);

        System.out.println(guardaCuentas.obtener(0));
        System.out.println(guardaCuentas.obtener(1));
    }

}