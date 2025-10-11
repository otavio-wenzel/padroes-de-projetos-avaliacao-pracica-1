package Questao01Modal;

public class ModalMaritimo implements Modal {

    private double precoPorM3;

    public ModalMaritimo(double precoPorM3) {
        this.precoPorM3 = precoPorM3;
    }

    @Override
    public double calcularTarifa(double valorBase) {
        if (valorBase < 0) throw new IllegalArgumentException("Volume inválido.");
        return precoPorM3 * valorBase;
    }
}