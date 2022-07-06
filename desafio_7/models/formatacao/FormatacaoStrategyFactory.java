package desafio_7.models.formatacao;

public class FormatacaoStrategyFactory {
    public FormatacaoStrategy criarFormatacao(TiposFormatacao formatacao){
        switch (formatacao) {
            case CAMEL_CASE:
                return new CamelCaseFormatacao();
            case MAIUSCULA:
                return new MaiusculaFormatacao();
            case SEM_ACENTUACAO:
                return new SemAcentuacao();
            case MINUSCULA:
                return new MinusculaFormatacao();
            case SEM_FORMATACAO:
                return new SemFormatacao();
            default:
                System.err.println("Formatacao nao compativel.");
                return new SemFormatacao();
        }
    }
}