package lavadora_1;
import llfunciones.LLFunciones;
import java.util.Scanner;

public class Lavadora_1{
    public static void main (String args[]){
        Scanner entrada =new Scanner(System.in);
        System.out.println("la ropa es blanca o de color");
        System.out.println("Presione 1 - ropa blanca / 2 - ropa de color");
        int tipo_de_ropa = entrada.nextInt();

        System.out.println("cuantos quilos de ropa");
        int kilos = entrada.nextInt();

        LLFunciones mensajero = new LLFunciones(kilos, tipo_de_ropa);
        mensajero.CicloFinalizado();
    }
}