package com.ByteBank.test;

import com.ByteBank.modelo.CuentaCorriente;

public class testToString {
    public static void main(String[] args) {
        
        Object cc = new CuentaCorriente(22, 33);
        Object cp = new CuentaCorriente(33, 22);

        System.out.println(cc);
        System.out.println(cp);
    }
}
