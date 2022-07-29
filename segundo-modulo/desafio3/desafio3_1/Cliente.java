/* package desafio3_1.desafio3_1;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Cliente {
    public static void main(String[] args) {
        Instant inicial = Instant.now();

        ZoneId fusoHorarioParis = ZoneId.of("Europe/Paris");
        ZoneId fusoHorarioSaoPaulo = ZoneId.of("America/Sao_Paulo");

        Evento evento = new Evento.EventoBuilder()
                .inicio(LocalDate.of(2022, 7, 20))
                .fim(LocalDate.of(2022, 10, 31)).build();
        evento.getSessoes().put(Lugar.SaoPaulo, new ArrayList<>());
        evento.getSessoes().put(Lugar.Paris, new ArrayList<>());
        ZonedDateTime proximaSessao = ZonedDateTime.of(
                LocalDateTime.of(2022, 7, 20, 10, 0, 0),
                fusoHorarioSaoPaulo);
        while (true) {
            if (proximaSessao.isAfter(ZonedDateTime.of(LocalDateTime.of(
                    evento.getFim().getYear(), evento.getFim().getMonth(), evento.getFim().getDayOfMonth(),
                    23, 59, 59), fusoHorarioSaoPaulo))) {
                break;
            }
            Sessao saoPaulo = Sessao.builder()
                    .inicio(proximaSessao)
                    .fim(proximaSessao.plusHours(6))
                    .build();
            evento.getSessoes().get(Lugar.SaoPaulo).add(saoPaulo);
            evento.getSessoes().get(Lugar.Paris).add(
                    Sessao.builder()
                            .inicio(saoPaulo.getInicio().withZoneSameInstant(fusoHorarioParis))
                            .fim(saoPaulo.getFim().plusHours(6))
                            .build());
            proximaSessao = proximaSessao.plusDays(10).plusHours(2);
        }

        var formatadorDataHora = DateTimeFormatter.ofPattern("dd/MM HH:mm");
        var formatadorHora = DateTimeFormatter.ofPattern("HH:mm");
        for (Lugar lugar : evento.getSessoes().keySet()) {
            System.out.println();
            System.out.printf("%s %n",
                    switch (lugar) {
                        case SaoPaulo -> "São Paulo";
                        case Paris -> "Paris";
                        default -> "";
                    });
            System.out.println();
            int i = 0;
            for (Sessao sessao : evento.getSessoes().get(lugar)) {
                System.out.printf("%02d - %s até %s - %s%n",
                        ++i,
                        sessao.getInicio().format(formatadorDataHora),
                        sessao.getFim().format(formatadorHora),
                        switch (sessao.getInicio().getDayOfWeek()) {
                            case MONDAY -> "Segunda";
                            case TUESDAY -> "Terça";
                            case WEDNESDAY -> "Quarta";
                            case THURSDAY -> "Quinta";
                            case FRIDAY -> "Sexta";
                            case SATURDAY -> "Sábado";
                            case SUNDAY -> "Domingo";
                            default -> "";
                        });
            }
        }
        System.out.println();
        System.out.printf("Duração: %dns%n", Duration.between(inicial, Instant.now()).getNano());
    }
}
 */