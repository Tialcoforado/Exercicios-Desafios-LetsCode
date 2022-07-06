package desafio_7.service;

import desafio_7.models.formatacao.FormatacaoStrategy;

public class FormatacaoBuilder {
    private String msg;
    private FormatacaoStrategy formatacao;

    public FormatacaoBuilder(){

    }
    
    public FormatacaoBuilder msg(String msg){
        this.msg = msg;
        return this;
    }

    public FormatacaoBuilder formatacao(FormatacaoStrategy formatacao){
        this.formatacao = formatacao;
        return this;
    }

    public FormatacaoService build(){
        return new FormatacaoService(msg, formatacao);
    }
}
