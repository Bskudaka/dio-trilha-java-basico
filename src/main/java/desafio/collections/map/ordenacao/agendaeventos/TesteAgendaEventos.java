package desafio.collections.map.ordenacao.agendaeventos;

import java.time.LocalDate;

public class TesteAgendaEventos {

    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022,2,20),"Carnaval","Ivete Sangaldo");
        agendaEventos.adicionarEvento(LocalDate.of(2020,3,25),"Ultr Music Festival","Djs");
        agendaEventos.adicionarEvento(LocalDate.of(2023,10,15),"Tomorrowland","Djs top");
        agendaEventos.adicionarEvento(LocalDate.of(2024,12,25),"Natal","Papai Noel");
        agendaEventos.adicionarEvento(LocalDate.of(2019,11,10),"Burning Man","Djs internacionais");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();


    }


}
