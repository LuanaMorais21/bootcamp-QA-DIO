package exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionPersonalizada1 {
  public static void main(String[] args) {
    String nomeDoArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo a ser exibido: ");

    imprimirArquivoNoConsole(nomeDoArquivo);
    System.out.println("\nCom exception ou não, o programa continua...");
  }

  private static void imprimirArquivoNoConsole(String nomeDoArquivo) {

    try {
      BufferedReader br = lerArquivo(nomeDoArquivo);
      String line = br.readLine();
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      do {
        bw.write(line);
        bw.newLine();
        line = br.readLine();

      } while (line != null);
      bw.flush();
      br.close();

    } catch (ImpossivelAberturaDeArquivoException e) {
      JOptionPane.showMessageDialog(null,
          e.getMessage());
      // e.printStackTrace();
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null,
          "Ocorreu um erro inesperado! Entre em contato com o Suporte. " + "\n" + ex.getCause());
      ex.printStackTrace();
    }

  }

  public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
    File file = new File(nomeDoArquivo);
    try {
      return new BufferedReader(new FileReader(nomeDoArquivo));
    } catch (FileNotFoundException e) {
      throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
    }
  }
}

class ImpossivelAberturaDeArquivoException extends Exception {
  private String nomeDoArquivo;
  private String diretorio;

  public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
    super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretorio " + diretorio);
    this.nomeDoArquivo = nomeDoArquivo;
    this.diretorio = diretorio;
  }

  /*
   * @Override
   * public String toString() {
   * return "ImpossivelAberturaDeArquivoException [nomeDoArquivo=" + nomeDoArquivo
   * + ", diretorio=" + diretorio + "]";
   * }
   */

}
