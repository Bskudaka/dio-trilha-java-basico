package desafio.collections.map.ordenacao.livrariaonline;

import java.util.*;
import java.util.stream.Collectors;

public class LivrariaOnline {

    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livroMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        livroMap.remove(titulo);
        System.out.println("Removendo o livro: " + titulo);
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        return livroMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new
                ));
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livroPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livroPorAutor.put(entry.getKey(), livro);
            }
        }
        return livroPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livroMaisCaro = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;
        for (Livro l : livroMap.values()) {
            if (l.getPreco() > precoMaisAlto) {
                precoMaisAlto = l.getPreco();
            }
        }
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livroMap.get(entry.getKey());
                livroMaisCaro.add(livroComPrecoMaisAlto);
            }
        }
        return livroMaisCaro;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livroMaisBarato = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;
        for (Livro l : livroMap.values()) {
            if (l.getPreco() < precoMaisBaixo) {
                precoMaisBaixo = l.getPreco();
            }
        }
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livroMap.get(entry.getKey());
                livroMaisBarato.add(livroComPrecoMaisBaixo);
            }
        }
        return livroMaisBarato;
    }


}
