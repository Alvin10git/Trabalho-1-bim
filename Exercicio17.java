package trabalho.pkg1.bim;



public class Exercicio17 {
 
    public static void main(String[] args) {
        
        int tam = 10;
        int[] contador = new int[tam] ;

        ImprimeVet(tam, contador);
    }
        
private static void ImprimeVet (int Tam, int Vet[]){
       int cont = 10;
        
            for(int j=0;j<10; j ++){
         Vet[j] = cont;
         cont = cont + 10;
          System.out.println(Vet[j]);
          
          
            
        }
   
    }

}
