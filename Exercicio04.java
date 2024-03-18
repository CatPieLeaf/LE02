import java.util.Arrays;

public class Exercicio04 {

    // Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma
    // variável de um número n qualquer, depois mostre na tela o índice dos elementos que
    // são inferiores a n.

    public static void run() {
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Prompt.lerInteiro("Digite um número para sua sequência: ");
        }
        Prompt.imprimir("Sua sequencia: " + Arrays.toString(nums).replace("[", "").replace("]", "") +  "\n");
        int n = Prompt.lerInteiro("Insira um número n: ");
        for (int i = 0; i < n; i++) {
            Prompt.imprimir("Indice: "+ i + "," + " Número: " + nums[i]);
        }
    }
}