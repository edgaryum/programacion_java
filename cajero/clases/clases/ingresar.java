package clases;

public class ingresar extends funciones {
    @Override
    public void transacciones() {
        System.out.print("Monto a Ingresar: ");
        deposito();

        transacciones = getSaldo();
        setSaldo(transacciones + ingreso);
        System.out.println("depositaste: " + ingreso);
        System.out.println("Su saldo actual es: " + getSaldo());
    }
}
