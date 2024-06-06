# Sistema Bancário Simples

Este é um projeto simples de um sistema bancário desenvolvido em Java. O sistema consiste em classes que representam pessoas, clientes, contas bancárias e um banco que armazena essas contas.

## Estrutura do Projeto

- `Pessoa`: Classe base que representa uma pessoa, contendo informações como nome, CPF e data de nascimento.
- `Cliente`: Subclasse de `Pessoa` que adiciona um código de cliente.
- `IConta`: Interface que define métodos básicos para operações bancárias como sacar, depositar, transferir e imprimir extrato.
- `Conta`: Implementação básica da interface `IConta`, representando uma conta bancária com número, agência, saldo e cliente associado.
- `ContaCorrente` e `ContaPoupança`: Subclasses de `Conta` que representam diferentes tipos de contas com métodos específicos para imprimir extrato.
- `Banco`: Classe que representa um banco e armazena uma lista de contas.

## Uso

O arquivo `Main.java` contém o código de exemplo de uso do sistema bancário. Ele cria clientes, contas corrente e poupança, as adiciona ao banco, realiza algumas operações como depósito, transferência e imprime os extratos das contas.

## Execução

Para executar o projeto, basta compilar e executar o arquivo `Main.java`.

```bash
javac Main.java
java Main
