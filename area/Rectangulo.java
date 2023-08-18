package area;

public class Rectangulo{
    private int base, altura, area;
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public void calculoarea(){
        area = base*altura;
    }
    public void imprimir(){
        calculoarea();
        System.out.println("el area del rectangulo es: "+ area);
    }
}