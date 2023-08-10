package com.ByteBank.test;

import com.ByteBank.modelo.Contador;
import com.ByteBank.modelo.Funcionario;

public class testFuncionario {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setNombre("diego");
        diego.setDocumento("1234567");
        diego.setSalario(2000);

        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
}
