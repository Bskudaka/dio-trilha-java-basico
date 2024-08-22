package desafio.list.basica.carrinhocompras;

public class TesteItem {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Celular", 2000,1);
        carrinho.adicionarItem("Tv", 3000,2);
        carrinho.adicionarItem("Geladeira", 5000,1);
        carrinho.adicionarItem("Computador", 5000,1);
        carrinho.adicionarItem("Monitor", 2000,2);

        carrinho.obterItensTotais();
        carrinho.exibirItens();
        carrinho.calcularValorTotal();

        carrinho.removerItem("Tv");

        System.out.println("");
        System.out.println("\nDepois de tirar o 1 item");
        carrinho.obterItensTotais();
        carrinho.exibirItens();
        carrinho.calcularValorTotal();

    }

}
