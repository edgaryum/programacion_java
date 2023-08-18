package operaciones;

import java.util.Scanner;

//clase padre
public abstract class operacionp {
    // variables:
    protected int n1, n2, res, op;
    Scanner dato = new Scanner(System.in);

    public void pedirdatos() {
        System.out.println("dame el primer dato");
        n1 = dato.nextInt();
        System.out.println("dame el segundo dato");
        n2 = dato.nextInt();
    }

    public abstract void opera();

    public void mostrarresultado() {
        System.out.println("El resultado es: " + res);
    }
}
