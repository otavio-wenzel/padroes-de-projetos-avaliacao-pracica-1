package Questao01Modal;
/**
 * "Classe Consumidora" no padrão do professor:
 * recebe a FÁBRICA (polimórfica), obtém o PRODUTO e executa a operação.
 *
 * Observação: sem if/switch aqui; apenas polimorfismo.
 */
public class TarifaService {

    public void calcularTarifa(ModalFactory factory, double valorBase) {
        Modal modal = factory.criarModal(); // polimorfismo puro
        double retorno = modal.calcularTarifa(valorBase);
        //System.out.println(retorno);
    }
}

