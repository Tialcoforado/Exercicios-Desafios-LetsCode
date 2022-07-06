package desafio_8.produtos;

import java.util.Map;

public class CestaProdutos {
    EstoqueProdutos estoque;
    ListaProduto listaProduto;

    public CestaProdutos() {
        this.estoque = new EstoqueProdutos();
    }

    public Map<Integer, Produto> getProdutos() {
        return EstoqueProdutos.getProdutos();
    }

    public void adicionaProdutoNoCarrinho(Produto produto) {
        this.listaProduto.adicionarProdutos(produto);
    }

    public void removerProdutoDoCarrinho(Produto produto) {
        this.listaProduto.removerProdutos(produto);
    }

}
