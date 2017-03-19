package trabalho.pkg1.bim;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nom;
        String nome[] = new String[10];
        String login;
        double tel;

        int opcao;
        System.out.println("Digite " + 1 + " para Novo Cadastro ou " + 0 + " para sair: ");
        opcao = leitor.nextInt();

        System.out.println("Cadastro de Clientes");

        System.out.println("\nDigite o nome do cliente: ");
        nom = leitor.nextLine();

        System.out.println("\nDigite o email: ");
        login = leitor.nextLine();

        System.out.println("\nDigite o telefone");
        tel = leitor.nextDouble();
        System.out.println("Cadastro efetuado com sucesso!");

        System.out.println("Digite " + 1 + " para Novo Cadastro ou " + 0 + " para sair: ");
        opcao = leitor.nextInt();
    }

    
                      
           }

       
        
        
     
     
    
    

