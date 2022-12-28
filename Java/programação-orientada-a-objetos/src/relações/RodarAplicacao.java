package relações;

public class RodarAplicacao {

  public static void main(String[] args) {

    Funcionario funcionario = new Funcionario(); // somente atribuindo uma variável para a classe

    // upcasts implicitos
    Funcionario gerente = new Gerente();
    Funcionario vendedor = new Vendedor();
    Funcionario faxineiro = new Faxineiro();

    // downcast explicito
    Vendedor vendedor_ = (Vendedor) new Funcionario();

  }

}
