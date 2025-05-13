from abc import ABC, abstractmethod

class Pagamento(ABC):
	def __init__(self,valor):
		self.valor = valor

	@abstractmethod
	def processar():
		pass

class CartaoCredito(Pagamento):
	def __init__(self, numero, valor):
		self.numero = numero
		self.valor = valor

	def processar(self):
		print(f"Pagamento de cartão com numero {self.numero} com o valor de {self.valor} feito com sucesso")


class Boleto(Pagamento):
	def __init__(self, codigo, valor):
		self.codigo = codigo
		self.valor = valor

	def processar(self):
		print(f"Pagamento de Boleto de código {self.codigo} com o valor de {self.valor} feito com sucesso")

class Pix(Pagamento):
	def __init__(self, chave, valor):
		self.chave = chave
		self.valor = valor

	def processar(self):
		print(f"Pagamento de Pix de chave {self.chave} com o valor de {self.valor} feito com sucesso")


cc = CartaoCredito(99991111,1000)
b = Boleto(9291,2000)
p = Pix("109.762.545-14",10000)

cc.processar()
b.processar()
p.processar()
