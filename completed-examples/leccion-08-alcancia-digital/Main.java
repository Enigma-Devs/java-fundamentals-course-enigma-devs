class Alcancia {
    private double saldo;

    public Alcancia(double saldoInicial) {
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("Depositaste S/ " + monto);
        } else {
            System.out.println("Monto no valido: " + monto);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Alcancia mia = new Alcancia(20);
        System.out.println("Saldo: S/ " + mia.getSaldo());

        mia.depositar(15);
        mia.depositar(-50);
        System.out.println("Saldo: S/ " + mia.getSaldo());
    }
}
