/* Use las clases cuenta y cliente del proyecto hermano
* de este proyecto, bytebank, donde se exploraron las
* de java orrientado a objetos (JOO) pues serán de
utilidad en este proyecto */

public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    /*
     * static nos señala que la variable no será alterada por la instancia sino
     * unicamente por la clase que la esté usando
     */
    private static int total;

    public Cuenta() {

    }

    /*
     * Este es un constructor porque a traves de este metodo al definir el objeto,
     * ya lo podemos manipular desde su concepción, e inicializar los atributos
     * este es el poder del constructor, nos fuerza a dar información para que
     * nuestra regla de negocio funcione
     */
    public Cuenta(int agencia, int numero) {
            this.agencia = agencia;
            this.numero = numero;
            System.out.println("Estoy creanddo una cuenta nueva");
            
            Cuenta.total++;
    }

    // Void solo ejecuta el codigo, pero es un metodo que no devuelve nada.
    public abstract void depositar(double valor);

    // Este metodo si retorna valor
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }

    /*
     * Cuando se busca obtener un metodo, o un valor de
     * una variable privada, se comienza con el mmetodo get
     * esto es por convención
     */
    public double getSaldo() {
        return this.saldo;
    }

    /*
     * Por otro lado, mientras el metodo get es para
     * obtener, el metodo set, es para asignar
     */

    public int getAgencia() {
        return this.agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

    public int getNumero() {
        return numero;
    }

}