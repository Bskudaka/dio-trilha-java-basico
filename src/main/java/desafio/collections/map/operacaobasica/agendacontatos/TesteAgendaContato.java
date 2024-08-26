package desafio.collections.map.operacaobasica.agendacontatos;

public class TesteAgendaContato {

    public static void main(String[] args) {

        AgendaContatos contatosMap = new AgendaContatos();

        contatosMap.adicionarContato("Bruno Kudaka", 123456);
        contatosMap.adicionarContato("Ana", 654321);
        contatosMap.adicionarContato("Jose", 852741);
        contatosMap.adicionarContato("Bruno Souza", 258147);
        contatosMap.adicionarContato("Olga", 963741);

        contatosMap.exibirContatos();
        contatosMap.removerContato("Bruno Souza");
        System.out.println("Depois de remover");
        contatosMap.exibirContatos();
        System.out.println(contatosMap.pesquisarPorNome("Bruno Kudaka"));

    }

}
