Enunciado

Crie a classe MyOwnLists com um método asListedSorted estático. Este método deve ter dois valores, um array de valores de um determinado tipo T e um Comparator de mesmo tipo. Este método deve retornar uma lista (List) de elementos do tipo T ordenados pela definição do Comparator.

Permita que seja possível transformar qualquer array de um determinado tipo em uma lista de mesmo tipo de forma ordenada.

Um exemplo de como seu método deverá ser chamado.

  List<Empregado> empregadosList = MyOwnLists.asListedSorted(new Empregado[]{new Empregado()},new Comparator<Empregado>(){...});

Crie uma classe principal (main) chamando o seu método para mais de um tipo de dado e para mais de um elemento no vetor de cada tipo.

Para maiores detalhes:

    https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html
    https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html#asList(T...)

