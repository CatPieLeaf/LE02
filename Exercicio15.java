import java.util.Arrays;

public class Exercicio15 {

    // Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de
    // acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar
    // um número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximo
    // valor lido só poderá ser maior que 5.

    public static void run() {
        int[] c = new int[5];
        Prompt.imprimir("------ CONJUNTO ------");
        for (int i = 0; i < 5; i++) {
            int num = Prompt.lerInteiro("Insira um número para o conjunto: ");
            if (i > 0) {
                if (num > c[i-1]) {
                    c[i] = num;
                } else {
                    Prompt.imprimir("O número deve ser maior que o anterior!");
                    i--;
                }
            } else {
                c[i] = num;
            }
        }
        Prompt.imprimir("\n------ CONJUNTO ------");
        Prompt.imprimir(Arrays.toString(c).replace("[", "").replace("]", ""));
    }
}