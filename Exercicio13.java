import java.util.Arrays;

public class Exercicio13 {

    // Elabore um algoritmo que receba um número n e retorne um vetor com os n
    // primeiros termos da sequência de Fibonacci.
    // Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8, 13, 21}.

    public static void run() {
        int n = 0;
        n = Prompt.lerInteiro("Digite um número n");
        long fib[] = new long[n];
        fib[0] = 1;
        if (n > 2) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        Prompt.imprimir("------ FIBONACCI ------");
        Prompt.imprimir(Arrays.toString(fib).replace("[", "").replace("]", ""));
    }
}