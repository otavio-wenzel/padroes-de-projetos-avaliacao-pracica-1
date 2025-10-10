package Questao01Modal;

public class FactoryAereo extends ModalFactory {

    private double precoPorKg;

    public FactoryAereo(double precoPorKg) {
        this.precoPorKg = precoPorKg;
    }

    @Override
    public Modal criarModal() {
        return new ModalAereo(precoPorKg);
    }
}