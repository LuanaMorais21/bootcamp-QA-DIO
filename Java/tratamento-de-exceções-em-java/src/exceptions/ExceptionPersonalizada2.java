package exceptions;

import javax.swing.JOptionPane;

public class ExceptionPersonalizada2 {
  public static void main(String[] args) {
    int[] numerador = { 4, 5, 8, 10 };
    int[] denominador = { 2, 4, 0, 2, 8 };

    for (int i = 0; i < denominador.length; i++) {
      try {
        if (numerador[i] % 2 != 0)
          throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

        int resultado = numerador[i] / denominador[i];
        System.out.println(resultado);
      } catch (DivisaoNaoExataException e) {
        // e.printStackTrace();
        JOptionPane.showMessageDialog(null, e.getMessage());
      } catch (ArithmeticException ex) {
        // ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Não é possível realizar a divisão por 0! " + ex.getLocalizedMessage());
      } catch (ArrayIndexOutOfBoundsException exx) {
        // exx.printStackTrace();
        JOptionPane.showMessageDialog(null,
            "Não é possível realizar a divisão, pois não foi informado um numerador! " + exx.getLocalizedMessage());
      }

    }
    System.out.println("O programa continua...");
  }

}
