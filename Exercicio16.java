package trabalho.pkg1.bim;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio16 {

    static Scanner leitor = new Scanner(System.in);

    static String[] valor = new String[10];
    static int x; // variavel de entrada

    public static void main(String[] args) {
        String nome;

        for (int i=0; i <valor.length; i++) {
            System.out.println("1- Cadastre um nome\n 2- imprimir lista");
            x = leitor.nextInt();
            if(x==1){
                
                System.out.println("Digite um nome");
                nome = leitor.next();
                valor[i]= nome;
                
            }if(x==2) {
                System.out.println(Arrays.toString(valor));
                
            }
        }
    }
}
