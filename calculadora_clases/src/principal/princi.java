package principal;

import java.util.Scanner;
import operaciones.*;

public class princi {
    static int op;
    static Scanner dato = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("selecciones su operacion:");
        System.out.println("1 suma");
        System.out.println("2 resta");
        System.out.println("3 multiplicacion");
        System.out.println("4 division");
        op = dato.nextInt();
        switch (op) {
            case 1:
                operacionp mensajero = new suma();
                mensajero.pedirdatos();
                mensajero.opera();
                mensajero.mostrarresultado();
                break;
            case 2:
                operacionp mensajer = new resta();
                mensajer.pedirdatos();
                mensajer.opera();
                mensajer.mostrarresultado();
                break;
            case 3:
                operacionp mensaje = new multiplicacion();
                mensaje.pedirdatos();
                mensaje.opera();
                mensaje.mostrarresultado();
                break;
            case 4:
                operacionp mensaj = new division();
                mensaj.pedirdatos();
                mensaj.opera();
                mensaj.mostrarresultado();
                break;
        }

    }
}