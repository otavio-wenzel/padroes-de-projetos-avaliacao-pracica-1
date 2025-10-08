package Pasta1;

public class FactoryPayPal extends PagamentoFactory {

    private String email;

    public FactoryPayPal (String email) {
        this.email = email;
    }

    @Override
    public Modal criarPagamento() {
        return new PagamentoPayPal(email);
    }
    
}
