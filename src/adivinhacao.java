import java.util.Scanner;
import java.util.Random;

public class adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int chute = 0;
        int numDe = 0, numAte = 0;

        //Mensagem de Boas-Vindas ao jogo.
        String mensagem = """
                BEM-VINDO AO JOGO ADIVINITY!
                Um número secreto será gerado, você consegue adivinhar qual?
                ps: digite -1 para encerrar o jogo.
                """;
        System.out.println(mensagem);

        //Validação da entrada para o número inicial
        while (true) {
            System.out.println("Defina o número inicial: ");
            if (scanner.hasNextInt()) {
                numDe = scanner.nextInt();
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            }
        }

        //Validação da entrada para o número final
        while (true) {
            System.out.println("Defina o número final: ");
            if (scanner.hasNextInt()) {
                numAte = scanner.nextInt();
                if (numAte > numDe) {
                    break;
                } else {
                    System.out.println("O número final deve ser maior que o número inicial.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            }
        }

        //Geração do Número Secreto de acordo com a definição do usuário.
        int numeroSecreto = new Random().nextInt((numAte - numDe) + 1) + numDe;

        //Teste para validações.
        System.out.println(numeroSecreto);

        //Regras de funcionamento do jogo.
        while(tentativas < 5 && chute != -1) {
            System.out.println("Digite o número: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Valor inválido. Digite um número dentro do intervalo especificado:");
                scanner.next();
                System.out.println("Digite o número: ");
            }
            chute = scanner.nextInt();
            tentativas++;

            if (chute == numeroSecreto) {
                System.out.println(String.format("Parabéns! Você acertou o número secreto '%d'!", numeroSecreto));
                break;
            }
            else if (chute == -1) {
                System.out.println("*GAME OVER* Número de Tentativas: " + tentativas);
                break;
            }
            else if (chute < numeroSecreto && chute != -1){
                System.out.println("O número secreto é maior que seu chute!");
            }
            else {
                System.out.println("O número secreto é menor que seu chute!");
            }
        }
        if (tentativas == 5 && chute != numeroSecreto) {
            System.out.println("Você não conseguiu acertar dentro de 5 tentativas! :(");
        }
    }
}
