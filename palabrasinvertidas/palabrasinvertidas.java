import java.util.*;

import curso_java.Holamundo;

public class palabrasinvertidas {

    public static void main(String args[]){
        Holamundo salute = new Holamundo();
        salute.saludar(args);
        String palabra="", palabrainvertida="";
        int longitudpalanbra=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("escribe una palabra o frace: ");
        palabra = entrada.nextLine();
        longitudpalanbra = palabra.length();
        while (longitudpalanbra != 0){
            palabrainvertida += palabra.substring(longitudpalanbra -1, longitudpalanbra);
            longitudpalanbra--;
        }
        System.out.print("Palabra Invertida: " + palabrainvertida);
        System.out.println("");
        
    }
    
}