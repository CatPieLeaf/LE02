public class Exercicio06 {

    // Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor
    // com 5 pesos e calcule a média ponderada do aluno.
    //
    //                       nota1 * peso1 + nota2 * peso2 + nota3 * peso3
    //  Média ponderada = ---------------------------------------------------
    //                                   peso1 + peso2 + peso3
    //
    // Ex.: notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4)

    public static void run() {
        double[] notas = new double[5];
        double[] pesos = new double[5];
        double numerador = 0;
        double denominador = 0;
        for (int i = 0; i < 5; i++) {
            notas[i] = Prompt.lerDecimal("Insira o valor da nota " + (i+1));
            pesos[i] = Prompt.lerDecimal("Insira o valor do peso " + (i+1));
            numerador += (notas[i] * pesos[i]);
            denominador += pesos[i];
        }
        double media = numerador / denominador;
        Prompt.imprimir("Média ponderada: " + media);
    }
}