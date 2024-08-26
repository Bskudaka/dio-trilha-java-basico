package desafio.collections.map.ordenacao.agendaeventos;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Eventos> eventosMap;
    private LocalDate dataAtual = LocalDate.now();

    public AgendaEventos() {
        this.eventosMap = new TreeMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Eventos(nome, atracao));
    }

    // Exibe a agenda de eventos em ordem crescente de data.
    public void exibirAgenda() {
        System.out.println(eventosMap);
    }

    public void obterProximoEvento() {
        LocalDate proximaData = null;
        Eventos proximoEvento = null;
        for (Map.Entry<LocalDate, Eventos> entry : eventosMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo envento " + proximoEvento + " vai acontecer no dia " + proximaData);
                break;
            }
        }
    }

}
