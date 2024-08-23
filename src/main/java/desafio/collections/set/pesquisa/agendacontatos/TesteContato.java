package desafio.collections.set.pesquisa.agendacontatos;

import java.util.Set;

public class TesteContato {

    public static void main(String[] args) {

        AgendaContatos contatos = new AgendaContatos();
        contatos.adicionarContato("Bruno Kudaka","950835352");
        contatos.adicionarContato("Ana Kudaka","49911420");
        contatos.adicionarContato("Jose Kudaka","950830000");
        contatos.adicionarContato("Bruno Silva","950835555");
        contatos.adicionarContato("Bruno Souza","980805352");

        contatos.exibirContatos();
        contatos.pesquisarPorNome("Bruno Souza");

        contatos.atualizarNumeroContato("Bruno Souza","000000000");

        contatos.exibirContatos();



    }

}
