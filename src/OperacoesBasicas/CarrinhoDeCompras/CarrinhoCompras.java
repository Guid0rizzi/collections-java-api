package OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item>  carrinhoCompras = new ArrayList<>();
    public void adicionarItem(Item item){
        carrinhoCompras.add(item);
    }
    public void deletarItem(String nomeItem){
        List<Item> ItensParaRemover = new ArrayList<>();
        for (Item item: carrinhoCompras){
            if (item.getNome().equalsIgnoreCase(nomeItem)){
                ItensParaRemover.add(item);
            }
        }
        carrinhoCompras.removeAll(ItensParaRemover);
    }
    public double resultadoCompra() {
        double soma = 0;
        for (Item item : carrinhoCompras) {
            soma += item.preco;
        }
        return soma;
    }
    public int listaCompras(){
        return carrinhoCompras.size();
    }

    public static void main(String[] args) {
        Item item = new Item("Sorvete", 15.0, 2 );
        Item item2 = new Item("Maionese", 15.0, 2 );
        CarrinhoCompras carrinhoCompras1 = new CarrinhoCompras();
        carrinhoCompras1.adicionarItem(item);
        carrinhoCompras1.adicionarItem(item2);
        carrinhoCompras1.deletarItem("Maionese");
        System.out.println(carrinhoCompras1.listaCompras());
        System.out.println(carrinhoCompras1.resultadoCompra());

    }

}
