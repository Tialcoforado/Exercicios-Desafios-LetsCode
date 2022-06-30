package exercíciosPrimeiraSemana;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero entre 1 e 10: ");
        String primeiraLinha = sc.nextLine();
        Integer numeroInteiro = Integer.parseInt(primeiraLinha);
        sc.close();
        System.out.printf("Tabuada do numero %d: ", numeroInteiro);
        Integer multiplicadores = 1;
        while (multiplicadores < 11) {
            System.out.println(multiplicadores * numeroInteiro);
            multiplicadores++;
        }; 
    };
}
