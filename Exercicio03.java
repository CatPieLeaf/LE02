import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio03 {

    // Faça um programa que leia em um vetor uma sequência finita de números digitados
    // pelo usuário. Crie um segundo vetor que armazene o dobro de cada número do
    // primeiro vetor e depois apresente os valores deste vetor.

    public static void run() {
        String seq = new String();
        seq = Prompt.lerLinha("Insira uma sequencia de números separados por espaços:");
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(seq);
        // -?\d+(\.\d+)?
        List<String> ocorrencias = new ArrayList<>();
        while (matcher.find()) {
            ocorrencias.add(matcher.group());
        }
        double[] dobro = new double[ocorrencias.size()]; 
        for (int i = 0; i < ocorrencias.size(); i++) {
            dobro[i] = (Double.parseDouble(ocorrencias.get(i))) * 2;
        }
        Prompt.imprimir(Arrays.toString(dobro).replace("[", "").replace("]", ""));
    }
}