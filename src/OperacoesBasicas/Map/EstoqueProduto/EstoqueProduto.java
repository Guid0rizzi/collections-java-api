package OperacoesBasicas.Map.EstoqueProduto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutosMap = new HashMap<>();

    public void adicionarProduto (long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }
    public void ExibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalDoEstoque (){
        double valorTotalestoque = 0;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto produto: estoqueProdutosMap.values()){
                valorTotalestoque += produto.getQuantidade()* produto.getPreco();
            }
        }

        return valorTotalestoque;
    }

    public Produto obterProdutoMaisCaro (){
        Produto produtoMaisCaro = null;
        double precoProdutoMaisCaro = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto produto: estoqueProdutosMap.values()){
                if (produto.getPreco() > precoProdutoMaisCaro){
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro = produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
        estoqueProduto.adicionarProduto(1, "Garrafa", 15.00, 12);
        estoqueProduto.adicionarProduto(21, "Macaco", 25.00, 12);
        estoqueProduto.adicionarProduto(45, "Rojão", 90.00, 12);
        estoqueProduto.ExibirProdutos();
        System.out.println(estoqueProduto.obterProdutoMaisCaro());
        System.out.println(estoqueProduto.calcularValorTotalDoEstoque());
    }
}
