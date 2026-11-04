// Leccion 5: Conversor de unidades
// Presiona Run para ver los metodos de la leccion.
// Luego, ¡tu turno!: crea tu propio metodo y completa los pasos.
// Para usar una linea que empieza con //, borra las // del inicio.

public class Main {
    public static void main(String[] args) {
        // Ejemplo de la leccion: llamamos a los metodos con un dato
        System.out.println("5 km = " + kmAMillas(5) + " millas");
        System.out.println("30 C = " + celsiusAFahrenheit(30) + " F");

        // 1. Llama a kmAMillas con otro numero (por ejemplo, 42)
        // System.out.println("42 km = " + kmAMillas(42) + " millas");

        // 2. Crea el metodo kgALibras (mas abajo) y llamalo aqui
        //    con el peso de tu mochila
        // System.out.println("4 kg = " + kgALibras(4) + " libras");

        // Reto extra: con un for, muestra una tabla de temperaturas
        // de 0 a 40 grados, de 10 en 10 (pista: i = i + 10)

    }

    // Metodo de la leccion: recibe kilometros y devuelve millas
    public static double kmAMillas(double km) {
        return km * 0.621371;
    }

    // Metodo de la leccion: recibe grados Celsius y devuelve Fahrenheit
    public static double celsiusAFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    // 2. Crea aqui el metodo kgALibras: recibe un double y devuelve el peso por 2.2
    // public static double kgALibras(double kg) {
    //     return ...;
    // }
}