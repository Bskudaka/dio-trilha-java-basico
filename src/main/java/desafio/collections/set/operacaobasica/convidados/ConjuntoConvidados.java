package desafio.collections.set.operacaobasica.convidados;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Iterator<Convidado> iterator = convidados.iterator();
        while (iterator.hasNext()) {
            Convidado convidado = iterator.next();
            if (convidado.getCodigoConvite() == codigoConvite) {
                iterator.remove();
            }
        }
    }

    public void contarConvidados() {
        System.out.println("Total de convidados: " + convidados.size());
    }

    public void exibirConvidados() {
        System.out.println("Convidados: " + convidados);
    }

}
