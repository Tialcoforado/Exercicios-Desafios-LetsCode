import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    private static List<Map<String, String>> original = new ArrayList<>();
    static {
        original.add(Map.of("nome", "João", "nascimento", "11-12-85"));
        original.add(Map.of("nome", "Maria", "nascimento", "24-07-88"));
        original.add(Map.of("nome", "Ana", "nascimento", "14-02-83"));
        original.add(Map.of("nome", "Pedro", "nascimento", "02-11-89"));
    }

    public static void main(String[] args) {
        DateTimeFormatter f = new DateTimeFormatterBuilder()
                .appendPattern("dd-MM-")
                .appendValueReduced(ChronoField.YEAR, 2, 2, 1900)
                .toFormatter();

        for (var pessoa : original) {
            var nome = pessoa.get("nome");
            var nascimento = pessoa.get("nascimento");
            LocalDate dataNasc = LocalDate.parse(nascimento, f);
            var idadeEmAnos = dataNasc.until(LocalDateTime.now(), ChronoUnit.YEARS);
            System.out.printf("O usuário %s, nascido em %s, tem %s anos \n", nome, nascimento, idadeEmAnos);
        }

    }
}