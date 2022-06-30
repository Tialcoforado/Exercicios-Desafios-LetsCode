package exercíciosPrimeiraSemana;

public class Aplicacao {
    public static void main(String[] args) {
        // CriaImprimePessoa();
        // VelhoNovoMediaPOO();
        CalculadoraImcPoo();

    }

    private static void CalculadoraImcPoo() {
        Double[] IMC = new Double[5];

        PessoaCompleto fulano1 = new PessoaCompleto("Fulano", 20, 60.20, 1.78);
        PessoaCompleto fulano2 = new PessoaCompleto("Ciclano", 25, 98.40, 1.88);
        PessoaCompleto fulano3 = new PessoaCompleto("Jose", 19, 62.60, 1.68);
        PessoaCompleto fulano4 = new PessoaCompleto("Joao", 30, 50.80, 1.74);
        PessoaCompleto fulano5 = new PessoaCompleto("Maria", 20, 88.00, 1.72);

        PessoaCompleto[] listaDePessoas = new PessoaCompleto[5];
        listaDePessoas[0] = fulano1;
        listaDePessoas[1] = fulano2;
        listaDePessoas[2] = fulano3;
        listaDePessoas[3] = fulano4;
        listaDePessoas[4] = fulano5;

        for (int i = 0; i < listaDePessoas.length; i++) {
            IMC[i] = ((PessoaCompleto) listaDePessoas[i]).getPeso() / (((PessoaCompleto) listaDePessoas[i]).getAltura()
                    * ((PessoaCompleto) listaDePessoas[i]).getAltura());

            if (IMC[i] < 18.50) {
                System.out.printf("A pessoa identificada com o nome %s e IMC igual a %.2f está abaixo do peso \n",
                        ((PessoaCompleto) listaDePessoas[i]).getNome(), IMC[i]);
            }
            if (IMC[i] > 18.50 && IMC[i] < 25.00) {
                System.out.printf("A pessoa identificada com o nome %s e IMC igual a %.2f está dentro do peso ideal \n",
                        ((PessoaCompleto) listaDePessoas[i]).getNome(), IMC[i]);
            }
            if (IMC[i] > 25.00) {
                System.out.printf("A pessoa identificada com o nome %s e IMC igual a %.2f está acima do peso ideal \n",
                        ((PessoaCompleto) listaDePessoas[i]).getNome(), IMC[i]);
            }
        }
    }

    public static void VelhoNovoMediaPOO() {
        int idadeMaisNova = 99;
        String nomeDaPessoaMaisNova = "";
        int idadeMaisVelha = 0;
        String nomeDaPessoaMaisVelha = "";
        Integer somaDasIdades = 0;
        Integer mediaDasIdades = 0;

        Pessoa fulano1 = new Pessoa("Fulano", 20);
        Pessoa fulano2 = new Pessoa("Ciclano", 25);
        Pessoa fulano3 = new Pessoa("Jose", 19);
        Pessoa fulano4 = new Pessoa("Joao", 30);
        Pessoa fulano5 = new Pessoa("Maria", 20);

        Object[] listaDePessoas = new Object[5];
        listaDePessoas[0] = fulano1;
        listaDePessoas[1] = fulano2;
        listaDePessoas[2] = fulano3;
        listaDePessoas[3] = fulano4;
        listaDePessoas[4] = fulano5;

        for (int i = 0; i < listaDePessoas.length; i++) {

            somaDasIdades += ((Pessoa) listaDePessoas[i]).getIdade();

            if (((Pessoa) listaDePessoas[i]).getIdade() < idadeMaisNova) {
                idadeMaisNova = ((Pessoa) listaDePessoas[i]).getIdade();
                nomeDaPessoaMaisNova = ((Pessoa) listaDePessoas[i]).getNome();
            }
            if (((Pessoa) listaDePessoas[i]).getIdade() > idadeMaisVelha) {
                idadeMaisVelha = ((Pessoa) listaDePessoas[i]).getIdade();
                nomeDaPessoaMaisVelha = ((Pessoa) listaDePessoas[i]).getNome();
            }

        }

        mediaDasIdades = somaDasIdades / listaDePessoas.length;

        System.out.printf("A pessoa mais nova é %s e sua idade é: %d \n", nomeDaPessoaMaisNova, idadeMaisNova);
        System.out.printf("A pessoa mais velha é %s e sua idade é: %d \n", nomeDaPessoaMaisVelha, idadeMaisVelha);
        System.out.println("A média das idades apresentadas é igual a: " + mediaDasIdades);
    }

    private static void CriaImprimePessoa() {
        Pessoa tiago = new Pessoa("Tiago", 26);
        Pessoa catarina = new Pessoa("Catarina", 20);
        System.out.println(tiago);
        System.out.println(catarina);
    }
}
