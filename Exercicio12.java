public class Exercicio12 {

    // Elabore um programa que leia um vetor de 12 elementos apresente na tela o
    // produto dos elementos pares positivos (desconsiderar o zero).
    // Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840

    public static void run() {
        int[] c = new int[12];
        int produto = 1;
        Prompt.imprimir("------ CONJUNTO ------");
        for (int i = 0; i < 12; i++) {
            c[i] = Prompt.lerInteiro("Insira um número para o conjunto: ");
        }
        for (int i = 0; i < 12; i++) {
            if (c[i] > 0 && c[i] % 2 == 0) produto *= c[i];
        }
        Prompt.imprimir("Produto: " + produto);
    }
}