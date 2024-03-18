public class Exercicio01 {

    // Construa um programa que leia em um vetor uma sequência de 5 números digitados
    // pelo usuário, calcule a média destes valores em um outro vetor, e depois apresente
    // na tela quais valores que são menores, iguais ou superiores à média

    public static void run() {
        int[] nums = new int[5];
        int media = 0;
        int[] diff = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Prompt.lerInteiro("Insira um número:");
            media += nums[i];
        }
        media = media / 5;
        Prompt.imprimir("\nMédia Aritmética: " + media + "\n");
        for (int i = 0; i < 5; i++) {
            diff[i] = nums[i] - media;
            if (diff[i] < 0) Prompt.imprimir("Valor: " + nums[i] + ", Inferior à média, Diferença: " + diff[i]);
            if (diff[i] == 0) Prompt.imprimir("Valor: " + nums[i] + ", Igual à média, Diferença: " + diff[i]);
            if (diff[i] > 0) Prompt.imprimir("Valor: " + nums[i] + ", Superior à média, Diferença: " + diff[i]);
        }
    }
}