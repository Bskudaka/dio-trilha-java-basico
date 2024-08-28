package desafio.collections.map.pesquisa.contagempalavra;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavraMap;

    public ContagemPalavras() {
        this.contagemPalavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavraMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemPalavraMap.remove(palavra);
        System.out.println("Removendo a palavra: " + palavra);
    }

    public void exibirPalavras(){
        System.out.println("Exibindo palavras e suas contagens: " + contagemPalavraMap);
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int contagem: contagemPalavraMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int  maiorContagem = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry: contagemPalavraMap.entrySet()){
            if (entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

}
