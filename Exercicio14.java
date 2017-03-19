package trabalho.pkg1.bim;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opção;

        System.out.println("1.-Adição\n2.-Subtração\n3.-Multiplicação\n4.-divisão\n5.-fatoração\n6.-Potenciação");
        opção = leitor.nextInt();
        double num1;
        double num2;
        double res;

        

        if (opção == 1) {
            System.out.println("Digite o primeiro numero: ");
        num1 = leitor.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = leitor.nextInt();
            adicionar(num1, num2);
        }
        if(opção == 2){
            System.out.println("Digite o primeiro numero: ");
        num1 = leitor.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = leitor.nextInt();
            subtrair(num1,num2);
        }
        if(opção == 3){
            System.out.println("Digite o primeiro numero: ");
        num1 = leitor.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = leitor.nextInt();
            mult(num1,num2);
        }
        if(opção == 4){
            System.out.println("Digite o primeiro numero: ");
        num1 = leitor.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = leitor.nextInt();
            div(num1,num2);
        }
        if(opção == 5){System.out.println("Digite um numero: ");
        num1 = leitor.nextInt();

       fato(num1);
            
        }
        if(opção == 6){
            System.out.println("Digite o primeiro numero: ");
        num1 = leitor.nextInt();

        System.out.println("Elevado: ");
        num2 = leitor.nextInt();
           
        pot(num1,num2);
    }
    }

    public static void adicionar(double num1, double num2) {
        double res = num1 + num2;
        System.out.println("A soma é: " + res);
    }

    public static void subtrair(double num1, double num2) {
        double res = num1 - num2;
        System.out.println("A Subtração é: " + res);
    }
    
    public static void mult(double num1, double num2) {
        double res = num1 * num2;
        System.out.println("A Multiplicação é: " + res);

    }

    public static void div(double num1, double num2) {
        double res = num1 / num2;
        System.out.println("A Divisão é: " + res);

    }
    public static void fato(double num1) {
        int fat = 1;

for( int i = 2; i <= num1; i++ ){ 
     fat *= i;
    }
System.out.println(fat);
    }


    private static void pot(double num1,double num2) {
      
       double exp;
         
       exp = Math.pow(num1, num2);
       
       System.out.println("O resultado da potenciação é: " + exp);

    }

}

