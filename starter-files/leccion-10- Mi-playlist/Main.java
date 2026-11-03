// Leccion 10: Mi playlist
// import java.util.Scanner;

// ¡Tu turno! Crea la clase Cancion con atributos privados, un constructor y getters.
class Cancion {
    // 1. Declara los atributos titulo, artista y duracion como private.
    private String titulo;
    private String artista;
    private int duracion; // en segundos
    // 2. Crea el constructor que reciba titulo, artista y duracion y los asigne a los atributos.
    public Cancion(String titulo, String artista, int duracion) {

    }
    // 3. Crea los getters para cada atributo.
    public String getTitulo() {
        return titulo;
    }
    // 4. Crea los getters para cada atributo.
    public String getArtista() {
        return artista;
    }
    // 4. Crea los getters para cada atributo.
    public int getDuracion() {
        return duracion;
    }
}

// ¡Tu turno! Crea la clase Playlist con un arreglo de Cancion, un contador y métodos para agregar, listar y mostrar la duración total.
class Playlist {
    // 1. Declara un arreglo de Cancion de tamaño 10 y un contador cantidad como private.
    private Cancion[] canciones = new Cancion[10];
    private int cantidad = 0;
    // 2. Crea el método agregar que reciba una Cancion y la agregue al arreglo si hay espacio, incrementando cantidad.
    public void agregar(Cancion c) {

    }
    // 3. Crea el método listar que recorra el arreglo y muestre el título, artista y duración de cada canción.
    //    Si la playlist está vacía, muestra un mensaje indicando que no hay canciones.
    public void listar() {

    }
    // 4. Crea el método mostrarDuracionTotal que recorra el arreglo y sume la duración de todas las canciones, mostrando el resultado en minutos y segundos.
    public void mostrarDuracionTotal() {

    }
}

// ¡Tu turno! Crea la clase Main con un menú para interactuar con la playlist.
public class Main {
    // 5. Crea un objeto Scanner para leer la entrada del usuario y un objeto Playlist.
    // 6. Crea un bucle while que muestre un menú con opciones para agregar canción, listar canciones, ver duración total y salir.
    // 7. Según la opción elegida, llama al método correspondiente de la playlist. Si la opción es inválida, muestra un mensaje indicando que no es válida.
    // 8. El bucle debe continuar hasta que el usuario elija salir (opción 4).
    // 9. Al salir, muestra un mensaje de despedida.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int opcion = 0;
    // 6. Crea un bucle while que muestre un menú con opciones para agregar canción, listar canciones, ver duración total y salir.
        while (opcion != 4) {

        }
    }
}