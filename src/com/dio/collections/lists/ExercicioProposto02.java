package src.com.dio.collections.lists;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        System.out.println("1 - Telefonou para a vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("2 - Esteve no local do crime?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("3 - Mora perto da vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("4 - Devia para a vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("5 - Já trabalhou com a vítima?");
        respostas.add(scan.next().toLowerCase());

        System.out.println(respostas);

        int cont = (int) respostas.stream().filter(resp -> resp.contains("s")).count();

        switch (cont) {
            case 2:
                System.out.println("SUSPEITA");
                break;
            case 3:
            case 4:
                System.out.println("CÚMPLICE");
                break;
            case 5:
                System.out.println("ASSASINO");
                break;
            default:
                System.out.println("INOCENTE");
                break;
        }
    }
}
