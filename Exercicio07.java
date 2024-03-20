public class Exercicio07 {

    // Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles
    // são iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem
    // coincidir.

    public static void run() {
        int[] elementos1 = new int[5];
        int[] elementos2 = new int[5];
        boolean isEqual = true;
        Prompt.imprimir("------ CONJUNTO 1 ------");
        for (int i = 0; i < 5; i++) {
            elementos1[i] = Prompt.lerInteiro("Insira um número para o conjunto 1: ");
        }
        Prompt.imprimir("\n------ CONJUNTO 2 ------");
        for (int i = 0; i < 5; i++) {
            elementos2[i] = Prompt.lerInteiro("Insira um número para o conjunto 2: ");
        }
        for (int i = 0; i < 5; i++) {
            if (elementos1[i] != elementos2[i]) isEqual = false;
        }
        if (isEqual == true) {
            Prompt.imprimir("\nOs conjuntos sao exatamente iguais");
        } else {
            Prompt.imprimir("\nOs conjuntos sao diferentes");
        }
    }
}