package edu.luana.primeirasemana;

public class MinhaClasse {

  public static void main(String[] args) {

    System.out.print("Olá, mundo!");

    String primeiroNome = "Luana";
    String segundoNome = "Morais";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.print(nomeCompleto);

  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {

    return "\nMeu nome é " + primeiroNome.concat(" ").concat(segundoNome) + ".";
  }

}
