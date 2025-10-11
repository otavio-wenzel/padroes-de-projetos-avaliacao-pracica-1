package Questao01Modal;

public class ModalTerrestre implements Modal {

    private double precoPorKm;

    public ModalTerrestre(double precoPorKm) {
        this.precoPorKm = precoPorKm;
    }

    @Override
    public double calcularTarifa(double valorBase) {
        if (valorBase < 0) throw new IllegalArgumentException("Distância inválida.");
        return precoPorKm * valorBase;
    }
}