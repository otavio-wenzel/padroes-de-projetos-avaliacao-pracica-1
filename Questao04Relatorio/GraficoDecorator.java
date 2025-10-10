package Questao04Relatorio;

public class GraficoDecorator extends RelatorioDecorator {

    public GraficoDecorator(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String Descricao() {
        return relatorio.Descricao() + ", com gráficos ilustrativos";
    }

    @Override
    public double Custo() {
        return relatorio.Custo() + 7.5;
    }
}