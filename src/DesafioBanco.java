import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeCliente = "Mateus Pontes";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcaoEscolhida = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;


        while (opcaoEscolhida != 4) {
            System.out.println(menu);
            opcaoEscolhida = leitor.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcaoEscolhida == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitor.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcaoEscolhida == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitor.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcaoEscolhida != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
