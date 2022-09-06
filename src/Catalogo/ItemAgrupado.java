package Catalogo;

import java.util.ArrayList;

public class ItemAgrupado extends Item {
    private ArrayList<Filme> filmes = new ArrayList<Filme>();
    public ItemAgrupado(String titulo, String genero, String diretor) {
        super(titulo, genero, diretor);
    }
    public void adicionar(Filme filme) {
        this.filmes.add(filme);
    }
    public ArrayList<Filme> getFilmes() {
        return this.filmes;
    }
    public int getTempo() {
        int tempo = 0;
        for(Filme item: this.getFilmes()) {
            tempo += item.getTempo();
        }
        return tempo;
    }
    public void imprimir(){
        super.imprimir();
        this.imprimeFilmes();
        System.out.println("Duração total: " + this.getTempo() + " min.");
    }
    public void imprimeFilmes() {
        int i = 1;
        for(Filme item: this.getFilmes()) {
            System.out.print("\t" + (i++) + ". ");
            item.imprimir();
        }
    }
}
