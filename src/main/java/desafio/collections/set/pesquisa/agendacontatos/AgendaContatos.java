package desafio.collections.set.pesquisa.agendacontatos;

import desafio.collections.list.ordenacao.pessoas.Pessoa;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println("Contatos: " + contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> pesquisaEncontrada = contatoSet.stream()
                .filter(c -> c.getNome().split(" ")[0].equalsIgnoreCase(nome))
                .collect(Collectors.toSet());

        pesquisaEncontrada.forEach(c -> System.out.println(c));

        return pesquisaEncontrada;
    }

    public void atualizarNumeroContato(String nome, String novoNumero) {
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                System.out.println("O contato numero de telefone do " + c.getNome() + " foi alterado para: " + novoNumero);
                break;
            }
        }
    }

}
