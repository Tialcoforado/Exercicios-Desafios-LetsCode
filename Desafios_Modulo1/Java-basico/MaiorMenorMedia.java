package exercíciosPrimeiraSemana;
import java.util.ArrayList;

public class MaiorMenorMedia{
    public static void main(String[] args) {
        Integer maior = 0;
        Integer menor = 100;

        ArrayList<Integer> sacolaDeNumero = new ArrayList<>();
        
        sacolaDeNumero.add(20);
        sacolaDeNumero.add(35);
        sacolaDeNumero.add(40);
        sacolaDeNumero.add(55);
        sacolaDeNumero.add(60);
        
        for (int i = 0; i < sacolaDeNumero.size(); i++) {
            if (sacolaDeNumero.get(i) > maior) {
                maior = sacolaDeNumero.get(i);
            } if (sacolaDeNumero.get(i) < menor) {
                menor = sacolaDeNumero.get(i);
            } else {
                System.out.println("Numero : " + sacolaDeNumero.get(i));
            }
        }
        
        System.out.printf("O maior valor na lista é: %d \n", maior);
        System.out.printf("O menor valor na lista é: %d \n", menor);       
        int total = 0;
        for (int i = 0; i < sacolaDeNumero.size(); i++) {
            total += sacolaDeNumero.get(i);
        }

        int media = total / sacolaDeNumero.size();
        System.out.printf("O valor total é igual a: %d \n", total);
        System.out.printf("O valor da média é igual a: %d \n", media);
    }
}


