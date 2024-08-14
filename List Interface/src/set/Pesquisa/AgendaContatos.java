package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato a : contatoSet){
            if(a.getNome().startsWith(nome)){
                contatosPorNome.add(a);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNUmeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato a : contatoSet){
            if(a.getNome().equalsIgnoreCase(nome)){
                a.setNumero(novoNumero);
                contatoAtualizado = a;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        System.out.println(agendaContatos.atualizarNUmeroContato("João", 996052408));

    }
}
