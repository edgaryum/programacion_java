package clases;

public class principal {

    public static void main (String args[]){
        proceso hilo1 = new proceso();
        proceso hilo2 = new proceso();
        hilo1.start();
        hilo2.start();

        }
}
