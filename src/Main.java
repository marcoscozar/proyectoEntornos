public class Main {

        public static void main(String[] args) {
            // Crear objetos de las clases ClaseA y ClaseB
            ClaseA objetoA = new ClaseA(10, "Hola");
            ClaseB objetoB = new ClaseB(3.14, true);

            // Utilizar los métodos de las clases
            int resultadoMetodo1 = objetoA.metodo1(5);
            System.out.println("Resultado de metodo1 de ClaseA: " + resultadoMetodo1);

            double resultadoMetodo2 = objetoB.metodo2(2.0);
            System.out.println("Resultado de metodo2 de ClaseB: " + resultadoMetodo2);

            // Imprimir los atributos de los objetos
            System.out.println("Atributos de objetoA:");
            objetoA.imprimirAtributos();

            System.out.println("Atributos de objetoB:");
            objetoB.imprimirAtributos();
        }
    }


