package com.ByteBank.modelo;

public interface Autenticable {
     
    /* Una clase abstracta puede tener variables una
     * interfaz no, son abstractas y no necesita ponerse
     * los osbreenntiende el sistema
     */

    public void setClave(String clave);

    public boolean iniciarSesion(String cave);

}
