package OperacoesBasicas.Map.EstoqueProduto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return "Produto{" +
                 nome +","+ preco +","+ quantidade +
                '}';
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }




}
