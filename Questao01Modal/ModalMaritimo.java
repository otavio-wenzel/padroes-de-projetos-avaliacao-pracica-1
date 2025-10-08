package Questao01Modal;
/**
 * Produto concreto: MARÍTIMO
 * Regra exemplo: tarifa = taxa porto + (precoPorM3 * volumeM3)
 */
public class ModalMaritimo implements Modal {

    //private double taxaPorto = 60.00;
    private double precoPorM3 = 2.10;

    public ModalMaritimo(double precoPorM3) {
        this.precoPorM3 = precoPorM3;
    }

    @Override
    public double calcularTarifa(double valorBase) {
        if (valorBase < 0) throw new IllegalArgumentException("Volume inválido.");
        return precoPorM3 * valorBase;
    }
}
