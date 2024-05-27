package OperacoesBasicas.Set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet = new HashSet<>();
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }
    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); //comparable (novo set de produto organizado
        return produtosPorNome;                         // pelo nome) usando TreeSet
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new comparePorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public void exibirTodosProdutos (){
        System.out.println(produtoSet);
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1, "Produto A", 50.0, 10);
        cadastroProduto.adicionarProduto(2, "Produto D", 20.0, 20);
        cadastroProduto.adicionarProduto(3, "Produto D", 30.0, 15);
        cadastroProduto.adicionarProduto(4, "Produto B", 40.0, 5);
        cadastroProduto.exibirTodosProdutos();
        System.out.println(cadastroProduto.exibirProdutoPorNome());
        System.out.println(cadastroProduto.exibirProdutoPorPreco());
    }
}
