package exercíciosPrimeiraSemana;

import java.util.Scanner;

public class QualMaiorNome {
    public static void main(String[] args) {
        // String[] sacolaDeNomes = {"Tiago", "Pitagoras", "Galileu", "Socrates",
        // "Platao"};

        String[] sacolaDeNomes;
        sacolaDeNomes = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro nome: ");
        sacolaDeNomes[0] = input.nextLine();
        System.out.println("Digite o segundo nome: ");
        sacolaDeNomes[1] = input.nextLine();
        System.out.println("Digite o terceiro nome: ");
        sacolaDeNomes[2] = input.nextLine();
        System.out.println("Digite o quarto nome: ");
        sacolaDeNomes[3] = input.nextLine();
        System.out.println("Digite o quinto nome: ");
        sacolaDeNomes[4] = input.nextLine();
        input.close();

        String maiorDaLista = "";

        for (int i = 0; i < sacolaDeNomes.length; i++) {
            Integer result = (maiorDaLista.length()) - (sacolaDeNomes[i].length());
            if (result < 0) {
                maiorDaLista = sacolaDeNomes[i];
            }
        }

        System.out.println("O maior nome da lista é: " + maiorDaLista);

    }
}
