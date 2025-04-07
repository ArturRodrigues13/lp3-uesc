public class ContaBancaria {

	private double _saldo;
	private Data data_abertura;
	private Data data_atual;
	private Cliente _titular;

	public ContaBancaria(Cliente _titular) {
		this._titular = _titular;
		_saldo = 0;
		data_abertura = new Data();
		Bancos.adicionarConta();
	}

	public String get_titular() {
		return _titular.getNome();
	}

	public void set_titular(String _titular) {
		this._titular.setNome(_titular);
	}

	public double get_saldo() {
		return _saldo;
	}

	public void set_saldo(double _saldo) {
		this._saldo = _saldo;
	}

	public String data_atual() {
		data_atual = new Data();
		return data_atual.toString();
	}


	public void ExibirInformacoes() {
		System.out.println("\nO Titular dessa Conta é: " + _titular.getNome());
		System.out.println("\nSeu CPF é: " + _titular.getCPF());
		System.out.println("\nSua data de nascimento é: " + _titular.getDataNascimento().toString());
		System.out.println("Sua idade é: " + _titular.getIdade(_titular.getDataNascimento()));
		System.out.println("Seu saldo é de: " + _saldo);
		System.out.println("Sua conta foi aberta em: " + data_abertura);
	}

	public void Depositar(double _deposito, Data dataDeposito) {
		if(_deposito <= 0) {
			System.out.println("Depósito Inválido");
		}
		else {
			set_saldo(_saldo + _deposito);
			System.out.println("\nForam depositados " + _deposito + " em sua Conta!");
			System.out.println("Operação realizada em: " + dataDeposito.toString());
		}
	}

	public void Depositar(double _deposito) {
		Depositar(_deposito, new Data());
	}

	public void Sacar(double _saque, Data dataSaque) {
		if(_saque > _saldo) {
			System.out.println("Saldo não suficiente");
		}
		else {
			set_saldo(_saldo - _saque);
			System.out.println("\nForam retirados " + _saque + " da sua Conta!");
			System.out.println("Operação realizada em: " + dataSaque);
		}
	}

	public void Sacar(double _saque) {
		Sacar(_saque, new Data());
	}

	public void Tranferir(ContaBancaria _contaDestino, double _valor) {
		if (_saldo < _valor) {
			System.out.println("Valor Inválido");
		} else {
			_contaDestino.Depositar(_valor);
			this.Sacar(_valor);
			System.out.println("Operação realizada em: " + data_atual());
		}
	}

}
