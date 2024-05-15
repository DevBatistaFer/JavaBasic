import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroConta = "";

        try {
            numeroConta = scanner.nextLine();
            // Chame o método verificarNumeroConta, passando o número da conta como argumento:
            verificarNumeroConta(numeroConta);
            // Se o método verificarNumeroConta não lançou exceção, significa que o número de conta é válido:
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // Captura e imprime a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        // Verifique se o número da conta tem exatamente 8 dígitos:
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
