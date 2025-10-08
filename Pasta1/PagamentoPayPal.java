package Pasta1;

public class PagamentoPayPal implements Modal {

    private String email;

    public PagamentoPayPal (String email) {
        this.email = email;
    }

    @Override
    public String processarPagamento (double valor) {
        if (email != null && email.contains("@")) {
            return "Pagamento de R$" + valor + " aprovado via PayPal (" + email + ")";
        } else {
            return "Erro: e-mail inválido.";
        }
    }
    
}