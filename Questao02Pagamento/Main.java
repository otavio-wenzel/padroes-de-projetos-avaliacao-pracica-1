package Questao02Pagamento;

public class Main {

    public static void main(String[] args) {

        PagamentoService service = new PagamentoService();

        service.processarPagamento(new FactoryCartaoCredito("1223334444555556"), 150.00);

        service.processarPagamento(new FactoryCartaoCredito("1234"), 200);

        service.processarPagamento(new FactoryBoleto("23793881286000000012345678901234567890123456789"), 175.50); // 47
        service.processarPagamento(new FactoryBoleto("341998765432100000012345678901234567890123456789"), 199.90); // 48

        service.processarPagamento(new FactoryBoleto("123"), 120.00);

        service.processarPagamento(new FactoryPix("pagador@empresa.com"), 89.99);

        service.processarPagamento(new FactoryPix("11987654321"), 42.00);

        service.processarPagamento(new FactoryPix("chave_invalida"), 50.00);
    }
}