import java.util.Scanner;

public class mainContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        String numeroConta = sc.nextLine();

        System.out.println("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.println("Digite o saldo atual: ");
        double saldoInicial = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, titular, saldoInicial);

        int opcao;

        do {
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;

                case 3:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
    

