
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {

        // Array com a lista de candidatos

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        String[] candidatosSelecionados = new String[0];

        System.out.println("********** PROCESSO SELETIVO **********");
        System.out.println();

        for(String candidato : candidatos){
            double salarioPretendido = valorPretendido();
            System.out.println(String.format("%s quer receber R$%.2f" , candidato,salarioPretendido ));
            candidatosSelecionados = analisarCandidato(salarioPretendido, candidato, candidatosSelecionados);
        }

        
        System.err.println();  
        System.err.println("SELECIONADOS");      

        for (String selecionado : candidatosSelecionados) {
            
            System.out.println(selecionado);
            entrandoEmContato(selecionado);
            System.out.println();
        }

    }

    static String[] adicionarCandidato(String[] array, String candidato){

        String[] novoArray = new String[array.length + 1];
        System.arraycopy(array, 0, novoArray, 0, array.length);
        novoArray[array.length] = candidato;
        return novoArray;
       
    }

    static String[] analisarCandidato(double salarioPretendido, String candidato, String[] candidatosSelecionados){

        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println(String.format("%s foi selecionado" , candidato));
            System.out.println("RH: LIGAR PARA O CANDIDATO");
            candidatosSelecionados = adicionarCandidato(candidatosSelecionados, candidato);
            

        }
        else if (salarioBase == salarioPretendido){

            System.out.println("RH: LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        }
        else{
            System.out.println("RH: AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

        System.out.println();
        return candidatosSelecionados;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);

    }

    static boolean atender() {

      
		int valor = new Random().nextInt(3); // Gera um número aleatório entre 0 e 2
        boolean resultado = valor == 1; // Converte o valor para um booleano (true se for igual a 1, false caso contrário)
        return resultado;	
        
	}

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
		boolean continuarTentando = true;
        boolean atendeu=false;
        do {

            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }
            else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
	}
	
}


        


