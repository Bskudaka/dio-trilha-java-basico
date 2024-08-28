package desafio.collections.map.pesquisa.contagempalavra;

public class TesteContagemPalavras {

    public static void main(String[] args) {

        ContagemPalavras palavras = new ContagemPalavras();

        palavras.adicionarPalavra("Alegria",5);
        palavras.adicionarPalavra("Harmonia",2);
        palavras.adicionarPalavra("Felicidade",1);
        palavras.adicionarPalavra("Eficiencia",10);
        palavras.adicionarPalavra("Pontual",3);

        palavras.exibirPalavras();
        System.out.println("Contagem total das palavras: " + palavras.exibirContagemPalavras());
        System.out.println("Palavra mais frequente: " + palavras.encontrarPalavraMaisFrequente());

        palavras.removerPalavra("Eficiencia");
        palavras.exibirPalavras();
        System.out.println("Palavra mais frequente: " + palavras.encontrarPalavraMaisFrequente());

    }

}
