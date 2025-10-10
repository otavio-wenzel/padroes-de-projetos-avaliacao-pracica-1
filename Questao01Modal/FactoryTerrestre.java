package Questao01Modal;

public class FactoryTerrestre extends ModalFactory {

    private double precoPorKm;

    public FactoryTerrestre(double precoPorKm) {
        this.precoPorKm = precoPorKm;
    }

    @Override
    public Modal criarModal() {
        return new ModalTerrestre(precoPorKm);
    }
}