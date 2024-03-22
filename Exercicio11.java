public class Exercicio11 {

    // Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros
    // de tamanho igual a 5. 
    //
    // Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 + 8*9 = 140

    public static void run() {
        int[] a = new int[5];
        int[] b = new int[5];
        int produto = 0;
        Prompt.imprimir("------ CONJUNTO A ------");
        for (int i = 0; i < 5; i++) {
            a[i] = Prompt.lerInteiro("Insira um número para o conjunto A: ");
        }
        Prompt.imprimir("\n------ CONJUNTO B ------");
        for (int i = 0; i < 5; i++) {
            b[i] = Prompt.lerInteiro("Insira um número para o conjunto B: ");
        }
        for (int i = 0; i < 5; i++) {
            produto += a[i] * b[i];
        }
        Prompt.imprimir("Produto Escalar: " + produto);
    }
}