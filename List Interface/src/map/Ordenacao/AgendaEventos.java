package map.Ordenacao;


import java.time.LocalDate;
import java.time.Month;
import java.util.*;
public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        LocalDate dataAtual = LocalDate.now();
        for(LocalDate a : eventosTreeMap.keySet()){
            if(a.isEqual(dataAtual) || a.isAfter(dataAtual)){
                System.out.println("O proximo evento: " + eventoMap.get(a));
                break;
            }
        }
    }

    public void obterproxEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: " + entry.getValue() + ", acontecera na data " + entry.getKey());
                break;
            }
        }
    }



    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        System.out.println(LocalDate.now());

        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 24), "PROVA Proj. Sistemas O.O.", "PROVA" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "PROVA Desenv. Sof. Internet", "PROVA" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 25), "PROVA Ger. Projetos Software", "PROVA" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 19), "PROVA Programação O.O.II", "PROVA" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 23), "PROVA Top. Esp. Programação O.O.", "PROVA" );
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}
