package Questao02;

/**
 * Boleto (didático): código de barras com 47 ou 48 caracteres é considerado válido.
 */
public class PagamentoBoleto implements Pagamento {

    private String codigoBarras;

    public PagamentoBoleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String processarPagamento(double valor) {
        int len = (codigoBarras == null) ? 0 : codigoBarras.length();
        if (len == 47 || len == 48) {
            return "Pagamento de R$" + valor + " aprovado via Boleto.";
        } else {
            return "Erro: código de barras inválido.";
        }
    }
}
