package Questao02Pagamento;

public class FactoryBoleto extends PagamentoFactory {

    private String codigoBarras;

    public FactoryBoleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBoleto(codigoBarras);
    }
}