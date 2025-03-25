 // FIXAÇÃO DE SINTAXE
 // Artur Rodrigues Santos

package Ex03;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Olá, bem vindo ao menu de questões do exercício 3!!!");
		System.out.println("1. Impressão dos números de 150 a 300");
		System.out.println("2. Soma de 1 até 1000");
		System.out.println("3. Múltiplos de 3 entre 1 e 100");
		System.out.println("4. Fatoriais de 1 a 10");
		System.out.println("5. Fibonacci até 100");
		System.out.println("6. Brincadeira com o X");
		System.out.println("7. Tabela de Multiplicação");
		System.out.println("8. Fibonacci com duas variáveis");
		System.out.print("Digite o valor para a questão que você deseja executar: ");
		Scanner scanner = new Scanner(System.in);
		int escolha = scanner.nextInt();

		switch (escolha) {
			case 1:
				questao1.main(args);
				break;
			case 2:
				questao2.main(args);
				break;
			case 3:
				questao3.main(args);
				break;
			case 4:
				questao4.main(args);
				break;
			case 5:
				questao5.main(args);
				break;
			case 6:
				questao6.main(args);
				break;
			case 7:
				questao7.main(args);
				break;
			case 8:
				questao8.main(args);
				break;
			default:
				System.out.println("Escolha Inválida, Tente Novamente!");
				scanner.close();
				return;
		}

		scanner.close();
		return;
	}
}


// 1. Imprima todos	os números de 150 a	300;
class questao1 {
	public static void main(String[] args) {
		for(int i = 150; i <= 300; i++) {
			System.out.print(i + " ");
		}
	}
}


// 2. Imprima a	soma de	1 até 1000;
class questao2 {
	public static void main(String[] args) {
	int soma = 0;
		for(int i = 1; i <= 1000; i++) {
			soma = soma + i;
		}
	System.out.print(soma);
	}
}


// 3. Imprima todos	os múltiplos de	3, entre 1 e 100;
class questao3 {
	public static void main(String[] args) {
		for(int i = 0; i <= 100; i++) {
			if (i % 3 == 0)	{
				System.out.print(i + " ");
			}
		}
	}
}


// 4. Imprima os fatoriais de 1	a 10;
class questao4 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			int soma = i;
			for(int j = i - 1; j > 0; j--) {
				soma = soma * j;
			}
			System.out.println("Fatorial de " + i + " = " + soma);
		}
	}
}


// 5. Imprima os primeiros números da série	de Fibonacci até passar	de 100.
class questao5 {
	public static void main(String[] args) {
		int soma = 0;
		int fibatual1 = 0;
		int fibatual2 = 0;
		for(int i = 0; i <= 15; i++) {
			if (i == 0) {
				soma = 0;
			}
			if (i == 1) {
				soma = 1;
			}
			if (i > 1) {
				fibatual1 = fibatual2;
				fibatual2 = soma;
				soma = fibatual1 + fibatual2;
			}
			System.out.println("Fibonacci de " + i + " = " + soma);
		}
	}
}


// 6. Escreva um programa que, dada	uma	variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:

// @ Se x é par, x = x / 2;
// @ Se	x é	impar, x = 3 * x + 1;
// @ O programa	deve parar quando x	tiver o	valor final	de	1. Por exemplo, para x = 13	, a	saída será:
	   // 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
class questao6 {
	public static void main(String[] args) {

		System.out.print("Me dê um valor para fazer a brincadeira: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		// int x = 13; Caso queira conferir a resposta

		while ( x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			}
			else {
				x = 3 * x + 1;
			}

			System.err.print(x + " ");
		}

		scanner.close();
	}
}

// Imprima a seguinte tabela, usando fors encadeados:
// 1
// 2 4
// 3 6 9
// n n*2 n*3 ... n*n
class questao7 {
	public static void main(String[] args) {

		System.out.print("Me dê um valor para fazer a brincadeira: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= i; j++) {
				int tabela = i * j;
				System.out.print(tabela + " ");
			}
			System.err.println("");
		}
		scanner.close();
	}
}


// Faça	o exercício	da série de	Fibonacci usando apenas	duas variáveis.
class questao8 {
	public static void main(String[] args) {
		int fibatual1 = 1;
		int fibatual2 = 0;
		for(int i = 0; i <= 15; i++) {
			fibatual2 += fibatual1;
			fibatual1 = fibatual2 - fibatual1;

			System.out.println("Fibonacci de " + i + " = " + fibatual1);
		}
	}
}
