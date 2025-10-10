package Questao03;

/**
 * Classe de teste (consumidor) no exato estilo dos slides do professor.
 * Cria tópicos (Subjects), cria leitores (Observers) e publica notícias.
 */
public class consumidorObserver {

    public static void main(String[] args) {

        // Tópicos (assuntos do site) — Subjects
        Topico politica   = new Topico("Política");
        Topico esportes   = new Topico("Esportes");
        Topico tecnologia = new Topico("Tecnologia");

        // Leitores (observers) — cada leitor se inscreve nos tópicos que quer acompanhar
        LeitorConcreto leitorA_Politica   = new LeitorConcreto(politica,   "Alice");
        LeitorConcreto leitorB_Esportes   = new LeitorConcreto(esportes,   "Bruno");
        LeitorConcreto leitorC_Politica   = new LeitorConcreto(politica,   "Carla");
        LeitorConcreto leitorC_Tecnologia = new LeitorConcreto(tecnologia, "Carla"); // mesmo leitor inscrito em mais de um tópico
        LeitorConcreto leitorA_Tecnologia = new LeitorConcreto(tecnologia, "Alice");

        // Publicações — cada publicação notifica os leitores inscritos naquele tópico
        System.out.println("=== Publicando em Política ===");
        politica.publicarNoticia("Reforma Tributária é aprovada");

        System.out.println("\n=== Publicando em Esportes ===");
        esportes.publicarNoticia("Time X vence a final do campeonato");

        System.out.println("\n=== Publicando em Tecnologia ===");
        tecnologia.publicarNoticia("Novo smartphone com IA embarcada é lançado");

        // Exemplo de desinscrição (opcional):
        // politica.dettach(leitorC_Politica);
        // politica.publicarNoticia("Projeto de lei Y é arquivado");
    }
}
