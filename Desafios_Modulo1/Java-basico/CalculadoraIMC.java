package exercíciosPrimeiraSemana;

public class CalculadoraIMC {
    public static void main(String[] args) {

        String[] nome = new String[5];
        Double[] altura = new Double[5];
        Double[] peso = new Double[5];
        Double[] IMC = new Double[5];

        nome[0] = "Tiago";
        nome[1] = "João";
        nome[2] = "Maria";
        nome[3] = "Pedro";
        nome[4] = "José";

        altura[0] = 1.70;
        altura[1] = 1.75;
        altura[2] = 1.80;
        altura[3] = 1.65;
        altura[4] = 1.60;

        peso[0] = 50.00;
        peso[1] = 72.00;
        peso[2] = 78.00;
        peso[3] = 70.00;
        peso[4] = 90.00;

        for (int i = 0; i < 5; i++) {
            IMC[i] = peso[i] / (altura[i] * altura[i]);
            if (IMC[i] < 18.50) {
                System.out.printf("A pessoa identificada com o nome %s e IMC igual a %.2f está a baixo do peso \n",
                        nome[i], IMC[i]);
            }
            if (IMC[i] > 18.50 && IMC[i] < 25.00) {
                System.out.printf("A pessoa identificada com o nome %s e IMC igual a %.2f está dentro do peso ideal \n",
                        nome[i], IMC[i]);
            } else {
                System.out.printf("A pessoa identificada com o nome %s e IMC igual a %.2f está acima do peso ideal \n",
                        nome[i], IMC[i]);
            }
        }
    }
}
