package Catalogo;

public class Filme extends Item {
    private int tempo;
    public Filme(String titulo, String genero, String diretor, int tempo) {
        super(titulo, genero, diretor);
        this.tempo = tempo;
    }
    public int getTempo() {
        return tempo;
    }
    public void imprimir(){
        String retorno = this.getTitulo();
        retorno += " ("+ this.getGenero() + ") - " + this.tempo + " min.";
        System.out.println(retorno);
    }
}
