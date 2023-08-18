/*import java.text.ParseException;
import java.util.*;
import java.util.StringTokenizer;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero a multiplicar");
        String num3 = scanner.nextLine();
        System.out.println("tu numero es "+num3);
        StringTokenizer tokenizer = new StringTokenizer(num3);
        Stack<Double> stack = new Stack<Double>();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
            try{        
                double num = Double.parseDouble(token);
                stack.push(num);
            }catch (NumberFormatException e){
                // Si es un operador, saca los últimos dos números de la pila, aplica el operador y empuja el resultado de vuelta a la pila
                double num2 = stack.pop();
                double num1 = stack.pop();
                double result = 0;
                    switch(token){
                    case "*":
                        result = num1 * num2;
                    break;
                    case "/":
                        result = num1 / num2;
                    break;
                    case "+":
                        result = num1 + num2;
                    break;
                    case "-":
                        result = num1 - num2;
                    break;
                    }
                stack.push(result);
            }
        }
        scanner.close();
        double result = stack.pop();
        System.out.println(result);

    }
}*/