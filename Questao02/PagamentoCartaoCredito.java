package Questao02;

/**
 * Exemplo didático no estilo do professor:
 * validação simples: número do cartão deve ter 16 dígitos.
 */
public class PagamentoCartaoCredito implements Pagamento {

    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public String processarPagamento(double valor) {
        if (numeroCartao != null && numeroCartao.length() == 16) {
            return "Pagamento de R$" + valor + " aprovado no Cartão de Crédito.";
        } else {
            return "Erro: número de cartão inválido.";
        }
    }
}
