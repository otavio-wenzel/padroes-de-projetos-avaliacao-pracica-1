package Questao01Modal;

public class TarifaService {

    public double calcularTarifa(ModalFactory factory, double valorBase) {
        Modal modal = factory.criarModal();
        return modal.calcularTarifa(valorBase);
    }
}