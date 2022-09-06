package Catalogo;

public class Item {
    protected String titulo;
    protected String genero;
    protected String diretor;

    public Item(String titulo, String genero, String diretor) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getGenero() {
        return genero;
    }
    public String getDiretor() {
        return diretor;
    }
    public void imprimir(){
        System.out.println(this.getTitulo() + " - (" + this.getGenero() + ")");
    }
}
