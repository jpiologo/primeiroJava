import java.util.Scanner;

public class praticaJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ex1:
        double nota1 = 8.0;
        double nota2 = 10.0;

        double soma = nota1 + nota2;

        double media = soma / 2;

        System.out.println(media);

        //ex2:
        double n1 = 7.3;
        int n2 = (int) n1;
        System.out.println("Casting de double para int: " + n2);

        //ex4:
        double precoProduto = 4.50;
        int quantidade = 6;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total: " + valorTotal);

        //ex5:
        double valorEmDolares = 30.80;
        double valorEmReais = valorEmDolares * 4.94;
        String conversao = """
                Valor em Dólares: %.2f
                Valor em Reais: %.2f
                """.formatted(valorEmDolares, valorEmReais);

        System.out.println(conversao);

        //ex6:
        double precoDoProduto = 180.00;
        double percentDesconto = 10;
        String percent = "%";

        double desconto = precoDoProduto * (percentDesconto/100);

        double valorFinal = precoDoProduto - desconto;

        String mensagem = """
                Valor do Produto: %f
                Desconto: %.0f%s
                Valor do desconto: %f
                Valor final (com desconto aplicado): %f
                """.formatted(precoDoProduto, percentDesconto, percent, desconto, valorFinal);
        System.out.println(mensagem);

        //Exercicios Módulo 03:
        //ex1:
        System.out.println("Digite um número: ");
        int numUser = scanner.nextInt();
        if (numUser < 0) {
            System.out.println("Negativo!");
        } else {
            System.out.println("Positivo!");
        }

        //ex2:
        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Iguais");
        }
        else if (num1 > num2) {
            System.out.println("Diferentes e o primeiro número é maior");
        }
        else {
            System.out.println("Diferentes e o segundo número é maior");
        }

        //ex3:
        String msg = """
                ***MENU***
                1 - Calcular área do quadrado
                2 - Calcular área do círculo
                """;
        System.out.println(msg);
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Informe o comprimento do lado: ");
                double ladoQuadrado = scanner.nextDouble();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.println(String.format("A área do quadrado é de %.2f m2", areaQuadrado));
                break;
            case 2:
                System.out.println("Informe o valor de r: ");
                double raio = scanner.nextDouble();
                double pi = Math.PI;
                double areaCirculo = pi * Math.pow(raio, 2);
                System.out.println(String.format("A área do círculo é de %.2f m2", areaCirculo));
                break;
            default:
                System.out.println("Digite uma das opções");
        }

        //ex4:
        System.out.println("Escolha um número: ");
        int numTabuada = scanner.nextInt();

        for(int i = 1; i <= numTabuada; i++) {
            int multiplicacao = numTabuada * i;
            System.out.println(String.format("%d * %d = %d", numTabuada, i, multiplicacao));
        }

        //ex5:
        System.out.println("Digite um número inteiro: ");
        int intNum = scanner.nextInt();
        int resto = intNum % 2;

        if (resto == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Ímpar!");
        }

        System.out.println("Informe um número para calcular o fatorial: ");
        int numFatorial = scanner.nextInt();

        long produto = 1;

        for (int i = 1; i<=numFatorial; i++) {
            produto *= i;
        }

        System.out.println("O fatorial de " + numFatorial + " é: " + produto);
    }
}
