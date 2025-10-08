package Questao01Modal;
/**
 * Creator (abstrato) — "a fabricante" no estilo do professor.
 * Define o Factory Method e expõe um método público para o serviço.
 */
public abstract class ModalFactory {
    
    // Factory Method — cada subclasse concreta cria seu Transporte específico
    public abstract Modal criarModal();

    
}

