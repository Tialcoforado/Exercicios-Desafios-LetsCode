package desafio_7.models.formatacao;

public enum TiposFormatacao {
    SEM_FORMATACAO("sem formatação"),
    SEM_ACENTUACAO("sem acentuação"),
    CAMEL_CASE("Camel Case"),
    MAIUSCULA("Maiúscula"),
    MINUSCULA("Minúscula");

    
    private String tipoFormatacao;

    TiposFormatacao(String tipoFormatacao){
        this.tipoFormatacao = tipoFormatacao;
    }

    public String getTipoFormatacao(){
        return this.tipoFormatacao;
    }
}


