package Questao01Modal;

public class ModalTerrestre implements Modal{

    private double precoPorKm = 1.20;

    public ModalTerrestre(double precoPorKm) {
        this.precoPorKm = precoPorKm;
    }

    @Override
    public double calcularTarifa(double valorBase) {
        if (valorBase < 0) throw new IllegalArgumentException("Volume inválido.");
        return precoPorKm * valorBase;
    }
    
}
