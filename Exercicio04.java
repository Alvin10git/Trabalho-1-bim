
package trabalho.pkg1.bim;

import java.util.Scanner;


public class Exercicio04 {

    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
       double valor ;
       double y;
       double exp;
         
       System.out.println("Digite um valor");
       valor = entrada.nextInt();
       y = valor;
       exp = Math.pow(valor, y);
       
       System.out.println("O resultado é: " + exp);
    }
}
     
      
   



       
   