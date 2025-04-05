class Fibonacci:
	def __init__(self, numero: int):
		self.numero = numero

	def calcula_fibonacci(self, numero:int):
		"""
		if (numero == 0):
			return 0
		if (numero == 1):
			return 1

		return (self.calcula_fibonacci(numero - 1) + self.calcula_fibonacci(numero - 2))"
		"""

		return numero if numero <= 1 else self.calcula_fibonacci(numero - 1) + self.calcula_fibonacci(numero - 2)
