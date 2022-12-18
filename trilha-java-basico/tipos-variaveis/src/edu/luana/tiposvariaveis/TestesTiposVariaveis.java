package edu.luana.tiposvariaveis;

public class TestesTiposVariaveis {
  // teste de utilização de tipos e variaveis, tendo como exemplo uma avaliação de
  // filme
  public static void main(String[] args) {
    // tipos primitivos

    byte idade = 30;
    short anoCadastro = 2022;
    int codigoIdentificador = 566845;
    long telefone = 980705679;
    char aceitaContato = 'Y';
    boolean cadastroAtivo = true;
    float avaliacao = 9.8F;
    double valor = 38.00;

    // strings

    String nome = "Luke";
    String sobrenome = "Skywalker";
    String filme = "Star Wars - O Imprério contra ataca";

    // imprimindo

    System.out.print("Cliente: " + nome + " " + sobrenome + " ID: " + codigoIdentificador);
    System.out.print("\nIdade: " + idade);
    System.out.print("\nClientes desde: " + anoCadastro);
    System.out.print("\nAssistiu o filme: " + filme);
    System.out.print("\nAvaliação do filme: " + avaliacao);
    System.out.print("\nValor do Ingresso: " + valor);
    System.out.print("\nTem cadastro ativo? " + cadastroAtivo + "." + " Aceita contato posteriores? " + aceitaContato);

  }

}
