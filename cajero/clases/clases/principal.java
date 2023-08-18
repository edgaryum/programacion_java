package clases;

public class principal {

    public static void main(String args[]) {
        System.out.println("Bienvenido al cajero");
        System.out.println("");
        funciones mensajero = new Consulta();
        mensajero.setSaldo(500);
        mensajero.operaciones();
    }
}
