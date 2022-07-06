package desafio_7.models.formatacao;

public class MinusculaFormatacao implements FormatacaoStrategy {

    @Override
    public String formatar(String msg) {
        return msg.toLowerCase();
    }
    
}
