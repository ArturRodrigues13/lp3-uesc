package aulas.DesafioData;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo ao Criador de Datas ou sei lá");

		Data data1 = new Data();
		System.out.print("A data atual (vulgo hoje) é: ");
		System.out.println(data1.concatena());


		System.out.print("Beleza, agora tu me dá uma data aí, primeiro me dá o dia: ");
		int dia = scanner.nextInt();
		System.out.print("Agora tu me dá o mês: ");
		int mes = scanner.nextInt();
		System.out.print("Agora o ano: ");
		int ano = scanner.nextInt();
		scanner.nextLine();

		Data data2 = new Data(dia,mes,ano);

		System.out.print("Sua primeira data: ");
		System.out.println(data2.concatena());

		if (data2.dataValida(data2))
			System.out.println("\nA data que você digitou é válida!");
		else
			System.out.println("\nA data que você digitou não é válida!");


		System.out.print("Agora me manda um data completa, no formato DD/MM/AAAA (incluindo as barras) por favor: ");

		String data_texto = scanner.nextLine();

		while (data_texto.length() != 10) {

			System.out.print("Por favor, no formato DD/MM/AAAA (incluindo as barras): ");
			data_texto = scanner.nextLine();

		}

		Data data3 = new Data(data_texto);

		System.out.print("\nSua segunda data: ");
		System.out.println(data3.concatena());

		if (data3.dataValida(data3))
			System.out.println("\nSua segunda data é válida!");
		else
			System.out.println("\nSua segunda data não é válida!\n");


		if(Data.isEqual(data1, data2))
			System.out.println("A primeira data que você digitou é igual à data atual (vulgo hoje)\n");
		else
			System.out.println("A primeira data que você digitou é diferente da data atual (vulgo hoje)\n");

		if(Data.isEqual(data1, data3))
			System.out.println("A segunda data que você digitou é igual à data atual (vulgo hoje)\n");
		else
			System.out.println("A segunda data que você digitou é diferente da data atual (vulgo hoje)\n");

		if(Data.isEqual(data2, data3))
			System.out.println("Ambas as datas que você digitou são iguais!!!\n");
		else
			System.out.println("Ambas as datas que você digitou são diferentes!!!\n");

		scanner.close();
	}
}
