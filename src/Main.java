import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner readingData = new Scanner(System.in);

        System.out.println("\n----------------------------------\n");
        System.out.println("##### BANCO HORIZONTE #####");

        System.out.println("\nBoas-vindas! \nPara começar, digite o seu nome: ");
        String nomeDoCliente = readingData.nextLine();

        System.out.println("Agora digite o tipo da sua conta:");
        String tipoDeConta = readingData.nextLine();

        System.out.println("Agora digite o saldo disponível na sua conta:");
        double saldo = readingData.nextDouble();

        System.out.println("\n**********************************************");
        System.out.println("Cliente: " + nomeDoCliente);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo inicial: R$" + String.format("%.2f", saldo));
        System.out.println("**********************************************");

        String menu = """
              \nMENU
              Digite sua opção:
              1 - Consultar saldo
              2 - Transferir valor
              3 - Receber valor
              4 - Sair
              """;

        int opcaoMenu = 0;
        while (opcaoMenu != 4) {
            System.out.println(menu);
            opcaoMenu = readingData.nextInt();

            if (opcaoMenu ==1)
                System.out.println("Saldo atualizado é: R$" + String.format("%.2f", saldo));

            else if (opcaoMenu == 2) {
                System.out.println("Valor a ser transferido:");
                double valorParaTransferir = readingData.nextDouble();
                if (valorParaTransferir > saldo) {
                    System.out.println("Não há saldo suficiente para realizar transferência!");
                } else {
                    saldo -= valorParaTransferir;
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Saldo atualizado: R$" + String.format("%.2f", saldo));
                }
            }

           else if (opcaoMenu == 3) {
                System.out.println("Valor a ser recebido:");
                double valorParaReceber = readingData.nextDouble();
                saldo += valorParaReceber;
                System.out.println("Tranferência recebida com sucesso!");
                System.out.println("Saldo atualizado: R$" + String.format("%.2f", saldo));
           }

           else if (opcaoMenu != 4) {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
