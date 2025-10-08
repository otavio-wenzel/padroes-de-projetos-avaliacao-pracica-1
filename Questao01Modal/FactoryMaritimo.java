package Questao01Modal;

public class FactoryMaritimo extends ModalFactory {

    private double precoPorM3;

    public FactoryMaritimo(double precoPorM3) {
        this.precoPorM3 = precoPorM3;
    }

    @Override
    public Modal criarModal() {
        return new ModalMaritimo(precoPorM3);
    }
    
}
