import java.util.Arrays;

public class Exercicio05 {

    // Elabore um programa que leia 5 números do teclado e os armazene em um vetor.
    // Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes
    // que o número n aparece no vetor

    public static void run() {
        int[] nums = new int[5];
        int ocorrencias = 0;
        for (int i = 0; i < 5; i++) {
            nums[i] = Prompt.lerInteiro("Digite um número para sua sequência: ");
        }
        Prompt.imprimir("Sua sequencia: " + Arrays.toString(nums).replace("[", "").replace("]", "") +  "\n");
        int n = Prompt.lerInteiro("Insira um número n: ");
        for (int i = 0; i < 5; i++) {
            if (nums[i] == n) ocorrencias++;
        }
        Prompt.imprimir("Ocorrências de n: " + ocorrencias);
    }
}