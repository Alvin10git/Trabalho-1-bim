package trabalho.pkg1.bim;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[] valor = new double[10];
        double soma = 0;

        for (int y = 0; y < valor.length; y++) {
            System.out.println("Digite o " + (y + 1) + "° numero");
            valor[y] = leitor.nextDouble();

        }
    
        for (int x = 0; x < 10; x++) {
            soma = soma + valor[x];
           
        }
         System.out.println("A soma é: " + soma);
        
    }

}
