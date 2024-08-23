package desafio.collections.list.ordenacao.pessoas;

public class TestePessoas {

    public static void main(String[] args) {

        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
        pessoas.adicionarPessoa("Olga", 91, 1.50);
        pessoas.adicionarPessoa("Bruno", 32, 1.65);
        pessoas.adicionarPessoa("Jose", 65, 1.58);
        pessoas.adicionarPessoa("Ana", 60, 1.55);


        System.out.println("Imprimindo a lista de pessoas: " + pessoas.getPessoas());
        System.out.println("Imprimindo a lista de pessoas por idade: " + pessoas.ordenarPorIdade());
        System.out.println("Imprimindo a lista de pessoas por altura: " + pessoas.ordenarPorAltura());

    }

}
