package exercíciosPrimeiraSemana;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class ValorReaisToDolar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a cotação do Dolar (Ex:. 4,74) no dia de hoje: ");
        Double cotacaoDoDia = input.nextDouble();

        System.out.println("Informe a quatia de reais que deseja converter: ");
        Double valorEmReais = input.nextDouble();
        input.close();

        Double valorConvertidoParaDolar = valorEmReais / cotacaoDoDia;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        formatter.setCurrency(Currency.getInstance(Locale.US));
        String value = formatter.getCurrency().getDisplayName();

        System.out.printf("O valor informado em reais atualizado para Dólar é igual a: %.2f %s",
                valorConvertidoParaDolar, value);
    }
}