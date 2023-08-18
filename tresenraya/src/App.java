public class App {

    public static void main(String[] args) throws Exception {
        // escenario
        escenario();

    }

    public static void escenario() {
        int fil = 3, columnas = 3, contador = 1;
        String[][] mapa = new String[fil][columnas];
        mapa [0][0] = "1";
        mapa [0][1] = "2";
        mapa [1][0] = "3";
        mapa [1][1] = "4";
        mapa [0][2] = "5";
        mapa [2][0] = "6";
        mapa [2][2] = "7";
        mapa [1][2] = "8";
        mapa [2][1] = "9";
        System.out.print("["+ mapa[0][0]+"]");
        System.out.print("["+ mapa[0][1]+"]");
        System.out.println("["+ mapa[1][0]+"]");
        System.out.print("["+ mapa[1][1]+"]");
        System.out.print("["+ mapa[0][2]+"]");
        System.out.println("["+ mapa[2][0]+"]");
        System.out.print("["+ mapa[2][2]+"]");
        System.out.print("["+ mapa[1][2]+"]");
        System.out.println("["+ mapa[2][1]+"]");
        }

        public static void fichas(){
            
            String ficha1 = "O";
            String ficha2 = "X";
            String ficha3 = "O";
            String ficha4 = "X";
            String ficha5 = "O";
            String ficha6 = "X";

        }
    }

    