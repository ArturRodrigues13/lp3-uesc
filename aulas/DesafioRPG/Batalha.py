from Classes import Personagem,Guerreiro,Mago,Arqueiro

def batalhar(Protagonista, Inimigo):
	while(Protagonista.vida > 0 and Inimigo.vida > 0):
		print("Escolha sua ação:")
		print("1: Atacar")
		print("2: Defender")
		print("3: Habilidade Especial")

		escolha = int(input())

		if(escolha == 1):
			Protagonista.atacar(Inimigo)
		elif(escolha == 2):
			Protagonista.defender()
		else:
			Protagonista.habilidadeEspecial()

		Inimigo.atacar(Protagonista)


	if(Protagonista.vida > 0):
		print("Você venceu seu inimigo!!!")
	else:
		print("Você perdeu, noob fudido imundo")
