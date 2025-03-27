package Ex04;

public class Conta {

	private Data _data_atual = new Data();

	private String _titular;
	private int _numeroConta;
	private String _agencia;
	private double _saldo;
	private String _dataAbertura;
	private double _rendimento;

	public String get_titular() {
		return this._titular;
	}

	public void set_titular(String _titular) {
		this._titular = _titular;
	}

	public int get_numeroConta() {
		return this._numeroConta;
	}

	public void set_numeroConta(int _numeroConta) {
		this._numeroConta = _numeroConta;
	}

	public double get_saldo() {
		return this._saldo;
	}

	public void set_saldo(double _saldo) {
		this._saldo = _saldo;
	}

	public String get_dataAbertura() {
		return this._dataAbertura;
	}

	public void set_dataAbertura(String _dataAbertura) {
		this._dataAbertura = _dataAbertura;
	}

	public String get_agencia() {
		return this._agencia;
	}

	public void set_agencia(String _agencia) {
		this._agencia = _agencia;
	}

	public double get_rendimento() {
		set_rendimento();
		return _rendimento;
	}

	public void set_rendimento() {
		this._rendimento = _saldo * 0.1;
	}



	public String definirData() {
		return _data_atual.concatena();
	}

	public void saca(double _valor) {
		_saldo -= _valor;
	}

	public void deposita(double _valor) {
		_saldo += _valor;
	}

	public void calculaRendimento() {
		System.out.println(String.format("\nO rendimento de sua conta é de %.2f",get_rendimento()));
	}

	public void recuperaDadosParaImpressao() {
		System.out.println("\nTitular: " + get_titular());
		System.out.println("\nNúmero da Conta: " + get_numeroConta());
		System.out.println("\nAgência: " + get_agencia());
		System.out.println("\nSaldo: " + get_saldo());
		System.out.println("\nData de Abertura da Conta: " + get_dataAbertura());
	}
}
