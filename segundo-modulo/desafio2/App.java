package desafio2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        Integer ano = 2022;
        Double salarioBase = 1000.00;
        Double salarioTotalMes = 0.00;
        Double salarioAno = 0.00;
        Map<Month, Integer> mesesEDias = new HashMap<>();
        List<LocalDate> listaDosDiasUteisDoMes = new ArrayList<>();

        Set<YearMonth> mesesAno = new HashSet<>();
        for (int i = 1; i <= 12; i++) {
            mesesAno.add(YearMonth.of(ano, i));
        }

        criaDiasUteisDoAno(mesesEDias, mesesAno);

        calculaSalarioMesETotalAno(salarioBase, salarioAno, mesesEDias, mesesAno);

        // TODO - implementar feriados
        // Set<LocalDate> feriados = new HashSet<>();
        // feriados.addAll(getFeriadosFixos(year));
        // feriados.addAll(getFeriadosMoveis(year));

        // TODO
        // && !feriados.contains(data) - quando impelmentar feriados adicionar essa
        // linha ao if

    }

    private static void calculaSalarioMesETotalAno(Double salarioBase, Double salarioAno, Map<Month, Integer> mesesEDias,
            Set<YearMonth> mesesAno) {
        Double salarioTotalMes;
        for (YearMonth yearMonth : mesesAno) {
            Month mes = yearMonth.getMonth();
            salarioTotalMes = salarioBase + (0.5 * mesesEDias.get(mes));
            System.out.println("O salario do mes: " + mes + " = " + salarioTotalMes);
            salarioAno = salarioAno + salarioTotalMes;
        }

        System.out.println("O total do ano: ");
        System.out.println(salarioAno);
    }

    private static void criaDiasUteisDoAno(Map<Month, Integer> mesesEDias, Set<YearMonth> mesesAno) {
        List<LocalDate> listaDosDiasUteisDoMes;
        for (YearMonth yearMonth : mesesAno) {
            listaDosDiasUteisDoMes = Stream
                    .iterate(yearMonth.atDay(1), data -> data.plusDays(1))
                    .limit(yearMonth.lengthOfMonth())
                    .filter(data -> !data.getDayOfWeek().equals(DayOfWeek.SATURDAY)
                            && !data.getDayOfWeek().equals(DayOfWeek.SUNDAY))
                    .collect(Collectors.toList());

            int diasDoMes = listaDosDiasUteisDoMes.size();
            Month nomeMes = yearMonth.getMonth();
            mesesEDias.put(nomeMes, diasDoMes);
        }
    }
}
