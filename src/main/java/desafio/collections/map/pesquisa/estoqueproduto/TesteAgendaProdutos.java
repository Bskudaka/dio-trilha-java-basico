package desafio.collections.map.pesquisa.estoqueproduto;

public class TesteAgendaProdutos {

    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutosMap = new EstoqueProdutos();
        estoqueProdutosMap.adicionarProduto(1, "Note", 1,2000);
        estoqueProdutosMap.adicionarProduto(2, "Tv", 2,3000);
        estoqueProdutosMap.adicionarProduto(3, "Geladeira", 1,5000);
        estoqueProdutosMap.adicionarProduto(4, "Celular", 2,2500);

        estoqueProdutosMap.exibirProdutos();
        System.out.println("Valor total do estoque: R$ " + estoqueProdutosMap.calcularValorTotalEstoque());
        System.out.println("Produto mais caro do estoque: " + estoqueProdutosMap.obterProdutoMaisCaro());


    }

}
