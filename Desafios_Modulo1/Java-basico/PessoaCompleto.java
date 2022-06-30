package exercíciosPrimeiraSemana;

public class PessoaCompleto {

        private String nome;
        private Integer idade;
        private Double peso;
        private Double altura;
    
        public PessoaCompleto(String nome, Integer idade, Double peso, Double altura) {
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
    
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public Integer getIdade() {
            return idade;
        }
    
        public void setIdade(Integer idade) {
            this.idade = idade;
        }
    
        public Double getPeso() {
            return peso;
        }
    
        public void setPeso(Double peso) {
            this.peso = peso;
        }
    
        public Double getAltura() {
            return altura;
        }
    
        public void setAltura(Double altura) {
            this.altura = altura;
        }
    
        @Override
        public String toString() {
            return "Pessoa{" + "nome='" + this.nome + '\'' + ", idade=" + this.idade + "peso='" + this.peso + "altura='"
                    + this.altura + '}';
        }
}
