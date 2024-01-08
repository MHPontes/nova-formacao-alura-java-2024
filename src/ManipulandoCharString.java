public class ManipulandoCharString {
    public static void main(String[] args) {
        char letra = 'A';
        String palavra = "String";

        String mensagem = String.format("A concatenacao ficou como %c e %s ", letra, palavra);

        System.out.println(mensagem);
    }
}
