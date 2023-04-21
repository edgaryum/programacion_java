package operaciones;
import java.util.Scanner;

public class padre{
    protected int valor1, valor2, res;
    Scanner entrada = new Scanner(System.in);

    //este metodo pide los valores    
    public void datos(){
        System.out.print("dame el primer valor: ");
        valor1 = entrada.nextInt();
        System.out.print("dame el segundo valor: ");
        valor2 = entrada.nextInt();
    }

    //este metodo muestra el resultado
    public void Mresultado(){
        System.out.println(res);
    }

}