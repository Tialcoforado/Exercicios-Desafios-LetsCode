package desafio_8.descontos;

import java.math.BigDecimal;

import desafio_8.produtos.ListaProduto;

public class RegraDescontos {
    private static BigDecimal aplicaDesconto(int quantidadeDeProdutos, BigDecimal valorTotal) {
        if (quantidadeDeProdutos > 15){
            return valorTotal.multiply(BigDecimal.valueOf(0.90));
        }
        if (quantidadeDeProdutos >= 10 && quantidadeDeProdutos < 15 ){
            return valorTotal.multiply(BigDecimal.valueOf(0.92));
        }
        if (quantidadeDeProdutos >= 5 && quantidadeDeProdutos < 10 ){
            return valorTotal.multiply(BigDecimal.valueOf(0.95));
        }
        else {
            return valorTotal;
        }
    }

    public static BigDecimal retornaValorComDesconto(ListaProduto minhaLista) {
        int quantidadeDeProdutos = minhaLista.getQuantidadeDeProdutos();
        BigDecimal valorTotal = minhaLista.getValorTotal();
        BigDecimal valorComDesconto = aplicaDesconto(quantidadeDeProdutos, valorTotal);
        System.out.println(valorComDesconto);
        
        return valorComDesconto;
    }
}
