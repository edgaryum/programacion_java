package clases;

//clase padre
import java.util.Scanner;

public abstract class funciones {
    // variables
    Scanner entrada = new Scanner(System.in);
    protected int transacciones, ingreso, retiro;
    private static int saldo;

    public void operaciones() {
        int seleccion = 0;
        while (seleccion != 4) {
            System.out.println("************************");
            System.out.println("*Selecciones una opcion*");
            System.out.println("************************");
            System.out.println("1=> consultar saldo");
            System.out.println("2=> ingresar dinero");
            System.out.println("3=> retirar dinero");
            System.out.println("4=> salir");
            seleccion = entrada.nextInt();
            switch (seleccion) {
                case 1:
                    funciones mensajero = new Consulta();
                    mensajero.transacciones();
                    break;
                case 2:
                    funciones mensajer = new retiro();
                    mensajer.transacciones();
                    break;
                case 3:
                    funciones mensaje = new ingresar();
                    mensaje.transacciones();
                    break;
                case 4:
                    System.out.println("Gracias, Vuelva pronto");
                    break;
                default:
                    System.out.println("Error, la opcion no existe");
            }
        }

    }

    // metodo retirar dinero
    public void retiro() {
        retiro = entrada.nextInt();
    }

    // metodo ingresar dinero
    public void deposito() {
        ingreso = entrada.nextInt();
    }

    // metodo abstracto
    public abstract void transacciones();

    // metodo setter y getter
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}