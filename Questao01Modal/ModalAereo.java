package Questao01Modal;
/**
 * Produto concreto: AÉREO
 * Regra exemplo: tarifa = taxa base + (precoPorKg * pesoKg)
 */

public class ModalAereo implements Modal{

    //private double taxaBase = 25.00;
    private double precoPorKg = 3.40;

    public ModalAereo(double precoPorKg) {
        this.precoPorKg = precoPorKg;
    }

    @Override
    public double calcularTarifa(double valorBase) {
        if (valorBase < 0) throw new IllegalArgumentException("Peso inválido.");
        return precoPorKg * valorBase;
    }
    
}
