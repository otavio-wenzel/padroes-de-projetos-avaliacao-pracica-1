package observer;

/**
 * Observer concreto — representa um leitor/assinante do site.
 * Ele se registra (attach) no tópico no momento da criação.
 */
public class LeitorConcreto extends AbsObserver {

    private final String nomeLeitor;

    public LeitorConcreto(Topico observado, String nomeLeitor) {
        this.observado = observado;
        this.nomeLeitor = nomeLeitor;
        // Auto-registro no tópico observado
        this.observado.attach(this);
    }

    @Override
    public void update() {
        // Mensagem no estilo didático do professor (simples e direta)
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
