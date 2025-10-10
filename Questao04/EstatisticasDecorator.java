package Questao04;

// Decorador concreto — adiciona estatísticas ao relatório
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
        return relatorio.Custo() + 5.0; // custo simbólico adicional
    }
}
