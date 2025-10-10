package Questao03News;

public class consumidorObserver {

    public static void main(String[] args) {

        Topico politica   = new Topico("Política");
        Topico esportes   = new Topico("Esportes");
        Topico tecnologia = new Topico("Tecnologia");

        LeitorConcreto leitorA_Politica   = new LeitorConcreto(politica,   "Alice");
        LeitorConcreto leitorB_Esportes   = new LeitorConcreto(esportes,   "Bruno");
        LeitorConcreto leitorC_Politica   = new LeitorConcreto(politica,   "Carla");
        LeitorConcreto leitorC_Tecnologia = new LeitorConcreto(tecnologia, "Carla");
        LeitorConcreto leitorA_Tecnologia = new LeitorConcreto(tecnologia, "Alice");

        System.out.println("=== Publicando em Política ===");
        politica.publicarNoticia("Reforma Tributária é aprovada");

        System.out.println("\n=== Publicando em Esportes ===");
        esportes.publicarNoticia("Time X vence a final do campeonato");

        System.out.println("\n=== Publicando em Tecnologia ===");
        tecnologia.publicarNoticia("Novo smartphone com IA embarcada é lançado");

    }
}