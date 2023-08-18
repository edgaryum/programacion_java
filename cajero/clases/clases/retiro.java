package clases;

public class retiro extends funciones {
    @Override
    public void transacciones() {
        System.out.print("cuanto deseas retirar??: ");
        retiro();
        if (retiro < getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("retiraste: " + retiro);
            System.out.println("tu saldo actual es: " + getSaldo());
        } else {
            System.out.println("Monto Insuficiente");
        }
    }
}
