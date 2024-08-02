package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero{

    private List<Integer> numeroList;

    public OrdenacaoNumero(){
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numeroAsc = new ArrayList<>(this.numeroList);
       if(!numeroAsc.isEmpty()){
           Collections.sort(numeroAsc);
           return numeroAsc;
       } else{
           throw new RuntimeException("A lista está vazia!");
       }

    }

    public List<Integer> ordenarDescendentes(){
        List<Integer> numeroAsc = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            numeroAsc.sort(Collections.reverseOrder());
            return numeroAsc;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }



    public static void main(String[] args) {

        OrdenacaoNumero numeros = new OrdenacaoNumero();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendentes());

        numeros.exibirNumeros();

    }
}
