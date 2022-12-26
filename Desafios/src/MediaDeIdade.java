
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class MediaDeIdade {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int idade1 = leitor.nextInt();
    int idade2 = leitor.nextInt();
    int idade3 = leitor.nextInt();

    // TODO: Implemente um condição de verifique a média de idade da turma conforme
    // a descrição do desafio:
    double media = (idade1 + idade2 + idade3) / 3;

    if (media > 0 & media <= 25) {
      System.out.println("Jovem!");
    } else if (media > 26 & media <= 60) {
      System.out.println("Adulta!");
    } else {
      System.out.println("Idosa!");
    }

  }
}