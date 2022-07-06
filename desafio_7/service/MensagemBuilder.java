package desafio_7.service;

import desafio_7.models.email.Mensagem;
import desafio_7.models.formatacao.TiposFormatacao;

public class MensagemBuilder {
    private String texto;
    private TiposFormatacao formatacao;

    public MensagemBuilder() {

    }

    public MensagemBuilder texto(String texto) {
        this.texto = texto;
        return this;
    }

    public MensagemBuilder formatacao(TiposFormatacao formatacao) {
        this.formatacao = formatacao;
        return this;
    }

    private void validar() {
        if (texto == null) {
            throw new RuntimeException("Mensagem Obrigatoria.");
        }

        if (formatacao == null) {
            this.formatacao = TiposFormatacao.SEM_FORMATACAO;
        }
    }

    public Mensagem build() {
        validar();
        return new Mensagem(texto, formatacao);
    }

}
