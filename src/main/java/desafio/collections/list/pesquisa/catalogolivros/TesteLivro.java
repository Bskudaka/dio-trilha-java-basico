package desafio.collections.list.pesquisa.catalogolivros;

public class TesteLivro {

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Duna", "Bruno", 2020);
        catalogoLivros.adicionarLivro("Harry Potter", "Bruno", 2025);
        catalogoLivros.adicionarLivro("Os Incriveis", "Jose", 2000);
        catalogoLivros.adicionarLivro("Tubarao", "Olga", 1990);


        System.out.println(catalogoLivros.pesquisarPorAutor("Bruno"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990, 2030));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Duna"));
        catalogoLivros.livrosTotais();


    }




}
