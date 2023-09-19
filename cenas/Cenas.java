package projetoblocoum.cenas;

import java.util.List;

public class Cenas extends Jogo{

    private final String texto;
    private final String prompt;
    private List<Cenas> proximasCenas;

    public Cenas(String titulo, String texto, String prompt) {
        super (titulo);
        this.titulo = titulo;
        this.texto = texto;
        this.prompt = prompt;

    }

    public String getTitulo() { return titulo; }

    public String getTexto() { return texto; }

    public String getPrompt() { return prompt; }

    public List<Cenas> getProximasCenas() { return proximasCenas; }

    public boolean hasProximaCena() {
        return !proximasCenas.isEmpty();
    }

    public void setProximasCenas(List<Cenas> proximasCenas) {
        this.proximasCenas = proximasCenas;
    }
}

