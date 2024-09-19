import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação do objeto Scanner para capturar os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação e captura dos dados via terminal
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        double saldo = 0.0;
        boolean saldoValido = false;

        // Solicitação e validação do saldo
        while (!saldoValido) {
            System.out.println("Por favor, digite o saldo da Conta (ex: 100.40):");
            String saldoInput = scanner.nextLine();
            try {
                saldo = Double.parseDouble(saldoInput.replace(',', '.')); // Substituir vírgula por ponto, se necessário
                saldoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Saldo inválido. Por favor, insira um valor numérico válido.");
            }
        }

        // Exibição da mensagem final com os dados inseridos
        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numeroConta, saldo);

        System.out.println(mensagem);

        // Fechando o Scanner
        scanner.close();
    }
}
