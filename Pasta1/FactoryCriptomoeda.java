package Pasta1;

public class FactoryCriptomoeda extends PagamentoFactory {

    private double saldoCarteira;

    public FactoryCriptomoeda (double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    @Override
    public Modal criarPagamento() {
        return new PagamentoCriptomoeda(saldoCarteira);
    }
    
}
