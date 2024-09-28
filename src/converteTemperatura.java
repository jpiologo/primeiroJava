public class converteTemperatura {
    public static void main(String[] args) {
        int tempEmCelcius = 16;

        int tempEmFarenheit = (int) (tempEmCelcius * 1.8 + 32);

        String conversao = """
                Temperatura em Celcius: %d
                Temperatura em Farenheit: %d
                """.formatted(tempEmCelcius,tempEmFarenheit);

        System.out.println(conversao);
    }
}
