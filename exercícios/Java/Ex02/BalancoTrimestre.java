 // VARIÁVEIS E TIPOS PRIMITIVOS
 // Artur Rodrigues Santos

 // 1. Na empresa onde trabalhamos, há tabelas com o quanto foi gasto em cada mês. Para fechar o balanço do primeiro
 // trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos 15000 reais, em Fevereiro, 23000 reais
 // e em Março, 17000 Reais, faça um programa que calcule e imprima o gasto total no trimestre.

 // 2. Adicione código (sem alterar as linhas que já existem) na classe anterior para imprimir a média mensal de gasto
 // criando uma variável mediaMensal junto com uma mensagem "Valor da média mensal = " + media Mensal.

package Ex02;

public class BalancoTrimestre {
	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarço = 17000;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarço;

		System.out.println("Nesse trimestre foram gastos " + gastosTrimestre + " R$");

		float mediaMensal = gastosTrimestre / 3f;

		System.out.println("Valor da média mensal = " + mediaMensal + " R$");

	}
}
