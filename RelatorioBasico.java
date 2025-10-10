package decorator;

// Componente concreto — relatório simples
public class RelatorioBasico implements iRelatorio {

    @Override
    public String Descricao() {
        return "Relatório básico de vendas";
    }

    @Override
    public double Custo() {
        return 10.0; // custo simbólico de geração
    }
}
