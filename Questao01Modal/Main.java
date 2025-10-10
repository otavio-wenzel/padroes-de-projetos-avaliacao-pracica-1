package Questao01Modal;

public class Main {
    public static void main(String[] args) {
        TarifaService service = new TarifaService();

        double precoKm = 1.20;
        double precoKg = 3.40;
        double precoM3 = 2.10;

        double r1 = service.calcularTarifa(new FactoryTerrestre(precoKm), 150.0);
        System.out.printf("TERRESTRE (150 km): R$ %.2f%n", r1);

        double r2 = service.calcularTarifa(new FactoryAereo(precoKg), 18.0);
        System.out.printf("AÉREO (18 kg): R$ %.2f%n", r2);

        double r3 = service.calcularTarifa(new FactoryMaritimo(precoM3), 12.0);
        System.out.printf("MARÍTIMO (12 m³): R$ %.2f%n", r3);

        double r4 = service.calcularTarifa(new FactoryTerrestre(precoKm), 200.0);
        System.out.printf("TERRESTRE (200 km): R$ %.2f%n", r4);

        double r5 = service.calcularTarifa(new FactoryAereo(precoKg), 25.0);
        System.out.printf("AÉREO (25 kg): R$ %.2f%n", r5);

        double r6 = service.calcularTarifa(new FactoryMaritimo(precoM3), 20.0);
        System.out.printf("MARÍTIMO (20 m³): R$ %.2f%n", r6);
    }
}