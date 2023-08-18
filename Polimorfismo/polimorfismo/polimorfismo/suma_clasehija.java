package polimorfismo;

public class suma_clasehija extends operaciones_clasePadre {
    // sobre escribir un metodo
    @Override
    public void operaciones() {
        Res = v1 + v2;
    }
}