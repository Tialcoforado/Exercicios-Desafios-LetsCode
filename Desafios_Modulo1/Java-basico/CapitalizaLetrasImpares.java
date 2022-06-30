package exercíciosPrimeiraSemana;

import java.util.Scanner;

public class CapitalizaLetrasImpares {
    public static void main(String[] args) {

        // String palavra = "Escrevendo";
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma palavra para ser aplicada o capitaliza letras impares: ");
        String palavra = input.nextLine();
        input.close();

        String novaString = "";
        for (int i = 0; i < palavra.length(); i++) {
            if (i % 2 == 0) {
                novaString = palavra.substring(i, i + 1).toUpperCase();
            } else {
                novaString = palavra.substring(i, i + 1);
            }
            System.out.print(novaString);
        }

    }
}
