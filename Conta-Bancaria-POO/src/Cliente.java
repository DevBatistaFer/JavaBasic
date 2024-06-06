public class Cliente extends Pessoa {
    private int codigoCliente;


    public Cliente(String nome, String cpf, String dateNascimento, int codigoCliente) {
        super(nome, cpf, dateNascimento);
        this.codigoCliente = codigoCliente;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Código do cliente: " + codigoCliente);
        super.exibirInfo();
    }
}
