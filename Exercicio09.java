
package trabalho.pkg1.bim;

import java.util.Scanner;


public class Exercicio09 {

   
    public static void main(String[] args) {
	
        Scanner leitor = new Scanner(System.in);
        int x;//declarando variaveis
	int y;
	int z;
	 
        System.out.println("Digite o primeiro numero");
        x = leitor.nextInt();
        System.out.println("Digite o segundo numero");
        y = leitor.nextInt();
	System.out.println("Digite o terceiro numero");
        z = leitor.nextInt();
        
        if (x == y && x == z){
		System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero");
	}else if(x == y || x == z){
		System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
		}else
		System.out.println("Três lados diferentes. Trata-se de um Triangulo Escaleno");
}

        
    
}
