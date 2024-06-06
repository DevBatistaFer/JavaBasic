

public class Main {
    public static void main(String[] args) {

        Cliente FERNANDO = new Cliente("Fernando", "437.252.645-32", "20/08/1998", 1);
        Cliente JOAO = new Cliente("João", "123.456.789-00", "15/03/1985", 2);

        Banco banco = new Banco();

        Conta cc = new ContaCorrente(FERNANDO);
        Conta pp = new ContaPoupança(JOAO);

        banco.adicionarConta(cc);
        banco.adicionarConta(pp);


        cc.depositar(100);
        cc.imprimirExtrato();
        cc.transferir(100, pp);

        banco.getContas().forEach(Conta::imprimirExtrato);

    }
}