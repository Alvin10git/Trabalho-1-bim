
package trabalho.pkg1.bim;
import java.util.Scanner;

public class Exercicio10 {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double x;
        double y;
        double z;
        
        System.out.println("Digite o primeiro numero");
        x = leitor.nextInt();
        System.out.println("Digite o segundo numero");
        y = leitor.nextInt();
	System.out.println("Digite o terceiro numero");
        z = leitor.nextInt();
        
        if((x<y+z)&&(y<x+z)&&(z<y+x)){
            System.out.println("Esta figura é um triângulo");
        }else {
            System.out.println("Esta figura não é um triângulo");
        }
    }
    
}

