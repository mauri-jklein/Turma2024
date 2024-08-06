
package introducaoaojava;

import java.util.Scanner;


public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos calcular o peso ideal");
        System.out.println("Informe a sua altura:");
        double altura = entrada.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("O seu peso ideal é "+ pesoIdeal);
        
        
    }
}
