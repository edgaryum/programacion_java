package area;
import java.util.*;
public class RectanguloMain{
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("dame el Valor base: ");
        int base = entrada.nextInt();
        System.out.println("dame el valor de la altura: ");
        int altura = entrada.nextInt();

        Rectangulo mensajero = new Rectangulo(base, altura);
        mensajero.imprimir();
    }
}