package desafio_8.produtos;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListaProduto {
    private Set<Produto> carrinhoComProdutos = new LinkedHashSet<>(); // Mantém a ordem em que foi adicionado

    public void adicionarProdutos(Produto produto) {
        carrinhoComProdutos.add(produto);
    }

    public void removerProdutos(Produto produto) {
        carrinhoComProdutos.remove(produto);
    }

    public Set<Produto> getProdutos() {
        return Collections.unmodifiableSet(carrinhoComProdutos);
    }

    public int getQuantidadeDeProdutos() {
        int quantidadeItens = carrinhoComProdutos.size();
        return quantidadeItens;
    }

    public BigDecimal getValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;

        for (Produto produto : this.carrinhoComProdutos) {
            valorTotal = valorTotal.add(produto.getPreco());
        }

        return valorTotal;
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompra [carrinhoComProdutos=" + carrinhoComProdutos + "]";
    }

}
