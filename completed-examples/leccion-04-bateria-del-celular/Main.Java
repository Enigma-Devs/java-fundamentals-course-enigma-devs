

// Leccion 4: Bateria del celular
// Comparaciones y estructuras repetitivas (if-else, while y for)

public class Main {
    public static void main(String[] args) {

        // if-else: el programa decide segun una comparacion sea true o false
        int bateria = 10;
        if (bateria < 20) {
            System.out.println("Bateria baja: conecta el cargador");
        } else {
            System.out.println("Bateria bien");
        }

        // while: repite mientras la condicion sea true
        // (no se sabe cuantas veces se repite un proceso x
        while (bateria < 100) {
            bateria = bateria + 10; // si olvidas esta linea: ciclo infinito
            System.out.println("Cargando: " + bateria + "%");
        }

        // for: repite un numero exacto de veces
        // inicio; condicion; paso
        for (int i = 1; i <= 3; i++) {
            System.out.println("Notificacion " + i + ": tienes un mensaje nuevo");
        }
    }
}