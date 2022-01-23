package src.com.dio.collections.sets;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private int ano;
    private String ide;

    public LinguagemFavorita() {
    }

    public LinguagemFavorita(String nome, int ano, String ide) {
        this.nome = nome;
        this.ano = ano;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return ano == that.ano && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano, ide);
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.nome.compareTo(o.nome);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.getAno(), lf2.getAno());
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
        int anoDeCriacao = Integer.compare(lf1.getAno(), lf2.getAno());
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}