import java.util.Arrays;

public class Exercicio08 {

    // Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a
    // concatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementos
    // de B.

    public static void run() {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];
        Prompt.imprimir("------ CONJUNTO A ------");
        for (int i = 0; i < 5; i++) {
            a[i] = Prompt.lerInteiro("Insira um número para o conjunto A: ");
        }
        Prompt.imprimir("\n------ CONJUNTO B ------");
        for (int i = 0; i < 5; i++) {
            b[i] = Prompt.lerInteiro("Insira um número para o conjunto B: ");
        }
        Prompt.imprimir("\n------ CONJUNTO C ------");
        System.arraycopy(a, 0, c, 0, 5);
        System.arraycopy(b, 0, c, 5, 5);
        Prompt.imprimir(Arrays.toString(c).replace("[", "").replace("]", ""));
    }
}