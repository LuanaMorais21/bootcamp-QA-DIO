package lists.exercicios;
/*
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
 * sobre um crime. As perguntas são:
 * "Telefonou para a vítima?"
 * "Esteve no local do crime?"
 * "Mora perto da vítima?"
 * "Devia para a vítima?"
 * "Já trabalhou com a vítima?"
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada
 * como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso
 * contrário, ela será classificado como "Inocente".
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class ExercicioProposto2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<String> respostas = new ArrayList<>();

    System.out.println("Responda as seguintes perguntas, usando 'S' para Sim, e 'N' para não");
    System.out.println("Telefonou para a vítima? ");
    String resposta = scan.next();
    System.out.println("Esteve no local do crime? ");
    resposta = scan.next();
    System.out.println("Mora perto da vítima? ");
    resposta = scan.next();
    System.out.println("Devia para a vítima?");
    resposta = scan.next();
    System.out.println("Já trabalhou com a vítima?");
    resposta = scan.next();

    System.out.println(respostas);

    int count = 0;
    Iterator<String> contador = respostas.iterator();
    while (contador.hasNext()) {
      String resp = contador.next();
      if (resp.contains("s")) {
        count++;
      }
    }

    switch (count) {
      case 2:
        System.out.println(">> SUSPEITA <<");
        break;
      case 3:
      case 4:
        System.out.println(">> CÚMPLICE <<");
        break;
      case 5:
        System.out.println(">> ASSASSINO <<");
        break;
      default:
        System.out.println(">> INOCENTE <<");
        break;
    }

  }

}
