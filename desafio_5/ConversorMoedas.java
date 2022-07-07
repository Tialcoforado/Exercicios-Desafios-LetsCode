package desafio_5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class ConversorMoedas {
    public static void main(String[] args) {

        Map<String, Map<String, Double>> mapa = new HashMap<>();
        mapa.put("USD", new HashMap<>());
        mapa.put("BRL", new HashMap<>());
        mapa.put("EUR", new HashMap<>());
        mapa.get("USD").put("AUD", 1.44);
        mapa.get("USD").put("BRL", 5.15);
        mapa.get("BRL").put("EUR", 0.18);
        mapa.get("EUR").put("GBP", 0.86);

        System.out.println(converter("GBP", "USD", mapa));
    }

    public static double converter(String de, String para, Map<String, Map<String, Double>> map) {

        final Map<String, Map<String, Double>> combinacoes = new HashMap<>(map);

        // Enriquecer mapa com combinacoes invertidas. DE - PARA e PARA - DE
        // Ex. USD - AUD e AUD - USD
        for(String moedaDe :  map.keySet()) {
            final Map<String, Double> mapaMoedasPara = map.get(moedaDe);
            for (String moedaPara : mapaMoedasPara.keySet()) {
                if (!combinacoes.containsKey(moedaPara)) {
                    combinacoes.put(moedaPara, new HashMap<>());
                }
                combinacoes.get(moedaPara).put(moedaDe, 1.0 / mapaMoedasPara.get(moedaPara));
            }
        }

        Queue<String> moedas = new LinkedList<>();
        moedas.add(de);

        Queue<Double> montantes = new LinkedList<>();
        montantes.add(1.0);

        Set<String> visitados = new HashSet<>();

        while (!moedas.isEmpty()) {
            final String moeda = moedas.poll();
            final double montante = montantes.poll();

            if (visitados.contains(moeda)) {
               continue;
            }
            visitados.add(moeda);

            if (combinacoes.containsKey(moeda)) {
                final Map<String, Double> mapaInterno = combinacoes.get(moeda);

                for (String key : mapaInterno.keySet()) {
                    if (!visitados.contains(key)) {
                        moedas.add(key);
                        if (key.equals(para)) {
                            return mapaInterno.get(key) * montante;
                        }
                        montantes.add(mapaInterno.get(key) * montante);
                    }
                }
            }
        }
        return -1;
    }
}

