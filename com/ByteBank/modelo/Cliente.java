package com.ByteBank.modelo;

public class Cliente implements Autenticable {
    String nombre;
    String documento;
    String telefono;

    private AutenticacionUtil util;

    public Cliente() {
        this.util = new AutenticacionUtil();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
