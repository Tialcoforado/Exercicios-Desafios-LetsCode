package desafio_2.Exercicio_Listas_Comparator.src.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyOwnLists {

    public static <T> List<T> asListSorted(List<T> list, Comparator<T> comparator) {
        Collections.sort(list, comparator);
        return list;
    }
}
