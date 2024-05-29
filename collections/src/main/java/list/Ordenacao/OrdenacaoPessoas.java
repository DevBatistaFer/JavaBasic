package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;

   

    public OrdenacaoPessoas() {
    this.pessoasList = new ArrayList<>();
    }

public void adicionarPessoa(String nome, int idade, double altura){
    pessoasList.add(new Pessoa(nome, idade, altura));
}

public List<Pessoa> ordenarPorIdade(){

    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;


}


public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAtura());

    return pessoasPorAltura;
}

public static void main(String[] args) {
    // Criando uma instância da classe OrdenacaoPessoas
      OrdenacaoPessoas ordenacaPessoa = new OrdenacaoPessoas();
  
      // Adicionando pessoas à lista
      ordenacaPessoa.adicionarPessoa("Alice", 20, 1.56);
      ordenacaPessoa.adicionarPessoa("Bob", 30, 1.80);
      ordenacaPessoa.adicionarPessoa("Charlie", 25, 1.70);
      ordenacaPessoa.adicionarPessoa("David", 17, 1.56);
  
      // Exibindo a lista de pessoas adicionadas
      System.out.println(ordenacaPessoa.pessoasList);
  
      // Ordenando e exibindo por idade
      System.out.println(ordenacaPessoa.ordenarPorIdade());
  
      // Ordenando e exibindo por altura
      System.out.println(ordenacaPessoa.ordenarPorAltura());
    }
    
}
