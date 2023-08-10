package com.ByteBank.test;

import com.ByteBank.modelo.*;

public class TestCuentaExceptionSaldo {
    
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.depositar(210);
        try {
            cuenta.sacar(200);
            cuenta.sacar(10);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
