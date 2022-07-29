package desafio5;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        List<Map<String, String>> minhaLista = List.of(
                Map.of("nome", "João", "telefone", "9329823423"),
                Map.of("nome", "Maria", "telefone", "9124235435"),
                Map.of("nome", "Marta", "telefone", "9456335387"),
                Map.of("nome", "José", "telefone", "9632874738"),
                Map.of("nome", "Judas", "telefone", "9329244683"));

        Pattern pattern = Pattern.compile("[7+]");

        minhaLista.stream().map(i -> i.get("nome")).filter(i -> i == ("José")).forEach(System.out::println);
        minhaLista.stream().map(i -> i.get("nome")).filter(i -> i == ("Marta")).forEach(System.out::println);
        minhaLista.stream().map(i -> i.get("telefone")).filter(pattern.asPredicate()).forEach(System.out::println);
    }
}
