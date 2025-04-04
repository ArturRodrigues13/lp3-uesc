public class Cliente {

	String nome;
	String CPF;
	Data data_nascimento;

	public Cliente(String _nome, String _CPF, Data _data_nascimento) {
		this.nome = _nome;
		this.CPF = _CPF;
		this.data_nascimento = _data_nascimento;
	}

	public int getIdade(Data _data_cliente) {

		Data data_atual = new Data();

		int idade = data_atual.getAno() - _data_cliente.getAno();

		if (data_atual.getMes() > _data_cliente.getMes())
			return idade;
		else if (data_atual.getDia() > _data_cliente.getDia())
			return idade;
		else
			return idade - 1;

	}
}
