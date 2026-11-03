class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

public class Main {
    public static void main(String[] args) {
        Contacto[] contactos = new Contacto[3];
        contactos[0] = new Contacto("Ana", "999111222");
        contactos[1] = new Contacto("Luis", "988333444");
        contactos[2] = new Contacto("Sofia", "977555666");

        System.out.println("=== Mis contactos ===");
        for (int i = 0; i < contactos.length; i++) {
            System.out.println(contactos[i].getNombre() + " - " + contactos[i].getTelefono());
        }

        String buscado = "Luis";
        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].getNombre().equals(buscado)) {
                System.out.println("Encontrado: " + contactos[i].getNombre().toUpperCase());
                System.out.println("Telefono: " + contactos[i].getTelefono());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro a " + buscado);
        }
    }
}