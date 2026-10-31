

// Leccion 3: Plan de ahorro
// Operadores + - * / % y actualizar una variable.

public class Main {
    public static void main(String[] args) {
        // Variables del plan (como en la leccion 2)
        int precio = 180;
        int ahorroSemanal = 25;

        // Multiplicar: ¿cuanto juntas en un mes (4 semanas)?
        System.out.println("En un mes juntas: " + (ahorroSemanal * 4) + " soles");

        // Dividir: int / int da solo la parte entera (180 / 25 = 7, no 7.2)
        int semanas = precio / ahorroSemanal;
        System.out.println("Semanas completas: " + semanas);

        // Resto con %: lo que sobra de la division
        int sobra = precio % ahorroSemanal;
        System.out.println("Te faltan despues de " + semanas + " semanas: " + sobra + " soles");

        // Actualizar una variable: el = guarda, no compara
        int ahorrado = 0;
        ahorrado = ahorrado + ahorroSemanal; // semana 1
        ahorrado = ahorrado + ahorroSemanal; // semana 2
        System.out.println("Llevas ahorrado: " + ahorrado + " soles");

        // Los parentesis hacen que Java reste antes de unir con el texto
        System.out.println("Te faltan: " + (precio - ahorrado) + " soles");
    }
}