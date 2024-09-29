import java.util.Scanner;
import java.util.Random;

public class adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 0;
        int chute = 0;
        String mensagem = """
                BEM-VINDO AO JOGO ADIVINITY!
                Um número secreto foi gerado, você consegue adivinhar qual?
                ps: digite -1 para encerrar o jogo.
                """;

        System.out.println(mensagem);

        while(tentativas < 5 || chute != -1) {
            System.out.println("Digite o número: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Valor inválido. Digite um número dentro do intervalo especificado:");
                scanner.next();
                System.out.println("Digite o número: ");
            }
            chute = scanner.nextInt();
            tentativas++;

            if (chute == numeroSecreto) {
                System.out.println(String.format("Parabéns! Você acertou o número secreto %d!", numeroSecreto));
                break;
            }
            else if (chute < numeroSecreto){
                System.out.println("O número secreto é maior que seu chute!");
            }
            else {
                System.out.println("O número secreto é menor que seu chute!");
            }
        }

        if (tentativas == 5) {
            System.out.println("Você não conseguiu acertar dentro de 5 tentativas! :(");
        }
        else if (chute == -1) {
            System.out.println("*GAME OVER*");
        }
    }
}
