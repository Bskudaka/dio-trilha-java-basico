package desafio.collections.set.ordenacao.listaalunos;

import java.util.*;
import java.util.stream.Collectors;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public void removerAluno(long matricula) {
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoSet.remove(a);
                System.out.println(a.getNome() + " foi removido da lista");
                break;
            }
        }
    }

    // Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunos = new TreeSet<>(alunoSet);
        return alunos;
//        return alunoSet.stream()
//                .sorted(Comparator.comparing(Aluno::getNome))
//                .collect(Collectors.toList());
    }


    public List<Aluno> exibirAlunosPorNota(){
        return alunoSet.stream()
                .sorted(Comparator.comparing(Aluno::getNota).reversed())
                .collect(Collectors.toList());
    }
}


