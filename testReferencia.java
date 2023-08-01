class testReferencia {
    public static void main(String[] args) {

        /* 
         * El elemento mas generico puede ser adaptado
         * al mas específico
         */
        Funcionario funcionario = new Contador();
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Ximena");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);
    }
}