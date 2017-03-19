package trabalho.pkg1.bim;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double matriz[][] = new double[3][3];
        double matriz2[][] = new double[3][3];
        double num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                matriz[i][j] = num;
                num++;
                matriz2[i][j] = matriz[i][j];

                System.out.print("matriz 1 = " +(matriz[i][j]));
                System.out.print(" ");
                System.out.println("matriz 2 = " +(matriz[i][j]));
            }
            
        }
        

    }
}
