package OperacoesBasicas.List.OrdenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList = new ArrayList<>();
    public void adicionarPessoa (String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
            List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
    }
     public List<Pessoa> ordenarPorAltura(){
         List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
         Collections.sort(pessoasPorAltura, new comparatorPorAltura());
         return  pessoasPorAltura;
     }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Carlo", 17, 1.70);
        ordenacaoPessoa.adicionarPessoa("Joao", 19, 1.90);
        ordenacaoPessoa.adicionarPessoa("Maria", 89, 1.98);
        ordenacaoPessoa.adicionarPessoa("Joao", 60, 1.60);
        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

    }


}
