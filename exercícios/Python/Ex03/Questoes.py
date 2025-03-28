 # FIXAÇÃO DE SINTAXE
 # Artur Rodrigues Santos

def main():

	print("Olá, bem vindo ao menu de questões do exercício 3!!!")
	print("1. Impressão dos números de 150 a 300")
	print("2. Soma de 1 até 1000")
	print("3. Múltiplos de 3 entre 1 e 100")
	print("4. Fatoriais de 1 a 10")
	print("5. Fibonacci até 100")
	print("6. Brincadeira com o X")
	print("7. Tabela de Multiplicação")
	print("8. Fibonacci com duas variáveis")
	print("Digite o valor para a questão que você deseja executar: ", end="")
	escolha = int(input())

	match (escolha):
		case 1:
			questao1.conta_ate_150()
		case 2:
			questao2.soma_de_1a1000()
		case 3:
			questao3.multiplos3()
		case 4:
			questao4.fatorial_1a10()
		case 5:
			questao5.fibonacci()
		case 6:
			questao6.brincadeira()
		case 7:
			questao7.tabela()
		case 8:
			questao8.fibonacci_2variavel()


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


# 4. Imprima os fatoriais de 1 a 10;
class questao4:

	def fatorial_1a10():
		soma = 1
		for n in range(1,11):
			soma *= n
			print(f"Fatorial de {n} é igual a {soma}")
			#for y in range(x - 1,0,-1):
				#soma = soma * y


# 5. Imprima os primeiros números da série de Fibonacci até passar de 100.
class questao5:

	def fibonacci():

		soma = 1
		fibonacci1 = 0
		fibonacci2 = 0

		for n in range(0,16):
			if(n == 0):
				soma = 0
			if(n == 1):
				soma = 1
			if(n > 1):
				fibonacci1 = fibonacci2
				fibonacci2 = soma
				soma = fibonacci1 + fibonacci2

			print(f"Fibonacci de {n} é igual a {soma}")


# 6. Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:

# @ Se x é par, x = x / 2;
# @ Se x é impar, x = 3 * x + 1;
# @ O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13, a saída será:
	# 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
class questao6:

	def brincadeira():
		print("Me dê um valor para fazer a brincadeira: ",end="")
		x = int(input())
		while( x != 1):
			if(x % 2 == 0):
				x //= 2
			else:
				x = 3 * x + 1

			print(x, end=" ")


# Imprima a seguinte tabela, usando fors encadeados:
# 1
# 2 4
# 3 6 9
# n n*2 n*3 ... n*n
class questao7:

	def tabela():
		print("Me dê um valor para fazer a brincadeira: ",end="")
		x = int(input())
		for x in range(1, x + 1):
			for y in range(1, x + 1):
				tabela = x * y
				print(tabela,end=" ")
			print("")


# 8. Faça o exercício da série de Fibonacci usando apenas duas variáveis.
class questao8:

	def fibonacci_2variavel():
		variavel1 = 1
		variavel2 = 0
		for n in range(0,16):
			variavel2 += variavel1
			variavel1 = variavel2 - variavel1

			print(f"Fibonacci de {n} é igual a {variavel1}")

main()
