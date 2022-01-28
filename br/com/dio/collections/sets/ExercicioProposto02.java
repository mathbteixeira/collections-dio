package br.com.dio.collections.sets;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "IntelliJ"));

        System.out.println("--- Ordem de inserção: ---");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new LinkedHashSet<>(minhasLinguagensFavoritas);
        minhasLinguagensFavoritas2.forEach(System.out::println);

        System.out.println("--- Ordem natural(nome): ---");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<>(minhasLinguagensFavoritas);
        minhasLinguagensFavoritas3.forEach(System.out::println);

        System.out.println("--- Ordem IDE: ---");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        minhasLinguagensFavoritas4.forEach(System.out::println);

        System.out.println("--- Ordem Ano de criação e Nome: ---");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas);
        minhasLinguagensFavoritas5.forEach(System.out::println);

        System.out.println("--- Ordem Nome, Ano de criação e IDE: ---");
        Set<LinguagemFavorita> minhasLinguagensFavoritas6 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas6.addAll(minhasLinguagensFavoritas);
        minhasLinguagensFavoritas6.forEach(System.out::println);
    }
}
