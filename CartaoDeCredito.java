public class CartaoDeCredito extends Pagamento {
    private String numeroDoCartao;

    public CartaoDeCredito(){
        super();
        numeroDoCartao = 824224220;
    }
    public CartaoDeCredito(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCartao){
        super(nomeDoPagador, cpf, valorASerPago);
        setNumeroDoCartao(numeroDoCartao);
        

    }
    public void setNumeroDoCartao (String numeroDoCartao){
        this.numeroDoCartao = numeroDoCartao;
    }
    public String getNumeroDoCartao(){
        return numeroDoCartao;
    }
}