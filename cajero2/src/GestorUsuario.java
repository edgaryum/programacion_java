import java.util.Scanner;

public class GestorUsuario {
    public void crearNuevoUsuario() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre de usuario: ");
        String nombre = teclado.nextLine();
        System.out.print("ingrese la contaseña");
        String c1 = teclado.nextLine();
        System.out.print("escriba nuevamente la contraseña");
        String c2 = teclado.nextLine();
        String c3 = "a";
        while (c3.equals("a")) {
            if (c1 != c2) {
                System.out.println("las contraseñas no coinciden, prueba de nuevo");
            } else if (c1.equals(c2)) {
                System.out.println("usuario y contraseña almacenados");
                c3 = "b";
            }
        }
        System.out.print("ingese saldo inicial: ");
        double saldo = teclado.nextDouble();
        Usuario nuevoUsuario = new Usuario(nombre, c1, saldo);
        GETU(nuevoUsuario);
        GETNS(nuevoUsuario);
        System.out.println("Nuevo Usuario creado exitosamente");
        teclado.close();
    }
    private void GETU(Usuario usuario){}
}
