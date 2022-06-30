package exercíciosPrimeiraSemana;

import java.util.Scanner;

public class MaisVelhoMaisNovoMedia {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        int[] idades = new int[3];
        int idadeMaisNova = 99;
        String nomeDaPessoaMaisNova = "";
        int idadeMaisVelha = 0;
        String nomeDaPessoaMaisVelha = "";

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome: ");
            nomes[i] = scan.next();
            System.out.println("Digite a idade:");
            idades[i] = scan.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (idades[i] < idadeMaisNova) {
                idadeMaisNova = idades[i];
                nomeDaPessoaMaisNova = nomes[i];
            }
            if (idades[i] > idadeMaisVelha) {
                idadeMaisVelha = idades[i];
                nomeDaPessoaMaisVelha = nomes[i];
            }
        }
        scan.close();

        System.out.printf("A pessoa mais nova é %s e sua idade é: %d \n", nomeDaPessoaMaisNova, idadeMaisNova);
        System.out.printf("A pessoa mais velha é %s e sua idade é: %d ", nomeDaPessoaMaisVelha, idadeMaisVelha);

    }
}
