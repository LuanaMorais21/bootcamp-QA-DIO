package exceptions;

import javax.swing.*;

// Fazer divisão de dois valores inteiros

public class UncheckedException {
  public static void main(String[] args) {

    boolean continueLooping = true;
    do {
      String a = JOptionPane.showInputDialog("Numerador: ");
      String b = JOptionPane.showInputDialog("Denominador: ");

      try {
        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        continueLooping = false;

        System.out.println("Resultado: " + resultado);
      } catch (NumberFormatException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Entrada inválida! Informe um número inteiro! " + e.getMessage());
      } catch (ArithmeticException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Impossível divivir um número por 0!");
      } finally {
        System.out.println("Chegou no finally!");
      }

    } while (continueLooping);

    System.out.println("O código continua...");

  }

  private static int dividir(int a, int b) {
    return a / b;
  }

}
