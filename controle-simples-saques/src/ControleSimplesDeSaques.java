import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        double saque = 0;

// TODO: Crie um loop 'for' para iterar sobre os saques:

        for (int i = 0; limiteDiario >= saque;i++) {

            saque = scanner.nextDouble();
            limiteDiario = limiteDiario - saque;
            if(saque == 0){
                System.out.println("Transacoes encerradas.");
                break;
            }
            
           

            if ( limiteDiario >= saque){

                System.out.println("Saque realizado. Limite restante: " +limiteDiario);   
                
            }
           
            else{
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            }
            
        }
       


        

// TODO: Solicite ao usuário o valor do saque:
           

// TODO: Verifique se o valor do saque é zero, encerrando as transações:
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;

           
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            

// TODO: Informe que o saque foi realizado e mostre o limite restante:
              
          
// Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}