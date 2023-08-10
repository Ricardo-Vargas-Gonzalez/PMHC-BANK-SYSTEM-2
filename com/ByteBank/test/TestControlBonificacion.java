package com.ByteBank.test;

import com.ByteBank.modelo.*;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setSalario(2000);

        Gerente Ximena = new Gerente();
        Ximena.setSalario(10000);

        Contador alexis = new Contador();
        alexis.setSalario(5000);

        ControlBonificacion controlBonificacion = 
                new ControlBonificacion();
        
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(Ximena);
        controlBonificacion.registrarSalario(alexis);


    }
}
