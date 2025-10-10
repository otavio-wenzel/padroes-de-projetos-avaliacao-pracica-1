package decorator;

// Decorador concreto — adiciona exportação em PDF ao relatório
public class PdfDecorator extends RelatorioDecorator {

    public PdfDecorator(iRelatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String Descricao() {
        return relatorio.Descricao() + ", exportado em PDF";
    }

    @Override
    public double Custo() {
        return relatorio.Custo() + 3.0;
    }
}
