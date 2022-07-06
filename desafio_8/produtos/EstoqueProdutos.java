package desafio_8.produtos;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private final static Map<Integer, Produto> produtosMap = carregaProdutos();

    private static Map<Integer, Produto> carregaProdutos() {
        Map<Integer, Produto> produtosMap = new HashMap<>();
        produtosMap.put(1,
                new Produto("Notebook", BigDecimal.valueOf(2000d)));

        produtosMap.put(2,
                new Produto("Orquídia", BigDecimal.valueOf(30d)));

        produtosMap.put(3,
                new Produto("Pneu", BigDecimal.valueOf(250d)));
        
        produtosMap.put(4,
                new Produto("Abacaxi", BigDecimal.valueOf(25d)));
        
        produtosMap.put(5,
                new Produto("Banana", BigDecimal.valueOf(20d)));

        produtosMap.put(6,
                new Produto("Cenoura", BigDecimal.valueOf(20d)));

        produtosMap.put(7,
                new Produto("Danone", BigDecimal.valueOf(30d)));

        produtosMap.put(8,
                new Produto("Espinafre", BigDecimal.valueOf(25d)));
        
        produtosMap.put(9,
                new Produto("Farinha de Mandioca", BigDecimal.valueOf(10d)));
        
        produtosMap.put(10,
                new Produto("Goiaba", BigDecimal.valueOf(5d)));
        
        produtosMap.put(11,
                new Produto("Hamburguer", BigDecimal.valueOf(40d)));

        produtosMap.put(12,
                new Produto("Inhame", BigDecimal.valueOf(3d)));

        produtosMap.put(13,
                new Produto("Jaboticaba", BigDecimal.valueOf(5d)));
        
        produtosMap.put(14,
                new Produto("Limão", BigDecimal.valueOf(5d)));
        
        produtosMap.put(15,
                new Produto("Mamão", BigDecimal.valueOf(10d)));
        
        produtosMap.put(16,
                new Produto("Nescau", BigDecimal.valueOf(30d)));

        return produtosMap;
    }

    public static Map<Integer, Produto> getProdutos() {
        return Collections.unmodifiableMap(produtosMap);
    }

}
