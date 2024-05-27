package OperacoesBasicas.Set.AgendaDeContatos;

import java.util.Objects;

public class Contato {
    private int numero;
    private String nome;


    public int getNumero() {
        return numero;
    }
    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public Contato(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return numero == contato.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                '}';
    }
}
