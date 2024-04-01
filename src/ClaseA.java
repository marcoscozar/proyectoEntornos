public class ClaseA {
        private int atributo1;
        private String atributo2;

        /**
         * Este es el constructor de la clase ClaseA.
         *
         * @param atributo1 Valor para inicializar el atributo1.
         * @param atributo2 Valor para inicializar el atributo2.
         */
        public ClaseA(int atributo1, String atributo2) {
            this.atributo1 = atributo1;
            this.atributo2 = atributo2;
        }

        /**
         * Este método realiza una operación sobre los atributos de la clase.
         *
         * @param num Valor entero a sumar al atributo1.
         * @return La suma de atributo1 y el parámetro num.
         */
        public int metodo1(int num) {
            return atributo1 + num;
        }

        /**
         * Este método imprime los valores de los atributos de la clase.
         */
        public void imprimirAtributos() {
            System.out.println("Atributo 1: " + atributo1);
            System.out.println("Atributo 2: " + atributo2);
        }
    }
