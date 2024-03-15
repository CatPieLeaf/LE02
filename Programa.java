public class Programa {
    public static void main(String[] args) {
        int selecionado = Prompt.lerInteiro("Digite o número do exercício a ser executado (1 - 15):");
        switch (selecionado) {
            case 1:
                Exercicio01.run();
                break;
            case 2:
                Exercicio02.run();
                break;
            case 3:
                Exercicio03.run();
                break;
            case 4:
                Exercicio04.run();
                break;
            case 5:
                Exercicio05.run();
                break;
            case 6:
                Exercicio06.run();
                break;
            case 7:
                Exercicio07.run();
                break;
            case 8:
                Exercicio08.run();
                break;
            case 9:
                Exercicio09.run();
                break;
            case 10:
                Exercicio10.run();
                break;
            case 11:
                Exercicio11.run();
                break;
            case 12:
                Exercicio12.run();
                break;
            case 13:
                Exercicio13.run();
                break;
            case 14:
                Exercicio14.run();
                break;
            case 15:
                Exercicio15.run();
                break;
            default:
              System.out.println("Selecione um exercício valido!");
              break;
        }
    }
}