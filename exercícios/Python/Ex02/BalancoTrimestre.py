 # VARIÁVEIS E TIPOS PRIMITIVOS
 # Artur Rodrigues Santos

 # 1. Na empresa onde trabalhamos, há tabelas com o quanto foi gasto em cada mês. Para fechar o balanço do primeiro
 # trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos 15000 reais, em Fevereiro, 23000 reais
 # e em Março, 17000 Reais, faça um programa que calcule e imprima o gasto total no trimestre.

 # 2. Adicione código (sem alterar as linhas que já existem) para imprimir a média mensal de gasto
 # criando uma variável mediaMensal junto com uma mensagem "Valor da média mensal = " + media Mensal.

def main():

	gastos_janeiro = 15000
	gastos_fevereiro = 23000
	gastos_marco = 17000

	gastos_total = gastos_janeiro + gastos_fevereiro + gastos_marco
	print(f"O Total de Gastos no Primeiro Trimestre foi de: {gastos_total}")
	media_mensal = gastos_total / 3
	print(f"Valor da média mensal = {media_mensal:.2f}")

main()
