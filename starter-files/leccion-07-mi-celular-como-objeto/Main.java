// Leccion 7: Mi celular como objeto
// Presiona Run para ver el celular de la leccion.
// Luego, ¡tu turno!: fabrica tus propios celulares y completa los pasos.
// Para usar una linea que empieza con //, borra las // del inicio.

// La clase es el molde: atributos (datos) y metodos (lo que sabe hacer)
class Celular {
    String marca;
    String modelo;
    int bateria;

    // Constructor: guarda en "este" celular (this) los datos que recibe
    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void mostrarInfo() {
        System.out.println(marca + " " + modelo + " - Bateria: " + bateria + "%");
    }

    public void usar(int minutos) {
        bateria = bateria - minutos;
        System.out.println("Usaste el " + modelo + " durante " + minutos + " minutos.");
        if (bateria < 20) {
            System.out.println("Bateria baja en el " + modelo + ": " + bateria + "%");
        }
    }

    // Reto extra: crea aqui un metodo cargar(int minutos) que sume a la bateria
}

public class Main {
    public static void main(String[] args) {
        // Ejemplo de la leccion: fabricamos un celular con new
        Celular c1 = new Celular("Astra", "X10", 80);
        c1.mostrarInfo();
        c1.usar(70);
        c1.mostrarInfo();

        // 1. Fabrica tu propio celular con tu marca, modelo y bateria
        // Celular miCelular = new Celular("...", "...", 100);

        // 2. Fabrica el celular de alguien de tu familia
        // Celular celularFamilia = new Celular(...);

        // 3. Usa cada celular distintos minutos y muestra su informacion.
        //    ¿Cual se queda sin bateria?
        // miCelular.usar(...);
        // miCelular.mostrarInfo();

    }
}