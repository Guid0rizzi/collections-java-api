package OperacoesBasicas.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogosLivros {
    private List<Livro> livroList = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livro: livroList){
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicio, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro: livroList ){
                if (livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao()<= anoFinal){
                    livrosPorAno.add(livro);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro livro : livroList){
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String args[]){
        CatalogosLivros catalogosLivros = new CatalogosLivros();
        catalogosLivros.adicionarLivro("O rei casado", "Luis inacio", 1990);
        catalogosLivros.adicionarLivro("O rei casado", "Luis inacio", 1990);
        catalogosLivros.adicionarLivro("O rei casado", "Luis inacio", 2019);
        catalogosLivros.adicionarLivro("O fela da mãe", "João jagunsso", 2020);
        catalogosLivros.adicionarLivro("O fela da mãe", "Maria joana", 2021);
        System.out.println(catalogosLivros.pesquisarPorAutor("João jagunsso"));
        System.out.println(catalogosLivros.pesquisarPorAutor("Luis inacio"));
        System.out.println(catalogosLivros.pesquisarPorIntervaloDeAno(1990, 2020));
        System.out.println(catalogosLivros.pesquisarPorTitulo("O rei casado"));
    }

}

