package exercíciosPrimeiraSemana;

import java.util.Scanner;

public class medidaPolegadasToCm{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor em polegadas que deseja converter para centimetros: ");
        String primeiraLinha = input.nextLine();
        Integer valorPolegadas = Integer.parseInt(primeiraLinha);
        Float valorCm = (float) (valorPolegadas / 2.54);
        input.close();
        System.out.printf("Valor em centimetros é: %5.2f", valorCm);
    };
}
