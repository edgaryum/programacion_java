package clases;
// clase hija consulta

public class Consulta extends funciones {
    @Override
    public void transacciones() {
        System.out.println("su saldo actual es: " + getSaldo());
    }
}
