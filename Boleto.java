public class Boleto extends Pagamento{
    private String numeroDoBoleto;
    private int dia;
    private int mes;
    private int ano;

    public Boleto(){
        super();
        numeroDoBoleto = 8242242;
    }
    public Boleto(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoBoleto, int dia, int mes, int ano){
        super(nomeDoPagador, cpf, valorASerPago);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        setNumeroDoBoleto(numeroDoBoleto);

    }
    public void setNumeroDoBoleto (String numeroDoBoleto){
        this.numeroDoBoleto = numeroDoBoleto;
    }
    public String getNumeroDoBoleto(){
        return numeroDoBoleto;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public void setDia (int dia){
        this.dia = dia;
    }
    public void setMes (int mes){
        this.mes = mes;
    }
    public void setAno (int ano){
        this.ano = ano;
    }
}
