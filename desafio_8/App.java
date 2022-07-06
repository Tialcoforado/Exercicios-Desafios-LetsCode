package desafio_8;

import java.util.Map;

import desafio_8.descontos.RegraDescontos;
import desafio_8.produtos.ListaProduto;
import desafio_8.produtos.Produto;
import desafio_8.produtos.CestaProdutos;

public class App{
    public static void main(String[] args) {
        
        CestaProdutos sessao = new CestaProdutos();
        Map<Integer, Produto> estoque = sessao.getProdutos();
        
        //Inicialização das Listas com produtos
        ListaProduto minhaLista = inicializaLista(estoque);
        ListaProduto minhaListaCom5Produtos = inicializaListaCom5Produtos(estoque);
        ListaProduto minhaListaCom10Produtos = inicializaListaCom10Produtos(estoque);
        ListaProduto minhaListaCom16Produtos = inicializaListaCom16Produtos(estoque);
        
        
        // Teste do desconto para menos de 5 itens
        System.out.println(minhaLista.getValorTotal());
        RegraDescontos.retornaValorComDesconto(minhaLista);
        
        // Teste do desconto para mais de 5 e menos de 10 itens
        System.out.println(minhaListaCom5Produtos.getValorTotal());
        RegraDescontos.retornaValorComDesconto(minhaListaCom5Produtos);
        
        // Teste do desconto para mais de 10 e menos de 15
        System.out.println(minhaListaCom10Produtos.getValorTotal());
        RegraDescontos.retornaValorComDesconto(minhaListaCom10Produtos);
        
        // Teste do desconto para mais de 15 produtos
        System.out.println(minhaListaCom16Produtos.getValorTotal());
        RegraDescontos.retornaValorComDesconto(minhaListaCom16Produtos);
        


    }

    private static ListaProduto inicializaListaCom16Produtos(Map<Integer, Produto> estoque) {
        ListaProduto minhaListaCom16Produtos = new ListaProduto();
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(1));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(2));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(3));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(4));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(5));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(6));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(7));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(8));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(9));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(10));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(11));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(12));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(13));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(14));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(15));
        minhaListaCom16Produtos.adicionarProdutos(estoque.get(16));
        return minhaListaCom16Produtos;
    }

    private static ListaProduto inicializaListaCom10Produtos(Map<Integer, Produto> estoque) {
        ListaProduto minhaListaCom10Produtos = new ListaProduto();
        minhaListaCom10Produtos.adicionarProdutos(estoque.get(1));
        minhaListaCom10Produtos.adicionarProdutos(estoque.get(2));
        minhaListaCom10Produtos.adicionarProdutos(estoque.get(3));
        minhaListaCom10Produtos.adicionarProdutos(estoque.get(4));
        minhaListaCom10Produtos.adicionarProdutos(estoque.get(5));
        minhaListaCom10Produtos.adicionarProdutos(estoque.get(6));
        minhaListaCom10Produtos.adicionarProdutos(estoque.get(7));
        minhaListaCom10Produtos.adicionarProdutos(estoque.get(8));
        minhaListaCom10Produtos.adicionarProdutos(estoque.get(9));
        minhaListaCom10Produtos.adicionarProdutos(estoque.get(10));
        return minhaListaCom10Produtos;
    }

    private static ListaProduto inicializaListaCom5Produtos(Map<Integer, Produto> estoque) {
        ListaProduto minhaListaCom5Produtos = new ListaProduto();
        minhaListaCom5Produtos.adicionarProdutos(estoque.get(1));
        minhaListaCom5Produtos.adicionarProdutos(estoque.get(2));
        minhaListaCom5Produtos.adicionarProdutos(estoque.get(3));
        minhaListaCom5Produtos.adicionarProdutos(estoque.get(4));
        minhaListaCom5Produtos.adicionarProdutos(estoque.get(5));
        return minhaListaCom5Produtos;
    }

    private static ListaProduto inicializaLista(Map<Integer, Produto> estoque) {
        ListaProduto minhaLista = new ListaProduto();
        minhaLista.adicionarProdutos(estoque.get(1));
        minhaLista.adicionarProdutos(estoque.get(2));
        minhaLista.adicionarProdutos(estoque.get(3));
        return minhaLista;
    }  
}