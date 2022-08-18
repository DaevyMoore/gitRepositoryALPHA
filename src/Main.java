public class Main {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta("123789", "credito", 150000);
        System.out.println("saldo minimo :"+ miCuenta.getSaldoMinimo());
        miCuenta.consignar(80000);
        System.out.println("saldo actual: "+ miCuenta.getSaldoActual());
        miCuenta.retirar(250000);
        System.out.println(miCuenta.toString());
        System.out.println("**************************************");

        Cuenta otraCuenta = new Cuenta("962614", "prestamo", 6000);
        System.out.println(otraCuenta.toString());
    }
}
