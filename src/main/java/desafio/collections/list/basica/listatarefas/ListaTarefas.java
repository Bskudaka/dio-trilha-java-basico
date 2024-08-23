package desafio.collections.list.basica.listatarefas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefas {

    private List<Tarefas> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        Iterator<Tarefas> iterator = listaTarefas.iterator();
        while (iterator.hasNext()){
            Tarefas tarefa = iterator.next();
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                iterator.remove();
            }
        }
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }

}
