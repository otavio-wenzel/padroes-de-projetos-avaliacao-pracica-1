package Questao04;

// Decorador abstrato — segue o padrão condimentDecorator
public abstract class RelatorioDecorator implements iRelatorio {

    protected iRelatorio relatorio;

    public RelatorioDecorator(iRelatorio relatorio) {
        this.relatorio = relatorio;
    }
}
