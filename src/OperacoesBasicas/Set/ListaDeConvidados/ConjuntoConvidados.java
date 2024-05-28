package OperacoesBasicas.Set.ListaDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado>  convidadosSet = new HashSet<>();

    public void adicionarConvidado (String nome, int codigo){
        convidadosSet.add(new Convidado(nome, codigo));
    }
    public void convidadoParaRemover (int codigo){
        Convidado convidadoParaRemover = null;
        for (Convidado convidado: convidadosSet){
            if (convidado.getCodigo() == codigo){
                convidadoParaRemover = convidado;
                break;
            }
        }
         convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
       return convidadosSet.size();
    }
    public void exibirListaDeConvidados(){
         System.out.println(convidadosSet);
    };

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Leonardo", 152144);
        conjuntoConvidados.adicionarConvidado("Geovanna", 152149);
        conjuntoConvidados.adicionarConvidado("Amanda", 152149);
        conjuntoConvidados.adicionarConvidado("Moises", 152147);
        System.out.println("Existe "+conjuntoConvidados.contarConvidados()+" covidados na lista");
        conjuntoConvidados.exibirListaDeConvidados();
    }
}
