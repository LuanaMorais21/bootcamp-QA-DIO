package edu.luana.operadores;

public class Operadores {

  public static void main(String[] args) {
    // ATRIBUIÇÃO
    String nomeCompleto = "LINGUAGEM" + "JAVA";

    System.out.println(nomeCompleto);

    // ARITMÉTICOS
    String concatenacao = "?";

    concatenacao = 1 + 1 + 1 + "1"; // resultado 31, soma os três primeiros e concatena com o texto 1

    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + 1; // resultado 1111, soma o primeiro, a partir do segundo endende que é um texto e
                                    // concatena como texto o restante

    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + "1"; // resultado 1111, mesma lógica acima

    System.out.println(concatenacao);

    concatenacao = "1" + 1 + 1 + 1; // resultado 1111, mesma lógica de concatenação de texto

    System.out.println(concatenacao);

    concatenacao = "1" + (1 + 1 + 1); // resultado 13, aqui soma primeiro e depois a concatenação.

    System.out.println(concatenacao);

    // UNÁRIOS
    // classe Operadores.java
    int numero = 5;

    // Imprimindo o numero negativo.. somente imprime o número negativo, a variável
    // não muda
    System.out.println(-numero);

    // numero = numero * -1; forma de transformar o número negativo

    // incrementando numero em mais 1 numero, imprime 6
    numero++; // o mesmo que numero = numero +1;
    System.out.println(numero);

    // incrementando numero em mais 1 numero, imprime 7
    System.out.println(numero++);// ops algo de errado não está certo

    System.out.println(numero);// agora sim, numero virou 7

    System.out.println(numero);// agora vira 8 pq incrementou de novo

    // ordem de precedencia conta aqui
    System.out.println(++numero);
    System.out.println(++numero);

    boolean verdadeiro = true;

    System.out.println("Inverteu " + !verdadeiro);

    // TERNÁRIO

    int a, b;

    a = 5;
    b = 6;

    /*
     * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
     * if(a==b)
     * resultado = "verdadeiro";
     * else
     * resultado = "falso";
     */

    // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
    String resultado = (a == b) ? "verdadeiro" : "false";

    System.out.println(resultado);

    // RELACIONAIS
    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if (numero1 > numero2)
      System.out.println("Numero 1 maior que numero 2" + simNao);

    simNao = numero1 != numero2;

    if (numero1 < numero2)
      System.out.println("Numero 1 menor que numero 2" + simNao);

    simNao = numero1 > numero2;

    if (numero1 >= numero2)
      System.out.println("Numero 1 maior ou igual que numero 2" + simNao);

    simNao = numero1 >= numero2;

    if (numero1 <= numero2)
      System.out.println("Numero 1 menor ou igual que numero 2" + simNao);

    simNao = numero1 < numero2;

    if (numero1 != numero2)
      System.out.println("Numero 1 é diferente de numero 2" + simNao);

    String nome1 = "Yoda";
    String nome2 = "Yodinha";

    System.out.println(nome1.equals(nome2));

    // LÓGICOS
    boolean condicao1 = true;

    boolean condicao2 = false;

    if (condicao1 && condicao2)
      System.out.print("Os dois valores precisam ser verdadeiros");
    /*
     * Aqui estamos utilizando o operador lógico E para fazer a união de duas
     * expressões.
     * É como se estivesse escrito:
     * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
     */

    if (condicao1 || condicao2)
      System.out.print("Um dos valores precisa ser verdadeiro");
    // Se condicao1 OU condicao2 for verdadeira, executar código.

  }

}