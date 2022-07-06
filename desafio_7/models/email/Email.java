package desafio_7.models.email;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Email {
    private String remetente;
    private String destinatario;
    private List<String> cc = new ArrayList<>();
    private String assunto;
    private Mensagem msg;

    public Email(String remetente, String destinatario, List<String> cc, String assunto, Mensagem msg) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.cc = cc;
        this.assunto = assunto;
        this.msg = msg;
    }

    public void enviar() {
        System.out.println(
                "\n" + "EMAIL ENVIADO COM SUCESSO \n" +
                        "DE: " + getRemetente() + "\n" +
                        "PARA: " + getDestinatario() + "\n" +
                        "Assunto: " + getAssunto() + "\n" +
                        "MENSAGEM: " + getMsg().toString() + "\n" +
                        LocalDateTime.now() + "\n");
    }

    public String getRemetente() {
        return remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public List<String> getCc() {
        return cc;
    }

    public String getAssunto() {
        return assunto;
    }

    public Mensagem getMsg() {
        return msg;
    }

}
