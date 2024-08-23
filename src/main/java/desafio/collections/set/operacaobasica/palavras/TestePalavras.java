package desafio.collections.set.operacaobasica.palavras;

public class TestePalavras {

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
        palavrasUnicas.adicionarPalavra("Harmonia");
        palavrasUnicas.adicionarPalavra("Alegria");
        palavrasUnicas.adicionarPalavra("Felicidade");
        palavrasUnicas.adicionarPalavra("Properidade");
        palavrasUnicas.adicionarPalavra("Legal");

        palavrasUnicas.palavrasTotais();
        palavrasUnicas.exibirPalavrasUnicas();
        boolean verificandoPalavra = palavrasUnicas.verificarPalavra("Harmonia");
        existePalavraVerificada(verificandoPalavra);
        palavrasUnicas.removerPalavra("Harmonia");

        System.out.println("Depois de remover uma palavra");
        palavrasUnicas.palavrasTotais();
        palavrasUnicas.exibirPalavrasUnicas();
    }

    public static void existePalavraVerificada(boolean verificacaoPalavra){
        String existePalavraVerificada = verificacaoPalavra == true ? "Sim" :"Não";
        System.out.println("Existe Palavra verificada? " + existePalavraVerificada);
    }

}
