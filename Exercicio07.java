
package trabalho.pkg1.bim;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String str1 = "admin";
        String str2;
        String senha1 = "admin";
        String senha2;
        
        System.out.println("Digite o login de acesso");
        str2 = entrada.next();
        
        System.out.println("Digite a sua senha");
        senha2 = entrada.next();
        
        if(str1.equals(str2) && senha1.equals(senha2)){
            
            System.out.println("Login efetuado com sucesso.");
        }
        else {
            System.out.println("Usúario e/ou senha incorretos.");
    }
    
    
    }
    
}


