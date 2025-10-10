package Questao04Relatorio;

public class RelatorioBasico implements iRelatorio {

    @Override
    public String Descricao() {
        return "Relatório básico de vendas";
    }

    @Override
    public double Custo() {
        return 10.0;
    }
}