package trabalho.pkg1.bim;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dia;
        int mes;
        int ano;

        System.out.println("Digite um Dia");
        dia = leitor.nextInt();
        System.out.println("Digite um Mês");
        mes = leitor.nextInt();
        System.out.println("Digite um ano");
        ano = leitor.nextInt();

        if (mes == 4 && mes == 6 && mes == 9 && mes == 11 && dia > 0 && dia >= 31) {
            System.out.println("A data é inválida");
        } else {
            if (mes == 2 && dia >= 29) {
                System.out.println("A data é inválida");
            } else {
                if (mes == 1 && mes == 3 && mes == 5 && mes == 7 && mes == 8 && mes == 10 && mes == 12 && dia > 31) {
                    System.out.println("A data é inválida");
                } else {

                    switch (mes) {
                        case 1:
                            System.out.println(dia + "janeiro" + ano);
                            break;
                        case 2:
                            System.out.println(dia + "Fevereiro" + ano);
                            break;
                        case 3:
                            System.out.println(dia + "Março" + ano);
                            break;
                        case 4:
                            System.out.println(dia + "Abril" + ano);
                            break;
                        case 5:
                            System.out.println(dia + "Maio" + ano);
                            break;
                        case 6:
                            System.out.println(dia + "junho" + ano);
                            break;
                        case 7:
                            System.out.println(dia + "Julho" + ano);
                            break;
                        case 8:
                            System.out.println(dia + "Agosto" + ano);
                            break;
                        case 9:
                            System.out.println(dia + "Setembro" + ano);
                            break;
                        case 10:
                            System.out.println(dia + "Outubro" + ano);
                            break;
                        case 11:
                            System.out.println(dia + "Novembro" + ano);
                            break;
                        case 12:
                            System.out.println(dia + "Dezembro" + ano);
                            break;
                    }
                }

            }
        }

    }

}
