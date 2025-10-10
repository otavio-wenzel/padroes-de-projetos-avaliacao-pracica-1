package Questao03News;

public class LeitorConcreto extends AbsObserver {

    private final String nomeLeitor;

    public LeitorConcreto(Topico observado, String nomeLeitor) {
        this.observado = observado;
        this.nomeLeitor = nomeLeitor;
        this.observado.attach(this);
    }

    @Override
    public void update() {
        System.out.println(
            "Leitor \"" + nomeLeitor + "\" recebeu notificação em [" +
            observado.getNome() + "]: " + observado.getUltimaNoticia()
        );
    }

    @Override
    public String toString() {
        return "LeitorConcreto{" + nomeLeitor + "}";
    }
}