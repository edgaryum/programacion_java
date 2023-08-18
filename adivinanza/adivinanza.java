import java.util.*;

public class adivinanza {
    public static void main(String args[]){
        //variables
        Scanner nuser = new Scanner(System.in);
        Random nocul = new Random();
        int NumAle = nocul.nextInt(100)+1;
        int numero = 0, contar = 0;
        //inicio
        System.out.println("*******************************");
        System.out.println("*  adivina el numero oculto   *");
        System.out.println("*******************************");
        System.out.println("");
        while (numero != NumAle){
            System.out.println("ingrese un numero");
            numero = nuser.nextInt();
            if(numero < NumAle){
                System.out.println("el numero ingresado es menor, intente nuevamente");
                contar++;
            }
            if(numero > NumAle){
                System.out.println("el numero ingresado es mayor, intente nuevamente");
                contar++;
            }            
        }
        System.out.println("Felicidades, el numero correcto es: " + NumAle);
        System.out.println("numero de intentos: " + contar);
    }
}