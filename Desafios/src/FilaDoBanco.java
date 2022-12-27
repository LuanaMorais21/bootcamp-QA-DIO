// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class FilaDoBanco {

  public static void main(String[] args) {

    String[] nomesFila = new String[3];
    Scanner nome = new Scanner(System.in);

    // TODO: Implemente uma condição que simule uma fila bancaria, gerando o nome a
    // posição do cliente na fila:
    int count = 1;

    do {
      String cliente = nome.next();
      String cliente2 = nome.next();
      String cliente3 = nome.next();

      System.out.println(cliente + " - esta na posicao: " + (count++));
      System.out.println(cliente2 + " - esta na posicao: " + (count++));
      System.out.println(cliente3 + " - esta na posicao: " + (count++));

    } while (count >= 0 && count <= nomesFila.length);

  }
}
