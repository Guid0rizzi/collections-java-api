package OperacoesBasicas.Set.ListaDeConvidados;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigo;



    public Convidado(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigo() == convidado.getCodigo();  // esse metodo faz com que o codigo do do convite
                                                      // n se repita
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
