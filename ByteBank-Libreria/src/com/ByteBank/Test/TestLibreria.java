package com.ByteBank.Test;

import com.ByteBank.modelo.Cuenta;
import com.ByteBank.modelo.CuentaCorriente;

public class TestLibreria {

    public static void main(String[] args) {
        Cuenta cuenta = new CuentaCorriente(12, 12);
        cuenta.depositar(200.0);
    }
}