package com.ByteBank.modelo;

/* Es necesario hacer notar que, si bien no es
 * Forzoso que en el nombre de la clase se use 
 * la palabra Exception, es una buena practica
 * para que el programador sepa que esta clase
 * es una excepcion */

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
