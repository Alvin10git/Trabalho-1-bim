
package trabalho.pkg1.bim;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio24 {

   
    public static void main(String[] args) {
       Scanner leitor = new Scanner (System.in);
       int x = 6;
       int vetor [] = new int [x];
       int y;
       vetor[0] = 1;
       vetor[1] = 3;
       vetor[2] = 1;
       vetor[3] = 3;
       vetor[4] = 5;
       vetor[5] = 10;
       int troca;
       
       System.out.println("Digite a posição que deseja alterar: ");
       x = leitor.nextInt();
        if(x != vetor.length){
           System.out.println("Posição inválida!");
       }else{
       
       System.out.println("Para qual posição deseja alterar: ");
       y = leitor.nextInt();
       troca = vetor[y];
       vetor[y] = vetor[x];
       vetor[x] = troca;
       
      
       
       System.out.println(Arrays.toString(vetor));
        }   
    }
    
}
