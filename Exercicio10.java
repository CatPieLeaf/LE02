import java.util.Arrays;

public class Exercicio10 {

    // Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie
    // os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é o
    // último elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim
    // por diante.

    public static void run() {
        int[] a = new int[5];
        int[] b = new int[5];
        int j = 0;
        Prompt.imprimir("------ CONJUNTO A ------");
        for (int i = 0; i < 5; i++) {
            a[i] = Prompt.lerInteiro("Insira um número para o conjunto A: ");
        }
        Prompt.imprimir("\n------ CONJUNTO B ------");
        for (int i = 4; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }
        Prompt.imprimir(Arrays.toString(b).replace("[", "").replace("]", ""));
    }
}