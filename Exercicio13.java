
package trabalho.pkg1.bim;

import java.util.Scanner;

public class Exercicio13 {

    
    public static void main(String[] args) {
     Scanner leitor = new Scanner (System.in);
     
     int opção;
     
     System.out.println("1.-Abrir\n2.-Novo projeto\n3.-Salvar\n4.-imprimir\n5.-sair");
            opção = leitor.nextInt();
            
     if (opção == 1) {
                System.out.println("Você Abriu um projeto");
        } 
                if (opção == 2) {
                    System.out.println("Você criou um novo projeto");
                }
                    if (opção == 3) {
                        System.out.println("Você salvou um projeto");
                        
                    }
                        if (opção == 4) {
                            System.out.println("Você imprimiu um projeto");
                          
                        }while(opção<5);
                            
    }
}