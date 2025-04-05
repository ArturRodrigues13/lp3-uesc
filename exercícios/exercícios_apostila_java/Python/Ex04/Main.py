 # ORIENTAÇÃO A OBJETOS
 # Artur Rodrigues Santos

 # 1. Modele uma conta. A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes.
 # Desenhe no papel tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter o nome do titular ( String ), o número ( int ),
 # a agência ( String ), o saldo ( float ) e uma data de abertura ( String ). Além disso, ela deve fazer as seguintes ações:

 # @ saca, para retirar um valor do saldo;
 # @ deposita, para adicionar um valor ao saldo;
 # @ calculaRendimento, para devolver o rendimento mensal dessa conta.

 # 2. Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra classe que tenha o
 # main. Você deve criar
 # a classe da conta com o nome Conta, mas pode nomear como quiser a classe de testes, contudo, ela deve possuir o método main.

 # A classe Conta deve conter pelo menos os seguintes métodos:

 # @ saca que recebe um valor como parâmetro e retira esse valor do saldo da conta;
 # @ deposita que recebe um valor como parâmetro e adiciona esse valor ao saldo da conta;
 # @ calculaRendimento que não recebe parâmetro algum e devolve o valor do saldo multiplicado por 0.1;

 # 3. Crie um método recuperaDadosParaImpressao() , que não recebe parâmetro mas devolve o texto com todas as informações
 # da nossa conta para efetuarmos a impressão.

 # 4. Construa duas contas com o new e compare-os com o == . E se eles tiverem os mesmos atributos?

 # 5. Crie duas referências para a mesma conta, compare-os com o == . Tire suas conclusões.

 # 6. (opcional) Em vez de utilizar uma String para representar a data, crie uma outra classe, chamada Data. Ela possui
 # três campos int, para dia, mês e ano. Faça com que sua conta passe a usá-la.

 # 7. (opcional) Modifique seu método recuperaDadosParaImpressao para que ele devolva o valor da dataDeAbertura daquela Conta.

 # 8. (opcional) O que acontece se você tentar acessar um atributo diretamente na classe?

 # 9. (opcional-avançado) Crie um método na classe Data que devolva o valor formatado da data, isto é, devolva uma String com "dia/mes/ano".

from Conta import classe_Conta

def main():

	nome: str = input("Diga o nome do titular da Conta: ")

	saldo: float = float(input("Me diga seu saldo inicial: "))

	numero_conta: int = int(input("Me diga o número da sua Conta: "))

	agencia: str = input("Me diga qual sua agência: ")

	conta1 = classe_Conta(nome, saldo, numero_conta, agencia)

	print("Sacando 200")
	conta1.sacar(200)

	print("Seu saldo após o saque: ",end="")
	print(conta1.get_saldo())

	print("Depositando 500")
	conta1.depositar(500)

	print("Seu saldo após o depósito: ",end="")
	print(conta1.get_saldo())

	print("Seu rendimento mensal é de: {}".format(conta1.calcula_rendimento()))

	conta1.imprime_dados()

main()
