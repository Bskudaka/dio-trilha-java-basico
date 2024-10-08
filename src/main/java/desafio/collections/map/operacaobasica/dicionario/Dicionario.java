package desafio.collections.map.operacaobasica.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        System.out.println("Removendo palavra '" + palavra + "' descrição: " + dicionarioMap.remove(palavra));
    }

    public void exibirPalavras() {
        System.out.println("Exibindo palavras: " + dicionarioMap);
    }

    public void pesquisarPorPalavra(String palavra) {
        System.out.println("Descrição de " + palavra + ": " + dicionarioMap.get(palavra));
    }

    public void quantidadePalavras(){
        System.out.println("Quantidade totais de palavras: " + dicionarioMap.size());
    }
}
