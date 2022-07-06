package desafio_7.service;

import java.util.ArrayList;
import java.util.List;

import desafio_7.models.email.Email;
import desafio_7.models.email.Mensagem;

public class EmailBuilder {
    private String remetente;
    private String destinatario;
    private List<String> cc = new ArrayList<>();
    private String assunto;
    private Mensagem msg;

    public EmailBuilder(){
    }

    public EmailBuilder remetente(String remetente){
        this.remetente = remetente;
        return this;
    }

    public EmailBuilder destinatario(String destinatario){
        this.destinatario = destinatario;
        return this;
    }

    public EmailBuilder cc(String cc){
        this.cc.add(cc);
        return this;
    }

    public EmailBuilder assunto(String assunto){
        this.assunto = assunto;
        return this;
    }

    public EmailBuilder msg(Mensagem msg){
        this.msg = msg;
        return this;
    }

    private void validar(){
        if (this.remetente == null){
            throw new RuntimeException("Remetente não pode estar vazio.");
        }
        if (this.destinatario == null){
            throw new RuntimeException("Destinatario não pode estar vazio.");
        }
    }

    public Email build(){
        validar();
        return new Email(remetente, destinatario, cc, assunto, msg);
    }

}
