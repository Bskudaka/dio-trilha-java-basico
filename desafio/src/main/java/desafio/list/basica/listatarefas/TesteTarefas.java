package desafio.list.basica.listatarefas;

public class TesteTarefas {

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());


        listaTarefas.removerTarefa("Tarefa 1");
        listaTarefas.obterDescricoesTarefas();

    }

}
