import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o número da conta: ");
            int numero = scanner.nextInt();

            System.out.println("Digite o número da Agência: ");
            int agencia = scanner.nextInt();

            System.out.println("Digite seu nome completo: ");
            String nomeCliente = scanner.next();

            System.out.println("Digite o valor do seu saldo: ");
            double saldo = scanner.nextDouble();
        
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}