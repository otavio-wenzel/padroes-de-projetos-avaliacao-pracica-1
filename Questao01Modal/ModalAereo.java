package Questao01Modal;

public class ModalAereo implements Modal {

    private double precoPorKg;

    public ModalAereo(double precoPorKg) {
        this.precoPorKg = precoPorKg;
    }

    @Override
    public double calcularTarifa(double valorBase) {
        if (valorBase < 0) throw new IllegalArgumentException("Peso inválido.");
        return precoPorKg * valorBase;
    }
}