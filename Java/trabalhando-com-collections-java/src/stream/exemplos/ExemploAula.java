package stream.exemplos;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.swing.event.SwingPropertyChangeSupport;

public class ExemploAula {

  public static void main(String[] args) {

    List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

    System.out.println("Imprima todos os elementos dessa lista de String: ");
    numerosAleatorios.stream()
        .forEach(s -> System.out.println(s));

    System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
    numerosAleatorios.stream()
        .limit(5)
        .collect(Collectors.toSet())
        .forEach(System.out::println);

    System.out.println("Transforme esta lista em uma lista de números inteiros. ");
    numerosAleatorios.stream()
        .map(s -> Integer.parseInt(s))
        .collect(Collectors.toList())
        .forEach(System.out::println);

    System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
    List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
    System.out.println(listParesMaioresQue2);

    System.out.println("Mostre a média do números: ");
    numerosAleatorios.stream()
        .mapToInt(s -> Integer.parseInt(s))
        .average()
        .ifPresent(v -> System.out.println(v));

  }

}
