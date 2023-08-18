/*
 * clase para las funciones logicas de una lavadora
 */
package llfunciones;

/**
 * 
 * @author Edward (Kirin Horny)
 */
public class LLFunciones {

    // variables
    private int kilos = 0, llenado_completo = 0, tipo_de_ropa = 0, lavado_completo = 0, secado_completo = 0;

    public LLFunciones(int kilos, int tipo_de_ropa) {
        this.kilos = kilos;
        this.tipo_de_ropa = tipo_de_ropa;
    }

    private void Llenado(){
        if(kilos <= 12){
            llenado_completo = 1;
            System.out.println("Llenando");
            System.out.println("Llenado completo");
        } else{
            System.out.println("la carga de ropa es muy pesada, reduce la carga");
        }
    }

    private void Lavado() {
        Llenado();
        if (llenado_completo == 1) {
            if (tipo_de_ropa == 1) {
                System.out.println("ropa blanca / lavado suave");
                System.out.println("Lavando....");
                lavado_completo = 1;
            } else if (tipo_de_ropa == 2) {
                System.out.println("Ropa de color / lavado intenso");
                System.out.println("lavando.....");
                lavado_completo = 1;
            } else {
                System.out.println("el tipo de ropa no esta disponible");
                System.out.println(" se lavara como ropa de color / lavado intenso");
                lavado_completo = 1;
            }
        } else {
            System.out.println("");
        }
    }

    private void Secado() {
        Lavado();
        if (lavado_completo == 1) {
            System.out.println("Secando.....");
            secado_completo = 1;
        }
    }
    public void CicloFinalizado(){
        Secado();
        if(secado_completo==1){
            System.out.println("tu ropa ya esta lista");
        }
    }
}