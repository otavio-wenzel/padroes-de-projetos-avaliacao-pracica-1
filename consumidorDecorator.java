package decorator;

// Consumidor do Decorator — no mesmo formato do professor
public class consumidorDecorator {
    public static void main(String[] args) {

        // Relatório básico
        iRelatorio relatorio = new RelatorioBasico();
        System.out.println("Descrição: " + relatorio.Descricao());
        System.out.println("Custo: R$" + relatorio.Custo());

        // Adicionando estatísticas
        relatorio = new EstatisticasDecorator(relatorio);
        System.out.println("\nDescrição: " + relatorio.Descricao());
        System.out.println("Custo: R$" + relatorio.Custo());

        // Adicionando gráficos
        relatorio = new GraficoDecorator(relatorio);
        System.out.println("\nDescrição: " + relatorio.Descricao());
        System.out.println("Custo: R$" + relatorio.Custo());

        // Adicionando exportação PDF
        relatorio = new PdfDecorator(relatorio);
        System.out.println("\nDescrição: " + relatorio.Descricao());
        System.out.println("Custo: R$" + relatorio.Custo());
    }
}
