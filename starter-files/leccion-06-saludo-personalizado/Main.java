// Leccion 6: Saludo personalizado
// Presiona Run, escribe tu nombre en la consola y presiona Enter.
// Luego, ¡tu turno!: haz que el programa pregunte tu anio de nacimiento.
// Para usar una linea que empieza con //, borra las // del inicio.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejemplo de la leccion: preguntamos el nombre y saludamos
        System.out.print("Como te llamas? ");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre + "!");

        // 1. Pregunta el anio de nacimiento y guardalo con nextInt()
        // System.out.print("En que anio naciste? ");
        // int anio = sc.nextInt();

        // 2. Calcula la edad con el metodo calcularEdad (esta mas abajo)
        // int edad = calcularEdad(anio);
        // System.out.println("Tienes " + edad + " anios.");

        // 3. Muestra un mensaje distinto segun la edad con if, else if y else
        // if (edad < 13) {
        //     ...
        // } else if (edad < 18) {
        //     ...
        // } else {
        //     ...
        // }

        // Reto extra: pregunta tambien tu comida favorita y mencionala en el saludo

    }

    // Metodo de la leccion: recibe el anio de nacimiento y devuelve la edad
    public static int calcularEdad(int anio) {
        return 2026 - anio;
    }
}