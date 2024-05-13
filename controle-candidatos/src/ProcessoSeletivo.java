import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("********** PROCESSO SELETIVO **********");
        System.out.println();

        Scanner reader = new Scanner(System.in);

        System.out.print("Digite o salário pretendido R$");
        double salario = reader.nextDouble();

        analisarCandidato(salario);
        
        reader.close();

    }

    static void analisarCandidato(double salarioPretendido){

        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretendido){

            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        }
        else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
