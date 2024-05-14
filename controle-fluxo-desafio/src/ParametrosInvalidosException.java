public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }


    static String ValidarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        return "Parâmetros válidos";
    }
}
