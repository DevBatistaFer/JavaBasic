public class Pessoa {

    protected  String nome;
    protected String cpf;
    protected String dateNascimento;

    public Pessoa(String nome, String cpf, String dateNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dateNascimento = dateNascimento;
    }
    public void exibirInfo(){

        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dateNascimento);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDateNascimento() {
        return dateNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDateNascimento(String dateNascimento) {
        this.dateNascimento = dateNascimento;
    }
}
