package Questao02Pagamento;

public class PagamentoPix implements Pagamento {

    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    private boolean isTelefoneValido(String s) {
        if (s == null) return false;
        for (char c : s.toCharArray()) if (!Character.isDigit(c)) return false;
        return s.length() >= 9;
    }

    @Override
    public String processarPagamento(double valor) {
        boolean emailLike = (chavePix != null && chavePix.contains("@"));
        boolean telefoneLike = isTelefoneValido(chavePix);

        if (emailLike || telefoneLike) {
            return "Pagamento de R$" + valor + " aprovado via PIX (" + chavePix + ").";
        } else {
            return "Erro: chave PIX inválida.";
        }
    }
}