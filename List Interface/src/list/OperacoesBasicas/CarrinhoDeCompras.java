package list.OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {

    private List<Item> CarrinhoItems;

    public void Carrinho(){
        this.CarrinhoItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item (nome, preco, quantidade);
        this.CarrinhoItems.add(item);
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

    public void calcularValorTotal(){
        double total = 0;
        for (Item a : CarrinhoItems){
            if(a.getQuantidade()>0){
                total = total + a.getPreco() * a.getQuantidade();
            }

        }
        System.out.println("Valor total do carrinho de compras: " + total);
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

        carrinhoDeCompras.Carrinho();
        carrinhoDeCompras.adicionarItem("celular", 1.900, 1);
        carrinhoDeCompras.adicionarItem("chinelo", 1.752, 3);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.removerItem("celular");
        carrinhoDeCompras.exibirItens();

    }

}
