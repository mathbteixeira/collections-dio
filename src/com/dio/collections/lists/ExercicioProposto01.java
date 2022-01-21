package src.com.dio.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioProposto01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        //int count = 0;
        for(int i = 1; i <= 6; i++) {
            System.out.println("Digite a temperatura média do mês " + i + ": ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
        }
        System.out.println("---------------------------");

        //exibindo todas as temperaturas:
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));

        //calculando e exibindo a média das temperaturas:
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        // mostrando as temperaturas acima da média
        System.out.println("Temperaturas acima da média:");
        temperaturas.stream()
                .filter(temp -> temp > media)
                .forEach(temp -> System.out.printf("%.1f ", temp));

        //exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");

        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media) {
                switch (i) {
                    case 0:
                        System.out.println("1 - Janeiro");
                        break;
                    case 1:
                        System.out.println("2 - Fevereiro");
                        break;
                    case 2:
                        System.out.println("3 - Março");
                        break;
                    case 3:
                        System.out.println("4 - Abril");
                        break;
                    case 4:
                        System.out.println("5 - Maio");
                        break;
                    case 5:
                        System.out.println("6 - Junho");
                        break;
                    default:
                        break;
                }

            }
        }
    }

}
