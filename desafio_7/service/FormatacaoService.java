package desafio_7.service;

import desafio_7.models.formatacao.FormatacaoStrategy;

public class FormatacaoService {
    private String msg;
    private FormatacaoStrategy strategy;

    protected FormatacaoService(String msg, FormatacaoStrategy strategy){
        this.msg = msg;
        this.strategy = strategy;
    }

    public String processarMensagem(){
        return  strategy.formatar(msg);   
    }
}
