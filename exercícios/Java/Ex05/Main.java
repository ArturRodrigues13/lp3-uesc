// 1. Um método pode chamar ele mesmo. Chamamos isso de recursão. Você pode resolver a série de Fibonacci usando um método que chama ele mesmo.

// 2. Por que o modo acima é extremamente mais lento para calcular a série do que o modo iterativo (que se usa um laço)?

// 3. Escreva o método recursivo novamente, usando apenas uma linha. Para isso, pesquise sobre o operador condicional ternário.

package Ex05;

import java.util.Scanner;

public class Main {
  	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
  		Fibonacci fibonacci = new Fibonacci();

		System.out.print("Digite qual o número que você deseja calcular o Fibonacci: ");
		int x = entrada.nextInt();

  		System.out.println(fibonacci.fibonacciRecursivo(x));

		entrada.close();

  	}
}

// Usando esse bloco para responder a questão 2, o motivo do método recursivo demorar mais é porque o excesso de chamadas
// repetitivas acabam gerando mais cálculos e mais verificações, pois quanto maior o númeo de chamadas o número de retornos
// também cresce e assim por diante.
