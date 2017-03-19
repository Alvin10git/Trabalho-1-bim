package trabalho.pkg1.bim;

import java.util.*;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opção;

        do {
            System.out.println("1.-triangulo\n2.-retangulo\n3.-circulo\n4.-quadrado\n5.-Trapésio\n6.-sair");
            opção = leitor.nextInt();

            double base, altura, area; // triangulo
            double baseret, alturaret, arearet; // retangulo
            double raio, pi = 3.1416, areacir; //circulo
            double baseq, alturaq, areaq; //quadrado
            double basemenor, basemaior, alturatra, areatra; // trapezio

            if (opção == 1) {
                System.out.println("Digite a base do triangulo");
                base = leitor.nextDouble();
                System.out.println("Digite a altura do triangulo");
                altura = leitor.nextDouble();
                area = (base * altura) / 2;
                System.out.println("area do triangulo é: " + area);

            }
            if (opção == 2) {
                System.out.println("Digite a base do retangulo");
                baseret = leitor.nextDouble();
                System.out.println("Digite a altura do retangulo");
                alturaret = leitor.nextDouble();
                arearet = baseret * alturaret;
                System.out.println("A area do retangulo é: " + arearet);
            }
            if (opção == 3) {
                System.out.println("Digite o raio do circulo");
                raio = leitor.nextDouble();
                areacir = pi * raio * raio;
                System.out.println("A area do circulo é: " + areacir);
            }
            if (opção == 4) {
                System.out.println("Digite a base do quadrado");
                baseq = leitor.nextDouble();
                System.out.println("Digite a altura do quadrado");
                alturaq = leitor.nextDouble();
                areaq = baseq * alturaq;
                System.out.println("A area do quadrado é: " + areaq);
            }
            if (opção == 5) {
                System.out.println("Digite a base menor do trápezio");
                basemenor = leitor.nextDouble();
                System.out.println("Digite a base maior do trápezio");
                basemaior = leitor.nextDouble();
                System.out.println("Digite a altura do trápezio");
                alturatra = leitor.nextDouble();
                areatra = (basemenor + basemaior);
                areatra = areatra * alturatra;
                areatra = areatra / 2;
                System.out.println("A area do trápezio é: " + areatra);
            }
        } while (opção < 6);
    }
}
