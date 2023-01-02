package lists.exemplos;

import java.util.*;

class ExemploList1 {
  public static void main(String[] args) {
    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

    // Crie uma lista e adicione as sete notas
    System.out.println("Crie uma lista e adicione as sete notas: ");

    List<Double> notas = new ArrayList<Double>(); // Generics(jdk 5) - Diamond Operator(jdk 7)
    notas.add(7.0);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5.0);
    notas.add(7.0);
    notas.add(0.0);
    notas.add(3.6);
    System.out.println(notas.toString());

    // Exiba a posição da nota: 5.0
    System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

    // Adicione na lista a nota 8.0 na posição 4
    System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
    notas.add(4, 8d);
    System.out.println(notas);

    // Substitua a nota 5.0 pela nota 6.0
    System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
    notas.set(notas.indexOf(5d), 6.0);
    System.out.println(notas);

    // Confira se a nota 5.0 está na lista
    System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

    // Exiba todas as notas na ordem em que foram informadas
    /*
     * System.out.println("Exiba todas as notas na ordem em que foram informados: "
     * );
     * for (Double nota : notas)
     * System.out.println(nota);
     */

    // Exiba a terceira nota adicionada
    System.out.println("Exiba a terceira nota adiciona: " + notas.get(2));

    // Exiba a menor nota
    System.out.println("Exiba a menor nota: " + Collections.min(notas));

    // Exiba a maior nota
    System.out.println("Exiba a maior nota: " + Collections.max(notas));

    // Exiba a soma dos valores
    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
      Double next = iterator.next();
      soma += next;
    }
    System.out.println("Exiba a soma dos valores: " + soma);

    // Exiba a média das notas
    System.out.println("Exiba a média das notas: " + (soma / notas.size()));

    // Remova a nota 0
    System.out.println("Remova a nota 0: ");
    notas.remove(0d);
    System.out.println(notas);

    // Remova a nota da posição 0
    System.out.println("Remova a nota da posição 0: ");
    notas.remove(0);
    System.out.println(notas);

    // Remova as notas menores que 7 e exiba a lista
    System.out.println("Remova as notas menores que 7 e exiba a lista: ");
    Iterator<Double> iterator1 = notas.iterator();
    while (iterator1.hasNext()) {
      Double next = iterator1.next();
      if (next < 7)
        iterator1.remove();
    }
    System.out.println(notas);

    // Apague toda a lista

    System.out.println("Apague toda a lista");
    notas.clear();
    System.out.println(notas);

    // Confira se a lista está vazia
    System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

  }
  /*
   * Para você: Resolva esses exercícios utilizando os métodos da implementação
   * LinkedList:
   * System.out.println("Crie uma lista chamada notas2 " +
   * "e coloque todos os elementos da list Arraylist nessa nova lista: ");
   * System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
   * System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
   */

  // RESOLVIDO EM: src\lists\exercicios\ExercicioList.java

}