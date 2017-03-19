
package trabalho.pkg1.bim;

import java.util.Scanner;

public class Exercicio06 {

  
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        String str1 = "admin";
        String str2;

        System.out.println("Digite o login de acesso");
        str2 = entrada.next();
                
        if(str1.equals(str2)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }
}      
       
     
    
