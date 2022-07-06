package desafio_7;

import desafio_7.models.email.Email;
import desafio_7.models.email.Mensagem;
import desafio_7.models.formatacao.TiposFormatacao;
import desafio_7.service.EmailBuilder;
import desafio_7.service.MensagemBuilder;

public class App {
    public static void main(String[] args) {
        System.out.println("Teste Camel Case: ");
        teste(TiposFormatacao.CAMEL_CASE);
        System.out.println("Teste sem acento: ");
        teste(TiposFormatacao.SEM_ACENTUACAO);
        System.out.println("Teste tudo Maiusculo: ");
        teste(TiposFormatacao.MAIUSCULA);
        System.out.println("Teste tudo Minusculo: ");
        teste(TiposFormatacao.MINUSCULA);
        System.out.println("Teste sem formatação: ");
        teste(TiposFormatacao.SEM_FORMATACAO);

    }

    public static void teste(TiposFormatacao tiposFormatacao) {

        Mensagem mensagem = new MensagemBuilder()
                .texto("Lorem Ípsum dolór sit Amet")
                .formatacao(tiposFormatacao)
                .build();

        Email email = new EmailBuilder()
                .remetente("remetente@email.com")
                .destinatario("destinatario@email.com")
                .cc("comCopiaUm@email.com")
                .cc("comCopiaDois@email.com")
                .assunto("Assunto do Email")
                .msg(mensagem)
                .build();

        email.enviar();
    }
}