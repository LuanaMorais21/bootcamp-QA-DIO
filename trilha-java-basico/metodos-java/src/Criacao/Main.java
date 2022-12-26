package Criacao;

public class Main {

  public static void main(String[] args) {

    // Calculadora
    System.out.println("Exercício Calculadora!");
    Calculadora.soma(5, 3.5);
    Calculadora.subtracao(5, 3.5);
    Calculadora.multiplicação(5, 3.5);
    Calculadora.divisao(5, 2);

    // Hora
    System.out.println("Exercício Mensagem!");
    Mensagem.obterMensagem(100);
    Mensagem.obterMensagem(9);
    Mensagem.obterMensagem(15);
    Mensagem.obterMensagem(2);

    // Empréstimo
    System.out.println("Exercício Empréstimo!");
    Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
    Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
    Emprestimo.calcular(1000, 5);

  }

}