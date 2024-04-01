public class ClaseB {
    private double atributo1;
    private boolean atributo2;

    /**
     * Este es el constructor de la clase ClaseB.
     *
     * @param atributo1 Valor para inicializar el atributo1.
     * @param atributo2 Valor para inicializar el atributo2.
     */
    public ClaseB(double atributo1, boolean atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    /**
     * Este método realiza una operación sobre los atributos de la clase.
     *
     * @param factor Valor double por el cual se multiplica atributo1.
     * @return El resultado de multiplicar atributo1 por el parámetro factor.
     */
    public double metodo2(double factor) {
        return atributo1 * factor;
    }

    /**
     * Este método imprime los valores de los atributos de la clase.
     */
    public void imprimirAtributos() {
        System.out.println("Atributo 1: " + atributo1);
        System.out.println("Atributo 2: " + atributo2);
    }
}
