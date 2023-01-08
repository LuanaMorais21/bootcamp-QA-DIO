// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;
import java.util.Arrays;

public class DiferencaEntreDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        // TODO: Retorne a diferença entre o produto e a soma dos dígitos.

        int produto = 1;

        int soma = 0;

        for (int x = 0; x < ints.length; x++) {

            produto *= ints[x];

            soma += ints[x];

        }

        System.out.println(produto - soma);

    }
}
