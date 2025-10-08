package Questao01Modal;
/**
 * MAIN (teste) — injeta fábricas concretas no serviço, sem condicionais.
 *
 * JUSTIFICATIVA (resumo para correção):
 * - Interface Transporte = contrato genérico.
 * - FabricanteTransporte (abstrata) define o Factory Method (criarTransporte).
 * - TarifaService consome a FÁBRICA e usa o PRODUTO sem conhecer a classe concreta.
 * - Cada Transporte concreto aplica sua REGRA ESPECÍFICA de cálculo.
 * Benefícios: baixo acoplamento, extensão fácil (Open/Closed) e polimorfismo claro.
 */
public class Main {
    public static void main(String[] args) {
        TarifaService service = new TarifaService();

        // TERRESTRE — valor = distância em KM
        double r1 = service.calcularTarifa(new FactoryTerrestre(), 150.0);
        System.out.printf("TERRESTRE (150 km): R$ %.2f%n", r1);

        // AÉREO — valor = peso em KG
        double r2 = service.calcularTarifa(new FabricanteAerea(), 18.0);
        System.out.printf("AÉREO (18 kg): R$ %.2f%n", r2);

        // MARÍTIMO — valor = volume em M³
        double r3 = service.calcularTarifa(new FabricanteMaritima(), 12.0);
        System.out.printf("MARÍTIMO (12 m³): R$ %.2f%n", r3);

        // Mais exemplos no mesmo formato do professor (repetindo chamadas):
        double r4 = service.calcularTarifa(new FabricanteTerrestre(), 200.0);
        System.out.printf("TERRESTRE (200 km): R$ %.2f%n", r4);

        double r5 = service.calcularTarifa(new FabricanteAerea(), 25.0);
        System.out.printf("AÉREO (25 kg): R$ %.2f%n", r5);

        double r6 = service.calcularTarifa(new FabricanteMaritima(), 20.0);
        System.out.printf("MARÍTIMO (20 m³): R$ %.2f%n", r6);
    }
}
