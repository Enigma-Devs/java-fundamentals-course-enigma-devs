import java.util.Scanner;

class Cancion {
    private String titulo;
    private String artista;
    private int duracion; // en segundos

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }
}

class Playlist {
    private Cancion[] canciones = new Cancion[10];
    private int cantidad = 0;

    public void agregar(Cancion c) {
        if (cantidad < canciones.length) {
            canciones[cantidad] = c;
            cantidad++;
            System.out.println("Cancion agregada.");
        } else {
            System.out.println("La playlist esta llena.");
        }
    }

    public void listar() {
        if (cantidad == 0) {
            System.out.println("La playlist esta vacia.");
        }
        for (int i = 0; i < cantidad; i++) {
            Cancion c = canciones[i];
            System.out.println((i + 1) + ". " + c.getTitulo() + " - " + c.getArtista()
                    + " (" + c.getDuracion() / 60 + " min " + c.getDuracion() % 60 + " s)");
        }
    }

    public void mostrarDuracionTotal() {
        int total = 0;
        for (int i = 0; i < cantidad; i++) {
            total = total + canciones[i].getDuracion();
        }
        System.out.println("Duracion total: " + total / 60 + " min " + total % 60 + " s");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n=== Mi playlist ===");
            System.out.println("1. Agregar cancion");
            System.out.println("2. Listar canciones");
            System.out.println("3. Ver duracion total");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Titulo: ");
                String titulo = sc.nextLine();
                System.out.print("Artista: ");
                String artista = sc.nextLine();
                System.out.print("Duracion en segundos: ");
                int duracion = sc.nextInt();
                sc.nextLine();
                playlist.agregar(new Cancion(titulo, artista, duracion));
            } else if (opcion == 2) {
                playlist.listar();
            } else if (opcion == 3) {
                playlist.mostrarDuracionTotal();
            } else if (opcion == 4) {
                System.out.println("Hasta luego!");
            } else {
                System.out.println("Opcion no valida.");
            }
        }
    }
}