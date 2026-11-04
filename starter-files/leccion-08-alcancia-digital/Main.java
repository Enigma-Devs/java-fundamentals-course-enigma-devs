// Leccion 8: Alcancia digital
// Presiona Run para ver la alcancia de la leccion.
// Luego, ¡tu turno!: crea tu propia alcancia y completa los pasos.
// Para usar una linea que empieza con //, borra las // del inicio.

class Alcancia {
    // private: el saldo solo se puede usar dentro de esta clase
    private double saldo;

    public Alcancia(double saldoInicial) {
        saldo = saldoInicial;
    }

    // Getter: permite mirar el saldo sin tocarlo
    public double getSaldo() {
        return saldo;
    }

    // Solo acepta depositos que tengan sentido (mayores que 0)
    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("Depositaste S/ " + monto);
        } else {
            System.out.println("Monto no valido: " + monto);
        }
    }

    // Reto extra: crea aqui un metodo retirar(double monto)
    // que solo deje sacar dinero si hay suficiente saldo
}

public class Main {
    public static void main(String[] args) {
        // Ejemplo de la leccion
        Alcancia mia = new Alcancia(20);
        System.out.println("Saldo: S/ " + mia.getSaldo());
        mia.depositar(15);
        mia.depositar(-50);
        System.out.println("Saldo: S/ " + mia.getSaldo());

        // 1. Crea tu propia alcancia con un saldo inicial
        // Alcancia miAlcancia = new Alcancia(...);

        // 2. Haz varios depositos, incluido uno negativo, y muestra el saldo
        // miAlcancia.depositar(...);
        // System.out.println("Mi saldo: S/ " + miAlcancia.getSaldo());

        // 3. Intenta cambiar el saldo directamente y mira el error que da Java:
        // mia.saldo = 1000;

    }
}