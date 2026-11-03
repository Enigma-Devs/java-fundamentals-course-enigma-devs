class Celular {
    String marca;
    String modelo;
    int bateria;

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
}

public class Main {
    public static void main(String[] args) {
        Celular c1 = new Celular("Astra", "X10", 80);
        Celular c2 = new Celular("Luna", "Pro 5", 90);
        c1.mostrarInfo();
        c2.mostrarInfo();

        c1.usar(70);
        c2.usar(30);
        c1.mostrarInfo();
        c2.mostrarInfo();
    }
}
