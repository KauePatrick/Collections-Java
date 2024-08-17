package set.Ordenacao.tarefaDio;

import set.OperacoesBasicas.ConjuntoConvidado;
import set.Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> conjuntoAlunos;

    public GerenciadorAlunos() {
        this.conjuntoAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota){
        conjuntoAlunos.add(new Aluno(nome , matricula, nota));
    }

    public void removerAluno(int matricula){
        if(!conjuntoAlunos.isEmpty()){
            for(Aluno a : conjuntoAlunos){
                if(a.getMatricula() == matricula){
                    conjuntoAlunos.remove(a);
                }
            }
        } else{
            System.out.println("Sem matriculas");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(conjuntoAlunos);
      if(!conjuntoAlunos.isEmpty()) {
          System.out.println(alunosPorNome);
      } else {
          System.out.println("Sem matriculas");
      }
    }

    public void exibirAlunosPorNota(){
      Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!conjuntoAlunos.isEmpty()){
            alunosPorNota.addAll(conjuntoAlunos);
            System.out.println(alunosPorNota);
        } else{
            System.out.println("Sem matriculas");
        }
    }

    public void exibirAlunos(){
        if(!conjuntoAlunos.isEmpty()){
            System.out.println(conjuntoAlunos);
        } else {
            System.out.println("Sem matriculas");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("ana", 251358, 10);
        gerenciadorAlunos.adicionarAluno("ze", 25136, 2);
        gerenciadorAlunos.adicionarAluno("isa", 251343, 8);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.exibirAlunosPorNota();
        gerenciadorAlunos.exibirAlunosPorNome();

        gerenciadorAlunos.removerAluno(25136);
        gerenciadorAlunos.exibirAlunos();

    }
}
