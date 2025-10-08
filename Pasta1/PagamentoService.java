package Pasta1;

public class PagamentoService {

    public void processarPagamento(PagamentoFactory factory, double valor) {
        Modal pagamento = factory.criarPagamento();
        String resultado = pagamento.processarPagamento(valor);
        System.out.println(resultado);
    }
    
}
