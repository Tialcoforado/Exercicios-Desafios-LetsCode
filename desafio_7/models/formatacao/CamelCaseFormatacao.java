package desafio_7.models.formatacao;

import java.util.StringTokenizer;

public class CamelCaseFormatacao implements FormatacaoStrategy {

    @Override
    public String formatar(String msg) {
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(msg, " ");

        while (stringTokenizer.hasMoreTokens()){
            String palavra = stringTokenizer.nextToken();
            stringBuilder.append(Character.toUpperCase(palavra.charAt(0)));
            stringBuilder.append(palavra.substring(1).toLowerCase() + " ");
        }


        return stringBuilder.toString();
    }

    
}
