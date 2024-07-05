import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int numeroConta;
        //String agencia;
        //String nomeCliente;
        //float saldo;
        
        System.out.println("Conta Bancária");
        System.out.println();
        System.out.println("Por favor, digite o número da Conta: (1234)");
        String numeroConta = scanner.nextLine();
        System.out.println("Você digitou: " + numeroConta);
        
        System.out.println("Por favor, digite o número da sua Agência: (123-4)");
        String agencia  = scanner.next();
        scanner.nextLine();
        System.out.println("Você digitou: " + agencia);
        
        System.out.println("Por favor, digite o seu nome completo!");
        String nomeCliente = scanner.nextLine();
        System.out.println("Você digitou:  " + nomeCliente);

        System.out.print("Digite o valor do saldo:R$  ");
        double saldo = scanner.nextDouble();
        System.out.println("Você digitou:R$ " + saldo);

       System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+ " com conta de número: " +numeroConta+" e seu saldo R$" +saldo+ " já está disponível para saque \n");

       scanner.close();

    }

}
