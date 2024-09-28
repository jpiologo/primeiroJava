public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDoLancamento = 2022;
        System.out.println("Ano do Lançamento: " + anoDoLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (1.8 + 1.3 + 1.0) / 3;
        System.out.println(String.format("Média de avaliação: %.1f", media));
        String sinopse = """
                         Filme de aventura com ator dos anos 80
                         """ + anoDoLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2); //conversão de tipo double para int (casting)
        System.out.println(classificacao);

    }
}
