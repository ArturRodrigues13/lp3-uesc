# 1. Um método pode chamar ele mesmo. Chamamos isso de recursão. Você pode resolver a série de Fibonacci usando um método que chama ele mesmo.

# 2. Por que o modo acima é extremamente mais lento para calcular a série do que o modo iterativo (que se usa um laço)?

# 3. Escreva o método recursivo novamente, usando apenas uma linha. Para isso, pesquise sobre o operador condicional ternário.

from Fibonacci import Fibonacci

def main():

	valor: int = int(input("Me diga um valor para eu calcular seu Fibonacci: "))
	fibonacci = Fibonacci(valor)

	resultado = fibonacci.calcula_fibonacci(valor)

	print("Fibonacci de {} = {}".format(valor, resultado))

main()

# Usando esse bloco para responder a questão 2, o motivo do método recursivo demorar mais é porque o excesso de chamadas
# repetitivas acabam gerando mais cálculos e mais verificações, pois quanto maior o númeo de chamadas o número de retornos
# também cresce e assim por diante.
