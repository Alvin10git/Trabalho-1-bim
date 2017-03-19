
package trabalho.pkg1.bim;

import java.util.Scanner;


public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double num1;
        double exp;
             
        System.out.println("Digite um valor: ");
        num1 = entrada.nextInt();
        
        exp = num1 * num1;
       
        
        System.out.println("O resultado da exponenciação é: " + exp);
    }
    
}
