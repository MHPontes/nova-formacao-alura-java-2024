public class CastingVariavel {
    public static void main(String[] args) {
        double numeroFlutuante = 0;
        int numeroInteiro = 0;

        numeroFlutuante = 10.5;
        numeroInteiro = 15;
        int numeroFlutuanteParaInteiro = (int) numeroFlutuante;

        String mensagem = String.format("Os numeros sao %d para double com cast e %d para o inteiro ", + numeroFlutuanteParaInteiro, numeroInteiro);

        System.out.println(mensagem);
    }
}
