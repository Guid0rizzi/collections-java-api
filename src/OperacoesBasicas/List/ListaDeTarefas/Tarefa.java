package OperacoesBasicas.List.ListaDeTarefas;

public class Tarefa {
    private String descricao;



    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;

    }

    public String getDescricao() {
        return descricao;
    }
}
