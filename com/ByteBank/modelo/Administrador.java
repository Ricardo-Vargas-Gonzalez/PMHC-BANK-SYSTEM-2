package com.ByteBank.modelo; /* La primer linea del codigo de java siempre será la declaración del package */

public class Administrador extends Funcionario implements Autenticable {

    private AutenticacionUtil util;

    public Administrador() {
        this.util = new AutenticacionUtil();
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();    
    } 
    
}
