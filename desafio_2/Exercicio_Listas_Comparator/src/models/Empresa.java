package desafio_2.Exercicio_Listas_Comparator.src.models;

import java.time.LocalDate;

public class Empresa {
    private String nomeFantasia;
    private String cnpj;
    private LocalDate dataAbertura;

    public Empresa(String nomeFantasia, String cnpj, LocalDate dataAbertura) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.dataAbertura = dataAbertura;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public String toString() {
        return "Companhias [nomeFantasia='" + nomeFantasia + "', cnpj='" + cnpj + "', dataAbertura='" + dataAbertura
                + "']";
    }

}
