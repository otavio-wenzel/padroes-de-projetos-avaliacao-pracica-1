package Questao03News;

import java.util.ArrayList;
import java.util.List;

public class Topico {

    private  String nome;
    private String ultimaNoticia;

    private  List<AbsObserver> observers = new ArrayList<>();

    public Topico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getUltimaNoticia() {
        return ultimaNoticia;
    }

    public void publicarNoticia(String titulo) {
        this.ultimaNoticia = titulo;
        this.notificarObservadores();
    }

    private void notificarObservadores() {
        for (AbsObserver o : this.observers) {
            o.update();
        }
    }

    public void attach(AbsObserver o) {
        if (o != null && !this.observers.contains(o)) {
            this.observers.add(o);
        }
    }

    public void dettach(AbsObserver o) {
        this.observers.remove(o);
    }
}