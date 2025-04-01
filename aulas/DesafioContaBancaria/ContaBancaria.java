public class ContaBancaria {

	private String _titular;
	private double _saldo;

	public ContaBancaria(String _nome) {
		_titular = _nome;
		_saldo = 0;
		Bancos.adicionarConta();
	}

	public String get_titular() {
		return _titular;
	}

	public void set_titular(String _titular) {
		this._titular = _titular;
	}

	public double get_saldo() {
		return _saldo;
	}

	public void set_saldo(double _saldo) {
		this._saldo = _saldo;
	}

	public void ExibirInformacoes() {
		System.out.println("\nO Titular dessa Conta é: " + _titular);
		System.out.println("Seu saldo é de: " + _saldo);
	}

	public void Depositar(double _deposito) {
		if(_deposito <= 0) {
			System.out.println("Depósito Inválido");
		}
		else {
			set_saldo(_saldo + _deposito);
			System.out.println("\nForam depositados " + _deposito + " em sua Conta!");
		}
	}

	public void Sacar(double _saque) {
		if(_saque > _saldo) {
			System.out.println("Saldo não suficiente");
		}
		else {
			set_saldo(_saldo - _saque);
			System.out.println("\nForam retirados " + _saque + " da sua Conta!");
		}
	}

	public void Tranferir(ContaBancaria _contaDestino, double _valor) {
		if (_saldo < _valor) {
			System.out.println("Valor Inválido");
		} else {
			_contaDestino.Depositar(_valor);
			this.Sacar(_valor);
		}
	}

}
