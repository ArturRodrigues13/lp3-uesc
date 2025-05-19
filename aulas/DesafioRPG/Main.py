from Classes import Personagem,Guerreiro,Mago,Arqueiro
from Batalha import batalhar

def main():
	print("Bem vindo ao melhor jogo da história!\n")
	print("Faça a escolha do seu personagem")
	print("1: Guerreiro")
	print("2: Mago")
	print("3: Arqueiro")
	personagem = int(input())
	while (personagem != 1 and personagem != 2 and personagem != 3):
		print("escolha inválida, tente novamente por favor!")
		print("1: Guerreiro")
		print("2: Mago")
		print("3: Arqueiro")
		personagem = int(input())

	print("Perfeito, agora me diga o nome dele: ")
	nome = input()

	if(personagem == 1):
		player = Guerreiro(nome,100,20,20)
	elif(personagem == 2):
		player = Mago(nome,50,60,80)
	else:
		player = Arqueiro(nome,75,30,10)

	rodada = 1

	print("Perfeito, é aqui que começa sua aventura!!!")

	while(player.vida > 0):

		print(f"Rodada Atual: {rodada}")
		print("Okay, o que você deseja fazer?")
		print("1: Seguir com a aventura")
		print("2: Checar seus status")
		print("3: Sair do jogo")

		escolha = int(input())
		if(escolha == 1):

			print("Voce encontra um poderoso guerreiro impedindo sua passagem, parece que ele quer brigar")
			inimigo = Guerreiro("Ronaldo",60,10,10)
			print("Ronaldo Ronaldo Ronaldo RONALDO!!!")

			print("Parece que você vai ter que lutar com ele!!!")

			batalhar(player,inimigo)

			rodada += 1

		elif(escolha == 2):
			player.mostrarStatus()
		else:
			break


main()
