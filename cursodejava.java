//realizar las siguientes series numericas usando las estructuras repetitivas
//for, while y do-while
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
//1, 99, 2, 98, 3, 97, 4, 96, 5, 95,
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
public class cursodejava {
    public static void main (String args[]){
        //for
        for(int a = 1;a<=10;a++){
            System.out.print(a+", ");
        }
        //while
        System.out.println("");
        int b = 1, c = 99;
        while(b<=5 && c>=95){
            System.out.print(b+", "+c+", ");
            b++;
            c--;
        }
        //do while
        System.out.println("");
        int d = 0, e=1, f=0;
        do{
            System.out.print(d+", ");
            f=d+e;
            d=e;
            e=f;
        }while(d<=35);
    }
}



//ejercicio numero random
/*crear un algorito en bucle que genere un nuemro random con la linea:
int numero = (int)(Math.random()*100+1);
luego permita al usuario ingresar un numero, lo compare con el numero random
y si acierta felicitar y terminar el proceso, de no ser asi, decir si el
numero random es mayor o menor al numero ingresado.*/
/*import java.util.*;
public class cursodejava {
    public static void main (String args[]){
        Scanner t = new Scanner(System.in);
        System.out.println("Bienvenido al juego de azar");
        System.out.println("intente adivinar el numero oculto");
        int nr = (int)(Math.random()*100+1);
        int nu = 101, nc = 0;
        while(nu!=nr){
            System.out.println("porfavor, ingrese un numero");
            nu = t.nextInt();
            if(nu<nr){
                System.out.println("El numero ingresado es menor");
                nc++;
                System.out.println("intente nuevamente");
            }else if(nu>nr){
                System.out.println("El numero ingresado es mayor");
                nc++;
                System.out.println("intente nuevamente");
            }else{
                System.out.println("felicidades, el numero correcto es: "+nr);
                System.out.println("han sido un total de: "+nc+" intentos");
                System.out.println("gracias por participar");
            }
        }

    }
}*/


/*
//bucle do while
public class cursodejava {
    public static void main (String args[]){
        //realizar un programa que imprima la siguiente serie numerica:
        //1000, 800, 600, 400, 200, 0,
        int n = 1000;
        do{
            System.out.print(n+", ");
            n-=200;
        }while(n>=0);

    }
}*/
/*
//bucle while
public class cursodejava {
    public static void main (String args[]){
        //realizar un programa que imprima la siguiente serie numerica:
        //1, 3, 5, 7, 9,
        int n = 1;
        while (n<=10){
            System.out.print(n+", ");
            n+=2;
        }

    }
}*/

//bucle for
/*public class cursodejava {
    public static void main (String args[]){
        // for(inicio, condicion, incremento){}
        for(int i = 1; i <= 5; i++){
            System.out.print(i + ", ");
        }
    }
}*/

//calculadora Switch Case
/*public class cursodejava {
    public static void main (String args[]){
        int num1 = 5, num2 =3, numr =0, param=5;
        switch(param){
            case 1: numr = num1 + num2;
            System.out.println(numr);
            break;
            case 2:numr = num1 - num2;
            System.out.println(numr);
            break;
            case 3:numr = num1 * num2;
            System.out.println(numr);
            break;
            case 4:numr = num1 / num2;
            System.out.println(numr);
            break;
            default: System.out.println("La opcion no existe");
            break;
        }
    }
}*/



