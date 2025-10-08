package Pasta1;

public class PagamentoCartaoCredito implements Modal {

    private String numeroCartao;

    public PagamentoCartaoCredito (String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public String processarPagamento (double valor) {
        if (numeroCartao.length() == 16) {
            return "Pagamento de R$" + valor + " aprovado no Cartão de Crédito.";
        } else {
            return "Erro: número de cartão inválido.";
        }
    }
    
}
