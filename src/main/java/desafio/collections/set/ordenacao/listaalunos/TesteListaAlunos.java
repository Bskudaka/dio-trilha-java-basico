package desafio.collections.set.ordenacao.listaalunos;

public class TesteListaAlunos {

    public static void main(String[] args) {

        GerenciadorAlunos aluno = new GerenciadorAlunos();

        aluno.adicionarAluno("Bruno",123456l,8);
        aluno.adicionarAluno("Jose",987654l,9);
        aluno.adicionarAluno("Ana",852741l,10);
        aluno.adicionarAluno("Olga",963852l,7);

        System.out.println("Exbiindo alunos:");
        aluno.exibirAlunos();
        System.out.println("Exibindo por nome: " + aluno.exibirAlunosPorNome());

        aluno.removerAluno(123456l);

        aluno.exibirAlunos();
        System.out.println("Exibindo por nota: " + aluno.exibirAlunosPorNota());

    }

}
