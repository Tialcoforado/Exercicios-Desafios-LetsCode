package desafio_7.models.email;

import desafio_7.models.formatacao.FormatacaoStrategyFactory;
import desafio_7.models.formatacao.TiposFormatacao;
import desafio_7.service.FormatacaoBuilder;
import desafio_7.service.FormatacaoService;

public class Mensagem {
    private String texto;

    public Mensagem(String texto, TiposFormatacao formatacao){
        FormatacaoStrategyFactory formatacaoFactory = new FormatacaoStrategyFactory();
        FormatacaoService formatacaoService = new FormatacaoBuilder()
            .msg(texto)
            .formatacao(formatacaoFactory.criarFormatacao(formatacao))
            .build();
            
        this.texto = formatacaoService.processarMensagem();
    }

    @Override
    public String toString() {
        return this.texto;
    }


}
