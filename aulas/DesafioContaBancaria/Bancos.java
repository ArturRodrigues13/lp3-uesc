public class Bancos {

	public String name;
	public static int contas = 0;

	public static void adicionarConta() {

		contas++;

	}

	public static int quantidadeDeContas(){

		return contas;

	}

}
