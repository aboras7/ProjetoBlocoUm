package projetoblocoum.cenas;

public abstract class Jogo {
        String titulo;

    public Jogo(String titulo) {
        this.titulo = titulo;
    }

    public Jogo () {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
