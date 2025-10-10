package Questao04Relatorio;

public class consumidorDecorator {
    public static void main(String[] args) {

        iRelatorio relatorio = new RelatorioBasico();
        System.out.println("Descrição: " + relatorio.Descricao());
        System.out.println("Custo: R$" + relatorio.Custo());

        relatorio = new EstatisticasDecorator(relatorio);
        System.out.println("\nDescrição: " + relatorio.Descricao());
        System.out.println("Custo: R$" + relatorio.Custo());

        relatorio = new GraficoDecorator(relatorio);
        System.out.println("\nDescrição: " + relatorio.Descricao());
        System.out.println("Custo: R$" + relatorio.Custo());

        relatorio = new PdfDecorator(relatorio);
        System.out.println("\nDescrição: " + relatorio.Descricao());
        System.out.println("Custo: R$" + relatorio.Custo());
    }
}