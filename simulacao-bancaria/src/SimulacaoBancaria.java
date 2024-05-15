import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 

            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
        
        switch (opcao) {
              
              case 1:
                  // System.out.print("Insira o valor que deseja depositar R$");
                  double valor = scanner.nextDouble();
                  saldo = saldo + valor;
                  System.out.println("Saldo atual: " +saldo);
                break;
              case 2:
                  
                  // System.out.print("Insira o valor que deseja sacar R$");
                  valor = scanner.nextDouble();
                
                  if(valor > saldo){
                    System.out.println("Saldo insuficiente.");
                  }
                  else{
                     saldo = saldo - valor;
                     System.out.println("Saldo atual: " +saldo);
                  }
                break;
              case 3: 
                  System.out.println("Saldo atual: " +saldo);
                break;
              case 0:
                System.out.println("Programa encerrado.");
                System.exit(0);
                break;
              
               // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:  
              default:
                    System.out.println("Opção inválida. Tente novamente."); 
         
            }
        }
    }
}