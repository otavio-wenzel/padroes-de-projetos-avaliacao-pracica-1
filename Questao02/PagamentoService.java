package Questao02;

/**
 * Consumidora no exato padrão do professor:
 * recebe a fábrica, cria o produto por polimorfismo e processa o pagamento.
 */
public class PagamentoService {

    public void processarPagamento(PagamentoFactory factory, double valor) {
        Pagamento pagamento = factory.criarPagamento();
        String resultado = pagamento.processarPagamento(valor);
        System.out.println(resultado);
    }
}
