package com.ByteBank.test;

import com.ByteBank.modelo.Cuenta;
import com.ByteBank.modelo.CuentaCorriente;
import com.ByteBank.modelo.GuardaReferencias;

public class TestGuardaReferencias {
    
    public static void main(String[] args) {

        GuardaReferencias guardaReferencias = new GuardaReferencias();
        Cuenta cc = new CuentaCorriente(17, 32);
        guardaReferencias.adicionar(cc);
        Cuenta cc2 = new CuentaCorriente(28, 67);
        guardaReferencias.adicionar(cc2);

        System.out.println(guardaReferencias.obtener(0));
        System.out.println(guardaReferencias.obtener(1));

        
    }
}
