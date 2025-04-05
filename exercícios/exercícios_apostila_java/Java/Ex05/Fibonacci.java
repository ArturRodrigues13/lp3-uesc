package exercícios.exercícios_apostila_java.Java.Ex05;

public class Fibonacci {

	public int fibonacciRecursivo(int n) {

		// Versão regular
		/*
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
		*/

		// Uma única linha
		return (n <= 1) ? n : fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
	}
}
