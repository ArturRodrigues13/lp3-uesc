// Aula 28.03.2025
// Artur Rodrigues Santos

// Desafio: Criando um Sistema de Controle de Contas Bancárias

// Um banco local precisa de um sistema simples para gerenciar contas bancárias. Seu objetivo é modelar a classe ContaBancaria,
// garantindo que os dados sejam protegidos corretamente e acessíveis apenas por meio de métodos específicos.

// Melhorias:
// @ Bloquear depósitos de valores negativos;
// @ Bloquear saques de valores negativos;
// @ Exibir mensagens mais amigáveis e informativas.

// Desafio Extra: Fazer uma transferência de valor de uma conta para outra, ainda fazendo as verificações acima.

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		String nome;
		String CPF;
		String nascimento;
		int conta_atual = 1;
		int escolha = 1;
		double valor;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Olá, bem vindo(a) à sua nova conta na Nubank!!!");
		System.out.print("Primeiramente, me diga seu nome: ");

		nome = entrada.nextLine();

		System.out.print("Agora o seu CPF: ");

		CPF = entrada.nextLine();

		System.out.println("Agora sua data de nascimento, em formato DD/MM/AAAA");

		nascimento = entrada.nextLine();

		Data cliente_nascimento = new Data(nascimento);

		Cliente cliente1 = new Cliente(nome, CPF, cliente_nascimento);
		Cliente cliente2 = new Cliente("Artur", "22123121", new Data());

		ContaBancaria conta1 = new ContaBancaria(cliente1);
		ContaBancaria conta2 = new ContaBancaria(cliente2);
		System.out.println("Okay, é um prazer ter você conosco " + nome);

		while (escolha != 0) {
			System.out.println("\n\nO que deseja fazer agora?");
			System.out.println("0. Sair");
			System.out.println("1. Tranferir para Outra Conta");
			System.out.println("2. Exibir suas Informações");
			System.out.println("3. Realizar um Depósito");
			System.out.println("4. Realizar um Saque");
			System.out.print("Digite sua Resposta: ");

			escolha = entrada.nextInt();

			switch (escolha) {
				case 0:
					break;
				case 1:
					System.out.print("Perfeito, me diga o valor que será transferido: ");
					valor = entrada.nextDouble();
					conta1.Tranferir(conta2, valor);
					conta2.ExibirInformacoes();
					break;
				case 2:
					if(conta_atual == 1)
						conta1.ExibirInformacoes();
					break;
				case 3:
					System.out.print("Perfeito, me diga o valor que será depositado: ");
					valor = entrada.nextDouble();
					conta1.Depositar(valor);
					break;
				case 4:
					System.out.print("Perfeito, me diga o valor que será retirado de sua Conta: ");
					valor = entrada.nextDouble();
					conta1.Sacar(valor);
					break;
				case 5:
					System.out.print(Bancos.quantidadeDeContas());
					break;
				default:
					System.out.println("Escolha Inválida, por favor Tente Novamente");
			}
		}

		entrada.close();

		return;
	}
}
