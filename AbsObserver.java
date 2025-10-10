package observer;

/**
 * Observer abstrato — segue o padrão do professor.
 * Mantém a referência ao "observado" (Topico) e define o método update().
 */
public abstract class AbsObserver {
    // Atributo do tipo observado
    protected Topico observado;

    // Assinatura do método acionado durante a notificação
    public abstract void update();
}
