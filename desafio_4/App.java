package desafio_4;

// Enunciado
// Crie um programa que receba dois numeros como parametro e escreva todos os numeros do intervalo (ordem crescente) e tambem a soma.
//     Entrada: 3 1
//     Saida: 1, 2, 3 Soma: 5
//     Entrada: 2 6
//     Saida: 2,3,4,5,6 Soma: 20
// NAO USAR: Collections, Arrays, metodos utilitarios sort

public class App {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 6;
        numerosIntervaloESoma(num1, num2);
    }

    public static void numerosIntervaloESoma(int num1, int num2) {
        int intervalo = num2 - num1;
        int soma = 0;
        for (int i = 0; i < intervalo + 1; i++) {
            soma = soma + num1;
            System.out.println(num1++);
        }
        System.out.println(soma);
    }
}
