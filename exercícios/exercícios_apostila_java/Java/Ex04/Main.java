 // ORIENTAÇÃO A OBJETOS
 // Artur Rodrigues Santos

 // 1. Modele uma conta. A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes.
 // Desenhe no papel tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter o nome do titular ( String ), o número ( int ),
 // a agência ( String ), o saldo ( double ) e uma data de abertura ( String ). Além disso, ela deve fazer as seguintes ações:

 // @ saca, para retirar um valor do saldo;
 // @ deposita, para adicionar um valor ao saldo;
 // @ calculaRendimento, para devolver o rendimento mensal dessa conta.

 // 2. Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra classe que tenha o
 // main. Você deve criar
 // a classe da conta com o nome Conta, mas pode nomear como quiser a classe de testes, contudo, ela deve possuir o método main.

 // A classe Conta deve conter pelo menos os seguintes métodos:

 // @ saca que recebe um valor como parâmetro e retira esse valor do saldo da conta;
 // @ deposita que recebe um valor como parâmetro e adiciona esse valor ao saldo da conta;
 // @ calculaRendimento que não recebe parâmetro algum e devolve o valor do saldo multiplicado por 0.1;

 // 3. Crie um método recuperaDadosParaImpressao() , que não recebe parâmetro mas devolve o texto com todas as informações
 // da nossa conta para efetuarmos a impressão.

 // 4. Construa duas contas com o new e compare-os com o == . E se eles tiverem os mesmos atributos?

 // 5. Crie duas referências para a mesma conta, compare-os com o == . Tire suas conclusões.

 // 6. (opcional) Em vez de utilizar uma String para representar a data, crie uma outra classe, chamada Data. Ela possui
 // três campos int, para dia, mês e ano. Faça com que sua conta passe a usá-la.

 // 7. (opcional) Modifique seu método recuperaDadosParaImpressao para que ele devolva o valor da dataDeAbertura daquela Conta.

 // 8. (opcional) O que acontece se você tentar acessar um atributo diretamente na classe?

 // 9. (opcional-avançado) Crie um método na classe Data que devolva o valor formatado da data, isto é, devolva uma String com "dia/mes/ano".

package exercícios.exercícios_apostila_java.Java.Ex04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Conta c1 = new Conta();

		System.out.print("Me diga o nome do Titular da Conta: ");
		c1.set_titular(scanner.nextLine());

		System.out.print("Me diga o ID da Agencia: ");
		c1.set_agencia(scanner.nextLine());

		c1.set_dataAbertura(c1.definirData());

		System.out.print("Me diga o Número da Conta: ");
		c1.set_numeroConta(Integer.parseInt(scanner.nextLine()));

		System.out.print("Me diga seu Saldo Inicial: ");
		c1.set_saldo(Double.parseDouble(scanner.nextLine()));

		System.out.println("Sacando 200");
		c1.saca(200);

		System.out.print("Seu saldo após o saque: ");
		System.out.println(c1.get_saldo());

		System.out.println("Depositando 500");
		c1.deposita(500);

		System.out.print("Seu saldo após o depósito: ");
		System.out.println(c1.get_saldo());


		c1.calculaRendimento();

		c1.recuperaDadosParaImpressao();

		scanner.close();
	}
}

// Usei esse bloco para responder a questão 4, caso criemos uma nova conta c2, e dermos a ela os exatos mesmos atributos
// de c1, elas ainda serão "diferentes", ou seja, a igualdade abaixo retorna false!!!
		/*
		if (c1 == c2) {
			System.out.println("Iguais!!!");
		} else {
			System.out.println("Diferentes!!!");
		}
		*/


// Usei esse bloco para responder a questão 5, caso criemos uma nova conta c2 e igualemos ela à c1, o if nos retornará
// "Iguais", ou seja, True!!! Uma coisa	legal de se notar é que as mudanças que eu faço em c1 também acontecem em c2,
// e vice versa. Caso eu use a função saca() em c1, o mesmo valor será debitado de c2, e se eu depositar um valor em c2,
// o mesmo valor será adicionado à c1!!!
		/*
		c2 = c1;

		if (c1 == c2) {
			System.out.println("Iguais!!!");
		} else {
			System.out.println("Diferentes!!!");
		}
		*/


// Usei esse bloco para responder a questão 8, caso você tentar acessar um atributo de uma variável de forma direta,
// o funcionamento vai depender do modificador de acesso, caso seja "public", funcionará normalmente, caso a variável
// seja "private", o código não irá compilar pois apenas a própria classe pode acessar variáveis privadas, caso fosse
// "protected" seria quase a mesma coisa, com a excessão de que classes que herdam "Conta" também vão poder acessar suas variáveis.
