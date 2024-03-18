import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio02 {

    // Escreva um algoritmo que leia em um vetor uma sequência finita de números
    // digitados pelo usuário e, logo após, mostre o número de cada posição do vetor e se
    // ele é positivo, negativo ou zero.

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
        for (int i = 0; i < ocorrencias.size(); i++) {
            String type = new String();
            if (Double.parseDouble(ocorrencias.get(i)) > 0) {
                type = "Positivo";
            } else if (Double.parseDouble(ocorrencias.get(i)) < 0) {
                type = "Negativo";
            } else {
                type = "Zero";
            }
            Prompt.imprimir("Posiçao: " + i + ", Numero: " + ocorrencias.get(i) + ", Tipo: " + type);
        }
    }
}