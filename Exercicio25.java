package trabalho.pkg1.bim;


import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        
        int c = 0;
     
     
     int x;
    

        for (int i = 0; i < 100; i++) {
            Scanner leitor = new Scanner(System.in);
            

            System.out.println("Digite a opção que deseja:");
            System.out.println("1- nova pagina\n2- atualizar pagina\n3- sair");
            x = leitor.nextInt();

            
            switch (x) {
                case 1:
                    
                    c ++;
                    
                    System.out.println("Acessos = " + c);
                    break;
                case 2:
                    c++;
                    System.out.println("Acessos = " + c);
                    break;
                case 3:
                    System.out.println("você saiu da pagina.");
                    System.out.println("Acessos = " + c);
                    break;

            }
        }
    }

}
