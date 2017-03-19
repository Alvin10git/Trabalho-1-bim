
package trabalho.pkg1.bim;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio19 {
    
 
       static Scanner leitor = new Scanner (System.in);
        
       private static int[] funcao(int x){
            int [] vetor = new int [x];
        for(int i=0; i <vetor.length; i++){
            System.out.println("Digite um numero");
            vetor[i] = leitor.nextInt();
            
        } 
           return vetor;
       }
    
    public static void main(String[] args) {
        int x2, retorno;
        System.out.println("Digite um tamanho para o vetor");
        x2 = leitor.nextInt();
        funcao(x2);
        
        
       
    }
    
}
