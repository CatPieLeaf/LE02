import java.util.Arrays;

public class Exercicio14 {

    // Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione
    // o maior elemento na última posição do vetor. Nenhum número do vetor pode ser
    // apagado ou duplicado. Apresente o vetor atualizado na tela.

    public static void run() {
        int[] a = new int[5];
        int highest = 0;
        int indexhigh = 0;
        Prompt.imprimir("------ CONJUNTO ------");
        for (int i = 0; i < 5; i++) {
            a[i] = Prompt.lerInteiro("Insira um número para o conjunto: ");
            if (i > 0) if (a[i] > a[i-1]) {
                highest = a[i];
                indexhigh = i;
            }
        }
        for (int i = indexhigh; i < 4; i++) {
            a[i] = a[i+1];
        }
        a[4] = highest;
        Prompt.imprimir("------ CONJUNTO ALTERADO ------");
        Prompt.imprimir(Arrays.toString(a).replace("[", "").replace("]", ""));
    }
}