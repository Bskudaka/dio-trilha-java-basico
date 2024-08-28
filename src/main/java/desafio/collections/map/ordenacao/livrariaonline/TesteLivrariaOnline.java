package desafio.collections.map.ordenacao.livrariaonline;

import java.util.List;
import java.util.Map;

public class TesteLivrariaOnline {

    public static void main(String[] args) {

        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        List<Livro> livroMaisCaro = livrariaOnline.obterLivroMaisCaro();
        System.out.println("\nLivro mais caro: " + livroMaisCaro);
        List<Livro> livroMasiBarato = livrariaOnline.obterLivroMaisBarato();
        System.out.println("\nLivro mais barato: " + livroMasiBarato);

        Map<String, Livro> pesquisaAutor = livrariaOnline.pesquisarLivrosPorAutor("Agatha Christie");
        System.out.println("\nPesquisando por autor: " + pesquisaAutor);

    }

}
