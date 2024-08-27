package desafio.collections.set.pesquisa.listatarefas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaSet.remove(t);
                System.out.println("Tarefa: " + descricao + " foi removida");
                break;
            }
        }
    }

    public void exibirTarefas() {
        System.out.println("Exibindo tarefas: " + tarefaSet);
    }

    public void contarTarefas() {
        System.out.println("Quantidade de tarefas: " + tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluido() == true) {
                concluidas.add(t);
            }
        }
        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluido() == false) {
                pendentes.add(t);
            }
        }
        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
                System.out.println("Tarefa " + t.getDescricao() + " marcado como concluida!");
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(false);
                System.out.println("Tarefa " + t.getDescricao() + " marcado como concluida!");
            }
        }
    }

    public void limparListaTarefas(){
        System.out.println("\nLimpando todas as tarefas");
        tarefaSet.clear();
    }

    public void tarefasConcluidas(){
        Set<Tarefa> concluidas = new HashSet<>();
        for (Tarefa t: tarefaSet){
            if (t.isConcluido()){
                concluidas.add(t);
            }
        }
        System.out.println("Quantidade de tarefas concluidas: " + concluidas.size());
    }

}
