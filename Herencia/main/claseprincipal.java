package main;
import operaciones.*;

public class claseprincipal {
    public static void main (String args[]){
        hijasuma mensajeroS = new hijasuma();
        mensajeroS.datos();
        mensajeroS.sumar();
        System.out.print("El resultado de la suma es: ");
        mensajeroS.Mresultado();

        hijaresta mensajeror = new hijaresta();
        mensajeror.datos();
        mensajeror.restar();
        System.out.print("El resultado de la resta es: ");
        mensajeror.Mresultado();
    }
}
