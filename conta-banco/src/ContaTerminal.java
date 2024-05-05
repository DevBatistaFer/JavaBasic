import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

       int numeroBanco;
       String agencia;
       String nomeCliente;
       double saldo;

       Scanner reader = new Scanner(System.in);

       System.out.print("Por favor, digite o número da Agência ");
       agencia = reader.nextLine();

       System.out.print("Por favor, digite o número do Banco: ");
       numeroBanco = reader.nextInt();
       reader.nextLine();

       System.out.print("Por favor, digite o seu Nome:  ");
       nomeCliente = reader.nextLine();

       System.out.print("Por favor, digite o seu Saldo:  ");
       saldo = reader.nextDouble();
       
       System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroBanco, saldo);

       reader.close();
    }
}
