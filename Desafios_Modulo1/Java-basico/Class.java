package exercíciosPrimeiraSemana;
import java.util.Scanner;

public class Class {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro numero inteiro: ");
        String primeiraLinha = sc.nextLine();
        Integer primeiroInteiro = Integer.parseInt(primeiraLinha);

        System.out.println("Informe o segundo numero inteiro: ");
        String segundaLinha = sc.nextLine();
        Integer segundoInteiro = Integer.parseInt(segundaLinha);
        
        Integer soma = primeiroInteiro + segundoInteiro;
        Integer subtração = primeiroInteiro - segundoInteiro;
        Integer multiplicacao = primeiroInteiro * segundoInteiro;
        Integer divisao = primeiroInteiro / segundoInteiro;
        sc.close();

        System.out.printf(
                "Para os números informados %d e %d, o resultado da soma é %d, a subtração é igual a %d, multiplicação %d e divisão %d",
                primeiroInteiro, segundoInteiro, soma, subtração, multiplicacao, divisao);

    };

}