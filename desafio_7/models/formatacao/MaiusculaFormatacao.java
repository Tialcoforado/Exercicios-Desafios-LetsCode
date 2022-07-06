package desafio_7.models.formatacao;

public class MaiusculaFormatacao implements FormatacaoStrategy {

    @Override
    public String formatar(String msg) {
        return msg.toUpperCase();
    }
    
}
