package com.ByteBank.test;

import com.ByteBank.modelo.CuentaAhorros;
import com.ByteBank.modelo.CuentaCorriente;
 
public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc 
                = new CuentaCorriente(1, 1);
        CuentaAhorros ca 
                = new CuentaAhorros(2, 3);
        cc.depositar(2000);
        cc.transferir(1000, ca);

        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}
