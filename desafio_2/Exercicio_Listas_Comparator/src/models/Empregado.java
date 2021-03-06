package desafio_2.Exercicio_Listas_Comparator.src.models;


import java.time.LocalDate;

public class Empregado {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public Empregado(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Empregado [nome='" + nome + "', cpf='" + cpf + "', dataNascimeto='" + dataNascimento + "']";
    }

}
