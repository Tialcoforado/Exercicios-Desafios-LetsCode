package desafio3_1.desafio3_1;

@Data
@Builder
public class Evento {
    private LocalDate inicio;
    private LocalDate fim;
    @Builder.Default
    private Map<Lugar, List<Sessao>> sessoes = new HashMap<>();
}