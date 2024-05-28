package OperacoesBasicas.Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap = new HashMap<>();
    public void adicionarContato (String nome, Integer numero){
        agendaContatoMap.put(nome, numero);
    }
    public void removerContato (String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }

    }
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Leonardo", 1145632514);
        agendaContatos.adicionarContato("Maria", 1145632514);
        agendaContatos.adicionarContato("Roma", 1145632514);
        agendaContatos.adicionarContato("Leonardo", 55555999); //ele tira o antigo e atuliza de acordo com a chava
        agendaContatos.exibirContato();
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContato();
        System.out.println("O numero é "+ agendaContatos.pesquisarPorNome("Roma"));

    }
}
