package desafio_6;

import desafio_6.cliente.ClienteArrojado;
import desafio_6.cliente.ClienteConservador;
import desafio_6.investimentos.Acao;
import desafio_6.investimentos.CDB;
import desafio_6.investimentos.FundoImobiliario;
import desafio_6.investimentos.Investimento;
import desafio_6.investimentos.Tesouro;

public class App{
    public static void main(String[] args) throws Exception {
        var conservador = new ClienteConservador();
    //método contratarInvestimento adiciona na lista de investimentos do cliente
        conservador.contratarInvestimento(new CDB());
        conservador.contratarInvestimento(new Tesouro());
        
        try {
            conservador.contratarInvestimento(new Acao());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Carteira do cliente conservador: ");
        for (Investimento i : conservador.getCarteiraInvestimentos()) {
            System.out.println(i);
        }
        
        var arrojado = new ClienteArrojado();
        arrojado.contratarInvestimento(new Acao());
        arrojado.contratarInvestimento(new FundoImobiliario());
        
        arrojado.contratarInvestimento(new Tesouro());//ERRO de compilação
        System.out.println("Carteira do cliente arrojado: ");
        for (Investimento i : arrojado.getCarteiraInvestimentos()) {
            System.out.println(i);
        }
    }
}