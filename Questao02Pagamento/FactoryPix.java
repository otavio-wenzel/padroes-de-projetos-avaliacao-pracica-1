package Questao02Pagamento;

public class FactoryPix extends PagamentoFactory {

    private String chavePix;

    public FactoryPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix(chavePix);
    }
}