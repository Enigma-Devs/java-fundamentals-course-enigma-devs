// Leccion 9: Lista de contactos
// Presiona Run para ver la lista de la leccion.
// Luego, ¡tu turno!: crea tu propia lista y busca uno de tus contactos.
// Para usar una linea que empieza con //, borra las // del inicio.

class Contacto {
    // Atributos privados, como en la alcancia de la leccion 8
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters: permiten mirar los datos sin tocarlos
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

public class Main {
    public static void main(String[] args) {
        // Ejemplo de la leccion: un array guarda varios contactos juntos
        // 1. Cambia el 3 por 5 y llena las posiciones 3 y 4 con
        //    contactos de tus personajes favoritos
        Contacto[] contactos = new Contacto[3];
        contactos[0] = new Contacto("Ana", "999111222");
        contactos[1] = new Contacto("Luis", "988333444");
        contactos[2] = new Contacto("Sofia", "977555666");
        // contactos[3] = new Contacto("...", "...");
        // contactos[4] = new Contacto("...", "...");

        // Recorremos el array con for, como en la leccion 4
        System.out.println("=== Mis contactos ===");
        for (int i = 0; i < contactos.length; i++) {
            System.out.println(contactos[i].getNombre() + " - " + contactos[i].getTelefono());
        }

        // 2. Busca a uno de tus contactos. Los textos se comparan con equals, no con ==
        // String buscado = "Luis";
        // boolean encontrado = false;
        // for (int i = 0; i < contactos.length; i++) {
        //     if (contactos[i].getNombre().equals(buscado)) {
        //         System.out.println("Encontrado: " + contactos[i].getNombre().toUpperCase());
        //         System.out.println("Telefono: " + contactos[i].getTelefono());
        //         encontrado = true;
        //     }
        // }
        // if (!encontrado) {
        //     System.out.println("No se encontro a " + buscado);
        // }

        // Reto extra: cambia equals por equalsIgnoreCase y busca "luis" con minuscula.
        // ¿Ahora si lo encuentra?

    }
}