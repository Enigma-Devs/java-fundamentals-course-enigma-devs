// Leccion 4: Bateria del celular
// Presiona Run para ver el ejemplo de la leccion.
// Luego, ¡tu turno!: cambia la bateria y completa los pasos.
// Para usar una linea que empieza con //, borra las // del inicio.

public class Main {
    public static void main(String[] args) {
        // 1. Cambia la bateria por otro valor y presiona Run otra vez
        int bateria = 10;

        // Ejemplo de la leccion: el programa decide con if-else
        if (bateria < 20) {
            System.out.println("Bateria baja: conecta el cargador");
        } else {
            System.out.println("Bateria bien");
        }

        // 2. Carga la bateria de 5 en 5 hasta llegar a 100 con while
        //    ¡No olvides actualizar la variable dentro del while!
        // while (bateria < 100) {
        //     bateria = bateria + 5;
        //     System.out.println("Cargando: " + bateria + "%");
        // }

        // 3. Muestra 5 notificaciones con for
        // for (int i = 1; i <= ...; i++) {
        //     System.out.println("Notificacion " + i);
        // }

        // Reto extra: cuando llegue a 100, muestra "Carga completa"

    }
}