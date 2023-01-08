// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class QuantidadeNecessaria {
  public static void main(String[] args) {
    final int SLICE = 4;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantiadade de Testes...");
    int T = scanner.nextInt();

    // TODO: Retorne o número de pizzas necessárias para atender o pedido.

    int nAmigos;
    int nFatias;
    double multiplicacao;
    double pizzas;

    for (int i = 1; i <= T; i++) {
      System.out.println("Digite a quantidade de amigos...");
      nAmigos = scanner.nextInt();
      System.out.println("Digite a quantidade de fatias...");
      nFatias = scanner.nextInt();
      multiplicacao = nAmigos * nFatias;
      pizzas = Math.ceil(multiplicacao / SLICE);

      System.out.println("A quantidade de pizza é " + (int) pizzas);

    }

  }
}