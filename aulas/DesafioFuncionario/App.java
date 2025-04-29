package DesafioFuncionario;

public class App {

	public static void main(String[] args) {
		Gerente artur = new Gerente("Artur", 7000, 1000);

		artur.exibirDados();

		System.out.println("----------------------------");

		Funcionario ronaldo = new Funcionario("Ronaldo Ronaldo Ronaldo Ronaldo", 1000000);

		ronaldo.exibirDados();
	}
}
