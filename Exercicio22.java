
package trabalho.pkg1.bim;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio22 {

    
    
    public static void main(String[] args) {
       Scanner leitor = new Scanner (System.in);
       double vetor [] = new double [10];
       double vetor2 [] = new double [10];
       double num;
       for (int i =0; i<10; i++){
           System.out.println("Digite um numero");
           num = leitor.nextDouble();
           vetor[i] = num;
           vetor2[i] = vetor[i];
       } 
       System.out.println(Arrays.toString(vetor));
       System.out.println(Arrays.toString(vetor2));
    }
    
}
 