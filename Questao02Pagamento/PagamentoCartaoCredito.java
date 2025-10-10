package Questao02Pagamento;

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