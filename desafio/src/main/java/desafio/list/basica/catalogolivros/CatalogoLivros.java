package desafio.list.basica.catalogolivros;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void livrosTotais(){
        System.out.println("Quantidade de livros informados: " + listaLivros.size());
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        if (!listaLivros.isEmpty()) {
            return listaLivros.stream()
                    .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                    .collect(Collectors.toList());
        }
        return listaLivros;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if (!listaLivros.isEmpty()) {
            return listaLivros.stream()
                    .filter(l -> l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                    .collect(Collectors.toList());
        }
        return listaLivros;
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        return listaLivros.stream()
                .filter(l -> l.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());
    }
}

