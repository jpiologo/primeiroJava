public class praticaJava {
    public static void main(String[] args) {
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


    }
}
