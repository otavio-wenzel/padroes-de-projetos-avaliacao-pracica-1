package Questao04Relatorio;

public class EstatisticasDecorator extends RelatorioDecorator {

    public EstatisticasDecorator(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String Descricao() {
        return relatorio.Descricao() + ", com estatísticas de faturamento";
    }

    @Override
    public double Custo() {
        return relatorio.Custo() + 5.0;
    }
}