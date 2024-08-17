package set.Pesquisa.tarefaDio;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> conjuntoTarefas;

    public ListaTarefas() {
        this.conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        conjuntoTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa a : conjuntoTarefas) {
                if (a.getDescricao().equalsIgnoreCase(descricao)) {
                    conjuntoTarefas.remove(a);
                }
                break;
            }
        } else{
            throw new RuntimeException("Essa tarefa não existe");
        }
    }

    public void exibirTarefas(){
        if(!conjuntoTarefas.isEmpty()) {
            System.out.println(conjuntoTarefas);
        } else{
            System.out.println("A lista esta vazia");
        }
    }

    public void contarTarefas(){
        System.out.println("Total de " + conjuntoTarefas.size() +" tarefas");
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa a : conjuntoTarefas) {
                if (a.getConcluida() == true) {
                    tarefasConcluidas.add(a);
                }
            }
        } else {
            throw new RuntimeException("Sem tarefas concluidas");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!conjuntoTarefas.isEmpty()){
            for(Tarefa a : conjuntoTarefas){
                if(a.getConcluida() == false){
                    tarefasPendentes.add(a);
                }
            }
        } else{
            throw new RuntimeException("Não a tarefas pendentes");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!conjuntoTarefas.isEmpty()){
            for(Tarefa a : conjuntoTarefas){
                if(a.getDescricao().equalsIgnoreCase(descricao)){
                    a.setConcluida(true);
                }
            }
        } else{
            throw new RuntimeException("Tarefa não encontrada");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!conjuntoTarefas.isEmpty()){
            for(Tarefa a : conjuntoTarefas){
                if(a.getDescricao().equalsIgnoreCase(descricao)){
                    a.setConcluida(false);
                }
            }
        } else {
            throw new RuntimeException("Tarefa não encontrada");
        }
    }

    public void limparListaTarefas(){
        conjuntoTarefas.removeAll(conjuntoTarefas);
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Lavar a moto");
        listaTarefas.adicionarTarefa("Ir para a academia");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Lavar a moto");
        System.out.println("Tarefas concluidas: "+listaTarefas.obterTarefasConcluidas());

        //listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();



    }


}
