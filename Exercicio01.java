
package trabalho.pkg1.bim;
 
import java.util.Scanner;

public class Exercicio01 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1;
        double num2;
        double soma;
             
        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextInt();
        
        soma = num1 + num2;
        
        System.out.println("A soma é: " + soma);
        
               
        
    }
    
}
