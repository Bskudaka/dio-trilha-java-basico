package desafio.collections.set.pesquisa.listatarefas;

public class TesteListaTarefas {

    public static void main(String[] args) {

        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Faxina");
        tarefas.adicionarTarefa("Lavar carro");
        tarefas.adicionarTarefa("Lavar louça");
        tarefas.adicionarTarefa("Cozinhar");

        tarefas.contarTarefas();
        tarefas.exibirTarefas();

        tarefas.marcarTarefaConcluida("Faxina");
        tarefas.marcarTarefaConcluida("Lavar carro");
        tarefas.tarefasConcluidas();
        System.out.println(tarefas.obterTarefasConcluidas());
        System.out.println("\nTarefas pendentes: " + tarefas.obterTarefasPendentes());

        tarefas.marcarTarefaPendente("Faxina");
        System.out.println("\nTarefas pendentes: " + tarefas.obterTarefasPendentes());

        tarefas.removerTarefa("Faxina");

        System.out.println("\nDepois de removar tarefas");
        tarefas.contarTarefas();
        tarefas.exibirTarefas();

        tarefas.limparListaTarefas();
        tarefas.contarTarefas();
        tarefas.exibirTarefas();

    }

}
