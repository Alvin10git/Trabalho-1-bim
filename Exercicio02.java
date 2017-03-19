
package trabalho.pkg1.bim;

import java.util.Scanner;


public class Exercicio02 {

    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        double num1;
        double num2;
        double mult;
             
        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextInt();
        
        mult = num1 * num2;
        
        System.out.println("O resultado da multiplicação é: " + mult);
    }
    
}
