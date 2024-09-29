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
                """;

        System.out.println(mensagem);

        while(tentativas < 5) {
            System.out.println("Digite o número: ");
            chute = scanner.nextInt();
            tentativas++;

            if (chute == numeroSecreto) {
                System.out.println(String.format("Parabéns! Você acertou o número secreto %d!", chute));
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
    }
}
