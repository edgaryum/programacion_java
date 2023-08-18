package polimorfismo;
import java.util.Scanner;

public abstract class operaciones_clasePadre{
protected int v1, v2,Res;
Scanner entrada = new Scanner(System.in);
    public void pedirdatos(){
        System.out.print("Dame el primer valor: ");
        v1 = entrada.nextInt();
        System.out.print("Dame el segundo valor: ");
        v2 = entrada.nextInt();

    }

    public abstract void operaciones();

    public void mostrarresultado(){
        System.out.println(Res);
    }
}