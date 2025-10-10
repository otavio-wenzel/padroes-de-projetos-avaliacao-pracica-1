package Questao02;

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