//condicionales y(&&) and or(||)
/*pregunta:
 * la empresa cocacola solicita un sistema que determina 
 * los dias de vacaciones a los que tiene derecho un trabajador,
 * tomando en cuenta las siguentes caracteristicas:
 * A) existen 3 departamentos dentro de la empresa con sus respectivas clases
 *      1) departamento de atencion al cliente (clave 1)
 *      2) departamento de logistica (clave 2)
 *      3) Gerencia (clave 3)
 * B) los trabajadores con clave 1
 *      1) con 1 año de servicio, reciben 6 dias de vacaciones
 *      2) con 2 a 6 años, reciven 14 dias de vacaciones
 *      3) a partir de 7 años, reciben 20 dias
 * C) los trabajadores con clave 2
 *      1) con un año de servicio, reciben 7 dias de vacaciones
 *      2) con 2 a 6 años, reciven 15 dias de vacaciones
 *      3) a partir de 7 años, reciben 22 dias
 * D) los trabajadores con clave 3
 *      1) con un año de servicio, reciben 10 dias de vacaciones
 *      2) con 2 a 6 años, reciven 20 dias de vacaciones
 *      3) a partir de 7 años, reciben 30 dias
 * Nota: el sistema debe solicitar el "nombre", "clave del departamento",
 * "antiguedad", posteriormente imprimira el nombre del empleado y sus dias }
 * de vacaciones
 * 
*/
/*import java.util.Scanner;

public class cursodejava {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        String nombre;
        int antiguedad = 0, clave = 0;
        System.out.println("Bienvenido al sistema vacacional de Cocacola Company");
        System.out.println("Ingrese el nombre del empleado");
        nombre = in.nextLine();
        System.out.println("Ingrese la clave del departamento");
        System.out.println("Atencion al cliente(1) logistica(2) Gerencia(3)");
        clave = in.nextInt();
        System.out.println("Ingrese la cantida de años trabajados(numero)");
        antiguedad = in.nextInt();
        if (clave == 1 && antiguedad == 1){
            System.out.println("el Empleado " + nombre + " tiene derecho a 6 dias de vacaciones");
        }else if (clave == 1 && antiguedad >= 2){
            System.out.println("el Empleado " + nombre + " tiene derecho a 14 dias de vacaciones");
        }else if (clave == 1 && antiguedad >= 7){
            System.out.println("el Empleado " + nombre + " tiene derecho a 20 dias de vacaciones");
        }else if (clave == 1 && antiguedad == 0){
            System.out.println("el Empleado " + nombre + " no tiene derecho a dias de vacaciones");
        }else if (clave == 2 && antiguedad == 1){
            System.out.println("el Empleado " + nombre + " tiene derecho a 7 dias de vacaciones");
        }else if (clave == 2 && antiguedad >= 2){
            System.out.println("el Empleado " + nombre + " tiene derecho a 15 dias de vacaciones");
        }else if (clave == 2 && antiguedad >= 7){
            System.out.println("el Empleado " + nombre + " tiene derecho a 22 dias de vacaciones");
        }else if (clave == 2 && antiguedad == 0){
            System.out.println("el Empleado " + nombre + " no tiene derecho a dias de vacaciones");
        }else if (clave == 3 && antiguedad == 1){
            System.out.println("el Empleado " + nombre + " tiene derecho a 10 dias de vacaciones");
        }else if (clave == 3 && antiguedad >= 2){
            System.out.println("el Empleado " + nombre + " tiene derecho a 20 dias de vacaciones");
        }else if (clave == 3 && antiguedad >= 7){
            System.out.println("el Empleado " + nombre + " tiene derecho a 30 dias de vacaciones");
        }else if (clave == 3 && antiguedad == 0){
            System.out.println("el Empleado " + nombre + " no tiene derecho a dias de vacaciones");
        }
    }
}*/


//calificaciones con Java y condicional
/*import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import javax.management.StringValueExp;

public class cursodejava {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primera nota");
        double num1 = teclado.nextDouble();
        System.out.println("Ingrese segunda nota");
        double num2 = teclado.nextDouble();
        System.out.println("Ingrese Ttercera nota");
        double num3 = teclado.nextDouble();
        System.out.println("Ingrese cuarta nota");
        double num4 = teclado.nextDouble();
        double numr = 0;

        numr = (num1 + num2 + num3 + num4) /4;
        System.out.println(numr);

        if(numr >= 3.5){
            System.out.println("aprobado");

        }else if (numr >= 3.0){
            System.out.println("raspado");
        }else if(numr <=2.0) {
            System.out.println("reprobado");
        }*/

        /* 
        parentesis ()
        exponencial ^
        multiplicacion *
        Division /
        suma +
        resta -
        
    }
}*/
