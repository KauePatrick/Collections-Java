package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {

    private List<Item> CarrinhoItems;

    public void Carrinho(){
        this.CarrinhoItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        CarrinhoItems.add( new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> ItemsParaRemover = new ArrayList<>();
        for (Item a : CarrinhoItems) {
            if(a.getNome().equalsIgnoreCase(nome)){
                ItemsParaRemover.add(a);
            }

        }
        CarrinhoItems.removeAll(ItemsParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item a : CarrinhoItems){
            if(a.getQuantidade()>0){
                total = total + a.getPreco() * a.getQuantidade();
            }

        }
        return total;
    }

    public void exibirItens(){
        for (Item a : CarrinhoItems) {
            System.out.println("Item " + CarrinhoItems.size());
            System.out.println("Nome: " + a.getNome());
            System.out.println("Preço: " + a.getPreco());
            System.out.println("Quantidade: " + a.getQuantidade());

        }

    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("celular", 1.900, 1);

    }

}
