package com.ByteBank.test;

import com.ByteBank.modelo.Contador;
import com.ByteBank.modelo.ControlBonificacion;
import com.ByteBank.modelo.Funcionario;
import com.ByteBank.modelo.Gerente;
 
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
