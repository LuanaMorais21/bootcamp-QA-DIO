package edu.luana.metodos;

public class Usuario {
  public static void main(String[] args) {

    SmartTv smartTv = new SmartTv();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();

    System.out.println("Qual o Canal atual? " + smartTv.canal);

    smartTv.mudarCanal(13);

    System.out.println("Qual o Canal atual? " + smartTv.canal);

    System.out.println("Qual o volume? " + smartTv.volume);

    System.out.println("A TV está ligada? " + smartTv.ligada);
    System.out.println("Qual o Canal atual? " + smartTv.canal);
    System.out.println("Qual o volume? " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Novo status: A TV está ligada? " + smartTv.ligada);

    smartTv.desligada();
    System.out.println("Novo status: A TV está ligada? " + smartTv.ligada);

  }

}
