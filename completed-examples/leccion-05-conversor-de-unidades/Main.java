// Leccion 5: Conversor de unidades
// Metodos con parametros y valores de retorno.

public class Main {
    public static void main(String[] args) {
        System.out.println("5 km = " + kmAMillas(5) + " millas");
        System.out.println("42 km = " + kmAMillas(42) + " millas");
        System.out.println("30 C = " + celsiusAFahrenheit(30) + " F");

        System.out.println("=== Tabla de conversion ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " km = " + kmAMillas(i) + " millas");
        }
    }

    public static double kmAMillas(double km) {
        return km * 0.621371;
    }

    public static double celsiusAFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }
}
