package desafio_6.investimentos;

import java.util.List;


public interface Investimento {
    void contratarInvestimento(Investimento tipoDeInvestimento) throws Exception;
    List<Investimento> getCarteiraInvestimentos();

}
