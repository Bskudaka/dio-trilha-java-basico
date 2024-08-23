package desafio.collections.set.operacaobasica.palavras;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Palavras> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(new Palavras(palavra));
    }

    public void removerPalavra(String palavra){
        Iterator<Palavras> iterator = palavrasSet.iterator();
        while (iterator.hasNext()){
            Palavras palavras = iterator.next();
            if (palavras.getPalavra().equalsIgnoreCase(palavra)){
                iterator.remove();
            }
        }
    }

    public boolean verificarPalavra(String palavra){
      return palavrasSet.stream()
                .anyMatch(p -> p.getPalavra().equalsIgnoreCase(palavra));
    }

    public void exibirPalavrasUnicas(){
        System.out.println("Palavras informadas: " + palavrasSet);
    }

    public void palavrasTotais(){
        System.out.println("Palavras totais informadas: " + palavrasSet.size());
    }

}
