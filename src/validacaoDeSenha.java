public class validacaoDeSenha {
    public static void main (String[] args) {
        String senha = "123456";
        if (senha.equals("12345")) {
            System.out.println("Senha validada!");
        } else {
            System.out.println("Senha Incorreta!");
        }

        String name = "João";
        int idade = 21;

        String mensagem = """
                          Olá, mundo!
                          Meu nome é %s.
                          Tenho %d anos.
                          E este é um Text Block.
                          Ele permite escrever textos com múltiplas linhas
                          sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                          """.formatted(name, idade);
        System.out.println(mensagem);
    }
}
