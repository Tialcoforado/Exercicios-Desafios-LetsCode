package desafio_7.models.formatacao;

public class SemFormatacao implements FormatacaoStrategy {

    @Override
    public String formatar(String msg) {
        return msg;
    }
    
}
