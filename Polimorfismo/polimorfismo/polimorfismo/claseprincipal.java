package polimorfismo;
import polimorfismo.operaciones_clasePadre;
import polimorfismo.resta_claseHija;
import polimorfismo.suma_clasehija;

public class claseprincipal {

    public static void main (String args[]){
        operaciones_clasePadre mensajero_suma = new suma_clasehija();
        mensajero_suma.pedirdatos();
        mensajero_suma.operaciones();
        mensajero_suma.mostrarresultado();

        operaciones_clasePadre mensajero_resta = new resta_claseHija();
        mensajero_resta.pedirdatos();
        mensajero_resta.operaciones();
        mensajero_resta.mostrarresultado();
    }
}
