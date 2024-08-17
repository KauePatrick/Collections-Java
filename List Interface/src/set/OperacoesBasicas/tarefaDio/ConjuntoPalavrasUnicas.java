package set.OperacoesBasicas.tarefaDio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavrasUnicas, that.palavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavrasUnicas);
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        for(String a : palavrasUnicas){
            if(a.equalsIgnoreCase(palavra)){
                palavrasUnicas.remove(a);
            }
            break;
        }
    }

    public void verificarPalavra(String palavra){
        for(String a : palavrasUnicas){
            if(a == palavra){
                System.out.println("A palavra: " + palavra + " esta dentro do conjunto");
                break;
            }
            else{
                System.out.println("Não existe essa palavra dentro do Conjunto");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasUnicas=" + palavrasUnicas +
                '}';
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("JavaScript");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("Ruby");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Java");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("C++");

    }
}
