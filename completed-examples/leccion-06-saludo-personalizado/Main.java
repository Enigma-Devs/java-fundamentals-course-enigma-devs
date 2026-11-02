// Leccion 6: Saludo personalizado
// Scanner, metodos y estructuras condicionales.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Como te llamas? ");
        String nombre = sc.nextLine();
        System.out.print("En que anio naciste? ");
        int anio = sc.nextInt();

        int edad = calcularEdad(anio);
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " anios.");

        if (edad < 13) {
            System.out.println("Estas empezando muy temprano: eres un genio en camino!");
        } else if (edad < 18) {
            System.out.println("Buen momento para aprender a programar!");
        } else {
            System.out.println("Nunca es tarde para aprender a programar!");
        }
    }

    public static int calcularEdad(int anio) {
        return 2026 - anio;
    }
}
