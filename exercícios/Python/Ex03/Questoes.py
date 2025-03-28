 # FIXAÇÃO DE SINTAXE
 # Artur Rodrigues Santos

def main():
	questao1.conta_ate_150()
	questao2.soma_de_1a1000()
	questao3.multiplos3()

# 1. Imprima todos os números de 150 a 300;
class questao1:
	def conta_ate_150():
		for x in range(150,301):
			print(x, end=" ")

# 2. Imprima a soma de 1 até 1000;
class questao2:
	def soma_de_1a1000():
		resultado = 0
		for x in range(1,1001):
			resultado += x

		print(resultado)


# 3. Imprima todos os múltiplos de 3, entre 1 e 100;
class questao3:
	def multiplos3():
		for x in range(0,101):
			if (x % 3 == 0):
				print(x, end=" ")

main()
