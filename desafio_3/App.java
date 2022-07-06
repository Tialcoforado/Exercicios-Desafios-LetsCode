package desafio_3;

// Enunciado
// Una dois arrays de inteiros em um unico array
// Regras:
//     Nao é permitido uso de Collections ou java.util.Arrays
//     Nao é permitido uso de arrays temporários, com exceçao do arrayConsolidado
// Ex.: ENTRADA
//     [1, 3, 5, 7]
//     [2, 4, 6, 8, 12, 15]
// SAIDA
//     [1, 2, 3, 4, 5, 6, 7, 8, 12, 15]


public class App{
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 12, 15};
        int[] arrayConsolidado = juntarArrays(array1, array2);

        for (int i = 0; i < arrayConsolidado.length; i++){
            System.out.print(" " + arrayConsolidado[i]);
        }
    }

    public static int[] juntarArrays(int[] array1, int[] array2) {
        int[] arrayConsolidado = new int[array1.length + array2.length];
        int k = 0;
        for (int i = 0; i < array1.length; i++){
            arrayConsolidado[k++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++){
            arrayConsolidado[k++] = array2[i];
        }
        return arrayConsolidado;
    }
}