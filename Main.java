package Questao02;

public class Main {

    public static void main(String[] args) {

        PagamentoService service = new PagamentoService();

        // CARTÃO — válido (16 dígitos)
        service.processarPagamento(new FactoryCartaoCredito("1223334444555556"), 150.00);

        // CARTÃO — inválido
        service.processarPagamento(new FactoryCartaoCredito("1234"), 200);

        // BOLETO — válido (47 ou 48)
        service.processarPagamento(new FactoryBoleto("23793881286000000012345678901234567890123456789"), 175.50); // 47
        service.processarPagamento(new FactoryBoleto("341998765432100000012345678901234567890123456789"), 199.90); // 48

        // BOLETO — inválido
        service.processarPagamento(new FactoryBoleto("123"), 120.00);

        // PIX — e-mail (válido)
        service.processarPagamento(new FactoryPix("pagador@empresa.com"), 89.99);

        // PIX — telefone numérico com 9+ dígitos (válido)
        service.processarPagamento(new FactoryPix("11987654321"), 42.00);

        // PIX — inválido
        service.processarPagamento(new FactoryPix("chave_invalida"), 50.00);
    }
}
