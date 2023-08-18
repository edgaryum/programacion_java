import java.util.Random;
import java.util.Scanner;

public class App {

    // variables
    int banco = 1000000;
    static int Njug = 0;
    static int dado1, dado2, dados;
    static int jpos1 = 1, jpos2 = 1;
    static int jsaldo1 = 1500, jsaldo2 = 1500;
    static int prop1d =0; 

    // static boolean jug1 = true, jug2 = true, jug3 = false, jug4 = false, jug5 =
    // false, jug6 = false, jug7 = false, jug8 = false;
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al monopoly de edward 1.0 desarrollado en una sol clase java");
        // System.out.println("empecemos seleccionando el numero de jugadores entre 2 y
        // 8");
        Njug = 2; // teclado.nextInt();
        /*
         * participacion de jugadores para la 2.0
         * if (Njug == 8){
         * jug1 = true; jug2 = true; jug3 = true; jug4 = true; jug5 = true; jug6 = true;
         * jug7 = true; jug8 = true;
         * }else if (Njug == 7){
         * jug1 = true; jug2 = true; jug3 = true; jug4 = true; jug5 = true; jug6 = true;
         * jug7 = true;
         * }else if (Njug == 6){
         * jug1 = true; jug2 = true; jug3 = true; jug4 = true; jug5 = true; jug6 = true;
         * }else if (Njug == 5){
         * jug1 = true; jug2 = true; jug3 = true; jug4 = true; jug5 = true;
         * }else if (Njug == 4){
         * jug1 = true; jug2 = true; jug3 = true; jug4 = true;
         * }else if (Njug == 3){
         * jug1 = true; jug2 = true; jug3 = true;
         * }else if (Njug == 2){
         * jug1 = true; jug2 = true;
         * }else{
         * System.out.println("ingrese un valor adecuado");
         * }
         */
        while (Njug != 1) {
            // inicio
            
            rondaj1();
            if(jpos1 == 1){
                //propiedad 1
                //dueño propiedad
                if (prop1d == 0){
                    System.out.println("Desea comprar la propiedad 1 S / 2 N");
                    int opcion = teclado.nextInt();
                    if (opcion == 1){
                        prop1d = 1;
                    }else if (opcion == 2){
                        System.out.println("Gracias, siga adelante");
                    }
                }else if(prop1d == 2){
                    System.out.println("se deben pagar 300");
                    jsaldo1 =- 300; 
                }
            }
            rondaj2();
            if(jpos2 == 1){
                //propiedad 1
                //dueño propiedad
                if (prop1d == 0){
                    System.out.println("Desea comprar la propiedad S / N");
                    int opcion = teclado.nextInt();
                    if (opcion == 1){
                        prop1d = 2;
                    }else if(opcion == 2){
                        System.out.println("Gracias, siga adelante");
                    }
                }else if(prop1d == 1){
                    System.out.println("se deben pagar 300");
                    jsaldo2 =- 300; 
                }
            }
            System.out.println("fin ronda");
            
            // final
            if (jsaldo1 <= 0) {
                System.out.println("Fin del juego, el ganador es el jugador 2");
                Njug = Njug - 1;
            } else if (jsaldo2 <= 0) {
                System.out.println("Fin del juego, el ganador es el jugador 1");
                Njug = Njug - 1;
            }
        }

        teclado.close();
    }

    // lanzamiento de dados
    public static void lDados() {
        Random Dice = new Random();
        dado1 = Dice.nextInt(5) + 1;
        dado2 = Dice.nextInt(5) + 1;
        dados = dado1 + dado2;
        return;
    }

    public static void rondaj1() {
        lDados();
        for (int i = dados; i >= 1; i--) {
            jpos1 = jpos1 + 1;
            if (jpos1 == 40) {
                jpos1 = 0;
                jsaldo1 = jsaldo1 - 200;
            }
        }
        System.out.println("dado1: " + dado1 + " dado2: " + dado2);
        System.out.println("jugador 1 casilla: " + jpos1);

        System.out.println(jsaldo1);
    }

    public static void rondaj2() {
        lDados();
        for (int i = dados; i >= 1; i--) {
            jpos2 = jpos2 + 1;
            if (jpos2 == 40) {
                jpos2 = 0;
                jsaldo2 = jsaldo2 - 200;
            }
        }
        System.out.println("dado1: " + dado1 + " dado2: " + dado2);
        System.out.println("jugador 2 casilla: " + jpos2);

        System.out.println(jsaldo2);
    }

    /*
     * //jugador 1
     * public static void Juga1(){
     * if (jug1 = true){
     * jpos1 = 1;
     * jsaldo1 = 1500;
     * }
     * return;
     * }
     * 
     * //jugador2
     * public static void Juga2(){
     * if (jug2 = true){
     * jpos2 = 1;
     * jsaldo2 = 1500;
     * }
     * return;
     * }
     */
}
