package desafio.collections.set.ordenacao.cadastroprodutos;

public class TesteProduto {

    public static void main(String[] args) {

        CadastroProdutos produtos = new CadastroProdutos();
        produtos.adicionarProduto(1, "Note", 2000, 1);
        produtos.adicionarProduto(2, "Tv", 5000, 2);
        produtos.adicionarProduto(3, "Celular", 3000, 1);
        produtos.adicionarProduto(4, "Geladeira", 5000, 1);


        produtos.exibirProdutos();
        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirProdutosPorPreco());

    }

}
