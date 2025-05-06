class Funcionario:
	def calcularBonus(self):
		return 500.0

class Gerente(Funcionario):
	def calcularBonus(self):
		return 2000.0

class Operador(Funcionario):
	def calcularBonus(self):
		return 1000.0


def main():

	funcionarios: Funcionario = [Funcionario(),Gerente(),Operador()]
	for i in funcionarios:
		print(f"Bônus: R$ {i.calcularBonus()}")

main()
