package suma;

public class suma{
    private int vuno, vdos, res;

    public suma(int valor1, int valor2){
        this.vuno = valor1;
        this.vdos = valor2;
    }
    public void operacion(){
        res = vuno + vdos;
    }
    public void imprimir(){
        operacion();
        System.out.println("el resultado de la suma es: " + res);
    }
}