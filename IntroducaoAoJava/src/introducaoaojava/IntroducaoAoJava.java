package introducaoaojava;

import java.util.Scanner;

public class IntroducaoAoJava {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos somar dois números.");
        System.out.println("Informe um valor para o número 1:");
        int numero1 = entrada.nextInt();
        System.out.println("Informe um valor para o número 2:");
        int numero2 = entrada.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("A soma deu "+resultado);
    }
}