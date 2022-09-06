package Catalogo;

import java.util.ArrayList;

public class Catalogo {
    public ArrayList<Object> TabelaStreaming = new ArrayList<Object>();
    public void adicionar(Object item) {
        this.TabelaStreaming.add(item);
    }
    public void imprimir() {
        for(Object item: TabelaStreaming) {
            var classe = item.getClass().getName();
            if(classe == "Catalogo.Filme") {
                Filme filme = (Filme) item;
                filme.imprimir();
            } else {
                ItemAgrupado serieShow = (ItemAgrupado) item;
                serieShow.imprimir();
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        var filme = new Filme("Cidade de Deus", "Ação/Drama", "Fernando Meirelles", 130);
        var filmin = new Filme("Cidade dos Homens", "Ação/Drama", "Paulo Morelli", 110);

        var lcp = new Serie("La Casa de Papel", "Ação/Suspense", "Netflix", 5);
        lcp.adicionar(new Filme("Bella Ciao", "Suspense", "Paulo Morelli", 48));
        lcp.adicionar(new Filme("Dalí", "Drama/Ação", "José Padilha", 53));
        lcp.adicionar(new Filme("Rio", "Ação/Suspense", "Marcos Castro", 58));

        var twd = new Serie("The Walking Dead", "Ação/Suspense", "Fox", 5);
        twd.adicionar(new Filme("The Walkers", "Suspense/Drama", "Vanderley Luchenburgo", 70));
        twd.adicionar(new Filme("Miracle", "Aventura/Drama", "Loro José", 62));
        twd.adicionar(new Filme("That MF", "Ação", "Felipe Smith", 44));

        var show = new Show("Baile da Santinha", "Pagode", "ONErpm");
        show.adicionar(new Filme("Santinha", "Pagode", "LÉO SANTANA", 5));
        show.adicionar(new Filme("Contatinho", "Pagode", "LÉO SANTANA", 3));

        var dz7 = new Show("Baile da DZ7", "Funk/Trap", "Cultura SP");
        dz7.adicionar(new Filme("Baile do Cinga do 12", "Funk", "MC Gontijo", 4));
        dz7.adicionar(new Filme("Trajadão", "Trap", "DomLaike", 2));

        var TabelaStreaming = new Catalogo();
        TabelaStreaming.adicionar(filme);
        TabelaStreaming.adicionar(filmin);
        TabelaStreaming.adicionar(lcp);
        TabelaStreaming.adicionar(twd);
        TabelaStreaming.adicionar(show);
        TabelaStreaming.adicionar(dz7);
        TabelaStreaming.imprimir();
    }
}
