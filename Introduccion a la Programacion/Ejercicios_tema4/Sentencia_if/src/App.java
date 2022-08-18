public class App {

    /*
     * Ejercicio Sentencia if
     * Usando un if, crear una condición que compare si la variable numeroIf es
     * positivo, negativo, o 0.
     * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
     */

    public static void main(String[] args) throws Exception {

        int a = 10;

        if (a > 0) {
            System.out.println("El numero " + a + " es positivo.");
        } else if (a < 0) {
            System.out.println("El numero " + a + " es negativo.");
        } else {
            System.out.println("El numero " + a + " es igual a 0");
        }
    }
}
