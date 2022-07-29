import java.util.Scanner;

public class ConversorCtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura inicial em graus Celsius: ");
        String primeiraLinha = sc.nextLine();
        Double temperaturaCelsius = Double.parseDouble(primeiraLinha);
        sc.close();
        Double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;
        System.out.printf("A temperatura transformada para fahrenheit é igual a: %.2f", temperaturaFahrenheit);
    };
}