package Criacao;

public class Calculadora {

    public static void soma(double primeiroValor, double segundoValor) {

        double resultado = primeiroValor + segundoValor;

        System.out.println("O resultado da soma é: " + resultado);
    }

    public static void subtracao(double primeiroValor, double segundoValor) {
        double resultado = primeiroValor - segundoValor;

        System.out.println("O resultado da Subtração é: " + resultado);
    }

    public static void multiplicação(double primeiroValor, double segundoValor) {
        double resultado = primeiroValor * segundoValor;

        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    public static void divisao(double primeiroValor, double segundoValor) {
        double resultado = primeiroValor / segundoValor;

        System.out.println("O resultado da Divisão é: " + resultado);
    }
}
