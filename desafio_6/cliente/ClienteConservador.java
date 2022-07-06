package desafio_6.cliente;

import java.util.ArrayList;
import java.util.List;

import desafio_6.investimentos.Investimento;
import desafio_6.investimentos.RendaVariavel;

public class ClienteConservador extends Cliente implements Investimento {

    List<Investimento> investimentos = new ArrayList<>();

    @Override
    public void contratarInvestimento(Investimento tipoDeInvestimento) throws Exception {
        if (tipoDeInvestimento instanceof RendaVariavel) {
            throw new Exception(
                    "Tentou-se cadastrar um investimento que não é adequado ao seu perfil. Operação bloqueada.");
        } else {
            investimentos.add(tipoDeInvestimento);
        }
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

    @Override
    public String toString() {
        return "ClienteConservador [investimentos=" + investimentos + "]";
    }

}
