import java.util.Arrays;

public class Exercicio09 {

    // Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C
    // de acordo com as seguintes regras:
    //
    // a. Os elementos das posições pares de C são os elementos das posições pares de A;
    // b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;

    public static void run() {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        Prompt.imprimir("------ CONJUNTO A ------");
        for (int i = 0; i < 5; i++) {
            a[i] = Prompt.lerInteiro("Insira um número para o conjunto A: ");
        }
        Prompt.imprimir("\n------ CONJUNTO B ------");
        for (int i = 0; i < 5; i++) {
            b[i] = Prompt.lerInteiro("Insira um número para o conjunto B: ");
        }
        for (int i = 0; i < 5; i++) {
            int num = (i+1) % 2;
            if (num != 0) {
                c[i] = b[i];
            } else {
                c[i] = a[i];
            }
        }
        Prompt.imprimir("\n------ CONJUNTO C ------");
        Prompt.imprimir(Arrays.toString(c).replace("[", "").replace("]", ""));
    }
}