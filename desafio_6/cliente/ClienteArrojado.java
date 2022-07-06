package desafio_6.cliente;

import java.util.ArrayList;
import java.util.List;

import desafio_6.investimentos.Investimento;

public class ClienteArrojado extends Cliente implements Investimento {
    List<Investimento> investimentos = new ArrayList<>();

    @Override
    public void contratarInvestimento(Investimento tipoDeInvestimento) {
        
        investimentos.add(tipoDeInvestimento);
    }

    public void setInvestimentos(List<Investimento> investimentos) {
        this.investimentos = investimentos;
    }

    public List<Investimento> getInvestimentos() {
        return investimentos;
    }

    @Override
    public List<Investimento> getCarteiraInvestimentos() {
        return getInvestimentos();
    }
    
}
