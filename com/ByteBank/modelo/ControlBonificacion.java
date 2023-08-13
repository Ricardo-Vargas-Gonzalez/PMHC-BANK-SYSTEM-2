package com.ByteBank.modelo;

public class ControlBonificacion {

    private double suma;

    public double registrarSalario(Funcionario funcionario) {
        this.suma = funcionario.getBonificacion() 
                + this.suma;
        System.out.println("Calculo actual " + this.suma);
        return this.suma;
    }
 
    /*
     * basta con realizar el registro de la clase madre,
     * en este caso registrarSalario de funcionario
     * aplicara para todas las clases hijas, que en este caso
     * son gerente y contador, por lo que no sería necesario
     * repetir el public double registrar salario
     */
    
}
