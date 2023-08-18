import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("*-Cajero Marranito/lechona-*");
        System.out.println("****************************");
        System.out.println("");
        System.out.println("Tarea a realizar");
        System.out.println("a) crear nuevo usuario - b) ingresar");
        String opcion = teclado.nextLine();
        if (opcion.equals("a")){
//llamar a la clase crear usuario
        }else if(opcion.equals("b")){
            System.out.println("jodase aun no disponible");
        }else {
            System.out.println("enserio, 2 opciones, y tu pones eso??");
        }
        teclado.close();

        System.out.println("****************************");
        System.out.println("*-Cesion Cerrada, gracias-*");
        System.out.println("****************************");
    }

    public static void crearUsuario(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el Nuevo Usario: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String c1 = teclado.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldo = teclado.nextDouble();
        //conexion a la BD
        String url = "jdbc:mysql://localhost:3306/cajero2";
        String usuarioDB = "root";
        String CDB = "";

        try {
            con
        }
    }
}
