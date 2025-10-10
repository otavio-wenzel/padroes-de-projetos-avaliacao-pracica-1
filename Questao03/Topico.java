package Questao03;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject (observado) — cada tópico de notícia mantém sua própria lista de leitores
 * e notifica todos quando uma nova notícia é publicada.
 */
public class Topico {

    private final String nome; // Ex.: "Política", "Esportes", "Tecnologia"
    private String ultimaNoticia;

    // Lista de observadores (leitores inscritos neste tópico)
    private final List<AbsObserver> observers = new ArrayList<>();

    public Topico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getUltimaNoticia() {
        return ultimaNoticia;
    }

    // Método para publicação de notícia — altera o "estado" e notifica
    public void publicarNoticia(String titulo) {
        this.ultimaNoticia = titulo;
        this.notificarObservadores();
    }

    // Método para notificar todos os observadores
    private void notificarObservadores() {
        for (AbsObserver o : this.observers) {
            o.update();
        }
    }

    // Método para registro de observadores
    public void attach(AbsObserver o) {
        if (o != null && !this.observers.contains(o)) {
            this.observers.add(o);
        }
    }

    // Método para remoção de observadores
    public void dettach(AbsObserver o) {
        this.observers.remove(o);
    }
}
