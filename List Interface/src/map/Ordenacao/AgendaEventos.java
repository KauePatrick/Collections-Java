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

        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 26), "Aniversario da isa", "Churrasco" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, 1, 2), "Aniversario do Kaue", "Kaue" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 28), "Aniversario da vovo", "vovo bunita" );
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}
