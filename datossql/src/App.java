import java.awt.Cursor;
import java.util.Scanner;

public class App {
    public static void main(String Args[]) {
        // permitir ingresar datos
        Scanner teclado = new Scanner(System.in);
        // variables
        int op = 0, id = 0;

        while (op != 5) {
            // tomar valores
            System.out.println("seleccione su accion");
            System.out.println("1 insertar dato");
            System.out.println("2 leer datos");
            System.out.println("3 actualizar datos");
            System.out.println("4 Eliminar datos2");
            System.out.println("5 salir");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    // insertar un nuevo registro
                    System.out.println("inserte nombre: ");
                    teclado.nextLine();
                    //evitar salto de linea
                    String nombre = teclado.nextLine();
                    System.out.println("inserte curso: ");
                    String curso = teclado.nextLine();
                    Insertar.insertar(nombre, curso);
                    break;
                case 2:
                    // leer todos los registros
                    Leer.leer();
                    break;
                case 3:
                    // actualizar registros existente
                    System.out.println("inserte numero id a modificar");
                    id = teclado.nextInt();
                    System.out.println("inserte nombre");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    System.out.println("inserte Curso");
                    curso = teclado.nextLine();
                    Actualizar.actualizar(id, nombre, curso);
                    Leer.leer();
                    break;
                    case 4:
            // eliminar registros
            System.out.println("Ingrese el id a eliminar");
            id=teclado.nextInt();
            Borrar.eliminar(id);
            Leer.leer();
            break;
            case 5:
                    System.out.println("gracias por participar");
                    break;
                    default:
                    System.out.println("Selecciones una opcion correcta");
                    break;
            }
            

            /*// leer todos los registros
            Leer.leer();



            // leer registros*/
        }
        teclado.close();
        
    }
}