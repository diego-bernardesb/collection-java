package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{

    private String nome;
    private long cod;
    private double preco;
    private int qtd;

    public Produto(String nome, long cod, double preco, int qtd) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "["+"nome='" + nome + '\'' +
                ", cod=" + cod +
                ", preco=" + preco +
                ", qtd=" + qtd + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
