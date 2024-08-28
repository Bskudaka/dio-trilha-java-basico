package desafio.collections.map.operacaobasica.dicionario;

public class TesteDicionario {

    public static void main(String[] args) {

        Dicionario palavra = new Dicionario();
        palavra.adicionarPalavra("Alegria", "Estado feliz");
        palavra.adicionarPalavra("Tristeza", "Estado triste");
        palavra.adicionarPalavra("Amizade", "Laços bons com amigos");
        palavra.adicionarPalavra("Ocupado", "Realizando alguma tarefa");

        palavra.quantidadePalavras();
        palavra.exibirPalavras();
        palavra.pesquisarPorPalavra("Alegria");

        System.out.println("");
        palavra.removerPalavra("Alegria");
        palavra.quantidadePalavras();
        palavra.exibirPalavras();


    }

}
