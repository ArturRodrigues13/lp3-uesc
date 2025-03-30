from Data import class_Data

class classe_Conta:

	data_atual = class_Data()

	def __init__(self, titular: str, saldo: float, numero_conta: int, agencia: str, data_da_abertura=None):
		self.titular = titular
		self.saldo = saldo
		self.numero_conta = numero_conta
		self.agencia = agencia

	data_da_abertura = data_atual.concatena()

	def get_titular(self) -> str:
		return self.titular

	def get_numero_conta(self) -> int:
		return self.numero_conta

	def get_agencia(self) -> str:
		return self.agencia

	def get_data_da_abertura(self) -> str:
		return self.data_da_abertura

	def get_saldo(self) -> float:
		return self.saldo

	def set_saldo(self, _saldo: float):
		self.saldo = _saldo

	def sacar(self, _valor: float):
		self.saldo -= _valor

	def depositar(self, _valor: float):
		self.saldo += _valor

	def calcula_rendimento(self):
		return self.saldo * 0.1

	def imprime_dados(self):
		print("O titular dessa Conta é: " + self.titular)
		print("Seu saldo é de: {}".format(self.saldo))
		print("O numero da Conta é: {}".format(self.numero_conta))
		print("A agencia da Conta é: " + self.agencia)
		print("A data de sua abertura foi em: " + self.data_da_abertura)
