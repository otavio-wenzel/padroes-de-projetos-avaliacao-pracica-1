package Pasta1;

public class PagamentoCriptomoeda implements Modal {

    private double saldoCarteira;

    public PagamentoCriptomoeda (double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    @Override
    public String processarPagamento (double valor) {
        if (saldoCarteira >= valor) {
            saldoCarteira -= valor;
            return "Pagamento de R$" + valor + " aprovado via Criptomoeda. Saldo restante: " + saldoCarteira;
        } else {
            return "Erro: saldo insuficiente na carteira.";
        }
    }
    
}
