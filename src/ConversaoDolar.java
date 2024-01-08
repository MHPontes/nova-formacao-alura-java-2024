public class ConversaoDolar {
    public static void main(String[] args) {
        double valorEmDolares = 5.0;
        double conversaoEmReal = 4.94 * valorEmDolares;

        String mensagem = String.format("A conversao do dolar para real: %.2f", conversaoEmReal);

        System.out.println(mensagem);
    }
}
