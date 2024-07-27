package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;
public class CatalogoLivros {

    private List<Livro>LivroList;

    public CatalogoLivros() {
        this.LivroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        LivroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> LivrosPorAutor = new ArrayList<>();
        if(!LivroList.isEmpty()){
            for(Livro l : LivroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    LivrosPorAutor.add(l);
                }
            }
        }
        return LivrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> LivrosPorIntervaloAno = new ArrayList<>();
        if(!LivroList.isEmpty()){
            for(Livro l : LivroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    LivrosPorIntervaloAno.add(l);
                }
            }
        }
        return LivrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!LivroList.isEmpty()) {
            for (Livro l : LivroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo;
        }
        else{
            throw new RuntimeException("A lista esta vazia");
            }
        }


    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogoLivros.pesquisarPorAutor("Peter Jandl Junior"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2018));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Código Limpo"));



    }

}
