package desafio.collections.set.ordenacao.cadastroprodutos;

import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Produto> {

    // se quiser fazer do preço maior para menor trocar a ordem do p1 do p2.
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
