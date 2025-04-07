public class Cliente {

	private String nome;
	private String CPF;
	private Data data_nascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String _CPF) {
		this.CPF = _CPF;
	}

	public Data getDataNascimento() {
		return data_nascimento;
	}

	public void setDataNascimento(Data _dataNascimento) {
		this.data_nascimento = _dataNascimento;
	}

	public Cliente(String _nome, String _CPF, Data _data_nascimento) {
		this.nome = _nome;
		this.CPF = _CPF;

		_data_nascimento.dataValida(_data_nascimento);
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
