import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import javax.management.StringValueExp;

public class cursodejava {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primera nota");
        double num1 = teclado.nextDouble();
        System.out.println("Ingrese segunda nota");
        double num2 = teclado.nextDouble();
        System.out.println("Ingrese Ttercera nota");
        double num3 = teclado.nextDouble();
        System.out.println("Ingrese cuarta nota");
        double num4 = teclado.nextDouble();
        double numr = 0;

        numr = (num1 + num2 + num3 + num4) /4;
        System.out.println(numr);

        if(numr >= 3.5){
            System.out.println("aprobado");

        }else if (numr >= 3.0){
            System.out.println("raspado");
        }else if(numr <=2.0) {
            System.out.println("reprobado");
        }

        /* 
        parentesis ()
        exponencial ^
        multiplicacion *
        Division /
        suma +
        resta -
        */
    }
}
