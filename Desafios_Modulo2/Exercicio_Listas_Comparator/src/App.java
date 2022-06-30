package src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import src.models.Empregado;
import src.models.Empresa;
import src.service.MyOwnLists;
import src.service.meuComparador;

public class App {
    public static void main(String[] args) {

        init();
    }

    private static void init() {
        List<Empregado> empregados = criaListaEmpregado();
        List<Empresa> empresas = criaListaEmpresas();

        List<Empregado> empregadosList = MyOwnLists.asListSorted(empregados, new meuComparador<Empregado>());
        printList(empregadosList);

        System.out.println("\n");

        List<Empresa> empresasList = MyOwnLists.asListSorted(empresas, new meuComparador<Empresa>());
        printList(empresasList);
    }

    public static void printList(List<?> lista) {
        for (Object item : lista) {
            System.out.println(item);
        }
    }

    public static List<Empregado> criaListaEmpregado() {

        List<Empregado> empregados = new ArrayList<>();

        Empregado empregado1 = new Empregado("Ziraldo", "45612378966", LocalDate.parse("2000-01-01"));
        Empregado empregado2 = new Empregado("Walter", "01425836977", LocalDate.parse("2012-01-10"));
        Empregado empregado3 = new Empregado("Renato", "65498712344", LocalDate.parse("2000-01-02"));
        Empregado empregado4 = new Empregado("Bento", "45698712366", LocalDate.parse("1998-05-05"));

        empregados.add(empregado1);
        empregados.add(empregado2);
        empregados.add(empregado3);
        empregados.add(empregado4);

        return empregados;
    }

    public static List<Empresa> criaListaEmpresas() {

        List<Empresa> empresas = new ArrayList<>();

        Empresa empresa1 = new Empresa("Amazon - AWS", "000000000000191", LocalDate.parse("1994-07-05"));
        Empresa empresa2 = new Empresa("Google Cloud Platform", "60746948000112", LocalDate.parse("2008-06-01"));
        Empresa empresa3 = new Empresa("Microsoft Azure", "60872504000123", LocalDate.parse("2010-02-01"));
        Empresa empresa4 = new Empresa("Banco do Brasil", "90400888000142", LocalDate.parse("1808-10-12"));

        empresas.add(empresa1);
        empresas.add(empresa2);
        empresas.add(empresa3);
        empresas.add(empresa4);

        return empresas;
    }

}