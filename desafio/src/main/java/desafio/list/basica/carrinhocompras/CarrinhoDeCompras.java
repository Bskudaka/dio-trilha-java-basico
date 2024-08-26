package desafio.list.basica.carrinhocompras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        Iterator<Item> iterator = listaItens.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
            }
        }
    }

    public void obterItensTotais() {
        System.out.println("Total de itens no carrinho: " + listaItens.size());
    }

    public void calcularValorTotal() {
        double valorTotal = 0;
        Iterator<Item> iterator = listaItens.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            valorTotal += (item.getPreco() * item.getQuantidade());
        }
        System.out.printf("Valor tototal do carrinho: R$ %.2f", valorTotal);
    }

    public void exibirItens() {
        System.out.println(listaItens);
    }
}


