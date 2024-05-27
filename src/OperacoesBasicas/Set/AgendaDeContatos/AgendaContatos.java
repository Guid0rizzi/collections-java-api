package OperacoesBasicas.Set.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> setContatos = new HashSet<>();

    public void adicionarContato(String nome, int numero){
        setContatos.add(new Contato(numero, nome));
    }
    public Set<Contato> pesquisarPorNome(String nome ){
        Set<Contato>  contatosPorNome = new HashSet<>();
        for (Contato contato : setContatos){
            if (contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato (int Novonumero, String nome){
        Contato numeroAtualizado = null;
        for (Contato contato : setContatos){
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(Novonumero);
                numeroAtualizado = contato;
                break;
            }
        }
        return  numeroAtualizado;
    }

    public void exibirContatos (){
        System.out.println(setContatos);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Leonardo", 1198562);
        agendaContatos.adicionarContato("Leonardo", 1198562);
        agendaContatos.adicionarContato("Romel", 11985452);
        agendaContatos.adicionarContato("Alice", 1198451);

        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Leonardo");
        agendaContatos.atualizarNumeroContato(1156525555, "Leonardo");
        agendaContatos.exibirContatos();
    }
}
