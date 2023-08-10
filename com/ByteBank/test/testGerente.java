package com.ByteBank.test;

import com.ByteBank.modelo.Gerente;

public class testGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        //gerente.setSalario(5000);
        // Funcionario gerente = new Funcionario();
        gerente.setSalario(6000);
        gerente.setClave("AluraOnLine");
        gerente.setTipo(1);

        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("AluraOnLine"));
    }
}
