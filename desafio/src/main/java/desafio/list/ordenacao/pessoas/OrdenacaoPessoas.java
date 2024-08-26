package desafio.list.ordenacao.pessoas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public List<Pessoa> getPessoas(){
        return listaPessoas;
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        return listaPessoas.stream()
                .sorted(Comparator.comparingInt(Pessoa::getIdade))
                .collect(Collectors.toList());
    }

    public List<Pessoa> ordenarPorAltura(){
        return listaPessoas.stream()
                .sorted(Comparator.comparingDouble(Pessoa::getAltura))
                .collect(Collectors.toList());
    }

}
