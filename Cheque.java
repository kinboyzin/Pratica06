public class Cheque extends Pagamento{
    private String numeroDoCheque;

    public Cheque(){
        super();
        numeroDoCheque = 220224824;
    }
    public Cheque(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCheque){
        super(nomeDoPagador, cpf, valorASerPago);
        setNumeroDoCheque(numeroDoCheque);

    }
    public void setNumeroDoCheque (String numeroDoCheque){
        this.numeroDoCheque = numeroDoCheque;
    }


    public String getNumeroDoCheque(){
        return numeroDoCheque;
    }
}

