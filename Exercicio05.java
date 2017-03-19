
package trabalho.pkg1.bim;

import java.util.Scanner;

public class Exercicio05 {
    


    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        double media;
        
        
      
         
            System.out.println("Digite sua nota");
            media = entrada.nextInt();
        
          if (media >= 70 ){
              System.out.println("Aprovado");
              }
          if(media < 40){
              System.out.println("Reprovado");
          }
          if (media >= 40 && media <70){
              System.out.println("Exame");
          }
          
    }
    
    
}
