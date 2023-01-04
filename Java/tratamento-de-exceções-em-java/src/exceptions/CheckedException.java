package exceptions;

import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console
public class CheckedException {
  public static void main(String[] args) {
    String nomeDoArquivo = "livros.txt";

    try {
      imprimirArquivoNoConsole(nomeDoArquivo);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      JOptionPane.showMessageDialog(null,
          "Revise o nome do arquivo que você deseja imprimir! " + "\n" + e.getLocalizedMessage());
    } catch (IOException e) {
      JOptionPane.showMessageDialog(null,
          "Ocorreu um erro inesperado! Entre em contato com o Suporte. " + "\n" + e.getCause());
      e.printStackTrace();
    } finally {
      System.out.println("Chegou no finally!");
    }

    System.out.println("Apesar da Exception ou não, o programa continua...");
  }

  private static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
    File file = new File(nomeDoArquivo);

    BufferedReader br = new BufferedReader(new FileReader(file.getName()));
    String line = br.readLine();

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    do {
      bw.write(line);
      bw.newLine();
      line = br.readLine();

    } while (line != null);
    bw.flush();
    br.close();

  }

}
