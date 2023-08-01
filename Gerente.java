public class Gerente extends Funcionario implements Autenticable {

    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String cave) {
        return clave == "AluraOnLine";
    }

    /*
     * la palabra super, llama a los metodos
     * de la clase padre
     */
    /*
     * esto tambien es sobreescritura del
     * metodo pues se usa la misma firma del metodo pero se reescribe segun su
     * propia logica
     */
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE EL GERENTE ");
        return super.getSalario() 
                + this.getSalario() * 0.5;
    }
}
