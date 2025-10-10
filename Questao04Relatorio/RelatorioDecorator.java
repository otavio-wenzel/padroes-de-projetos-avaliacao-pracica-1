package Questao04Relatorio;

public abstract class RelatorioDecorator implements iRelatorio {

    protected iRelatorio relatorio;

    public RelatorioDecorator(iRelatorio relatorio) {
        this.relatorio = relatorio;
    }
}