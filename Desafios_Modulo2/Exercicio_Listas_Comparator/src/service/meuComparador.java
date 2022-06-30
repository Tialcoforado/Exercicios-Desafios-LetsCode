package src.service;
import java.util.Comparator;

import src.models.Empregado;
import src.models.Empresa;

public class meuComparador<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        
        if (!(o1 instanceof Empregado && o2 instanceof Empregado) && !(o1 instanceof Empresa && o2 instanceof Empresa)) {

            try {
                throw new Exception("Classes diferentes não poderam ser comparadas no momento");
            } catch (Exception e) {
                System.err.println(e);
            }

        }

        if (o1 instanceof Empregado && o2 instanceof Empregado){
            Empregado empregado1 = (Empregado) o1;
            Empregado empregado2 = (Empregado) o2;

            if (empregado1.getNome().compareTo(empregado2.getNome()) > 0) {
                return 1;
            }
            return -1;
        }

        if (o1 instanceof Empresa && o2 instanceof Empresa) {
            Empresa empresa1 = (Empresa) o1;
            Empresa empresa2 = (Empresa) o2;

            if (empresa1.getNomeFantasia().compareTo(empresa2.getNomeFantasia()) > 0){
                return 1;
            }
            return -1;
        }

        return 0;
    }

}
