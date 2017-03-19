package trabalho.pkg1.bim;

public class Exercicio21 {

    public static void main(String[] args) {
        int[][][][] matriz = new int[10][10][10][10];
        int cont = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        matriz[i][j][k][l] = cont;
                        cont++;

                        System.out.println(matriz[i][j][k][l]);
                    }
                }
            }
        }

    }

}
