package desafio.collections.set.operacaobasica.convidados;

public class TesteConvidado {

    public static void main(String[] args) {

        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.adicionarConvidado("Bruno",1);
        convidados.adicionarConvidado("Ana",2);
        convidados.adicionarConvidado("Jose",3);
        convidados.adicionarConvidado("Mario",4);
        convidados.adicionarConvidado("Olga",4);

        convidados.exibirConvidados();
        convidados.contarConvidados();
        convidados.removerConvidadoPorCodigoConvite(1);

        System.out.println("Depois de remover convidado por codigo do convite");
        convidados.contarConvidados();



    }

}
