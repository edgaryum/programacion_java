package clases;

public class proceso extends Thread{
    int num_int;
    @Override
    public void run(){
        for(int i =0; i<=num_int; i++){
            System.out.println(i);
        }
        System.out.println("");
    }
}