package exercíciosPrimeiraSemana;

import java.util.Scanner;

public class NumeroParOuImpar {
    public static void main(String[] args) {

        // minha solução um pouco simples de mais

        /*
         * int[] numeros = { 10, 25, 30, 45, 50 };
         * int pares;
         * int impares;
         * 
         * for (int i = 0; i < numeros.length; i++) {
         * if (numeros[i] % 2 == 0) {
         * pares = numeros[i];
         * System.out.println("Esses são números pares: " + pares);
         * } else {
         * impares = numeros[i];
         * System.out.println("Esses são números impares: " + impares);
         * }
         * }
         * }
         * }
         */

        // resolução dos professores da let's code

        System.out.println("Digite 5 números (diferente de zero) e vou separar os pares dos ímpares");
        Scanner sc = new Scanner(System.in);
        int[] pares = new int[5];
        int contPares = 0;
        int[] impares = new int[5];
        int contImpares = 0;

        for (int i = 0; i < 5; i++) {
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                pares[contPares++] = numero;
            } else {
                impares[contImpares++] = numero;
            }
        }

        System.out.printf("Os pares são: %d", pares[0]);
        for (int i = 1; i < pares.length; i++) {
            if (pares[i] == 0) {
                break;
            }
            System.out.printf(", %d", pares[i]);
        }

        System.out.printf("%nOs impares são: %d", impares[0]);
        for (int i = 1; i < impares.length; i++) {
            if (impares[i] == 0) {
                break;
            }
            System.out.printf(", %d", impares[i]);
        }
        sc.close();
    }
}
