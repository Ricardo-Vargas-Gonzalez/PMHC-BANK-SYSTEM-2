package com.ByteBank.test;

import com.ByteBank.modelo.Cuenta;
import com.ByteBank.modelo.CuentaAhorros;
import com.ByteBank.modelo.SaldoInsuficienteException;

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
