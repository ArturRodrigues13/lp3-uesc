from Personagens import Personagem
from Inimigos import InimigoBase

def batalhar(Protagonista: Personagem, Aliados: list, Inimigo: InimigoBase):

	quant: int = len(Aliados)
	membro_atual: int = 0

	while(Protagonista.vida > 0 and Inimigo.vida > 0):

		atacante_atual: Personagem = Aliados[membro_atual]

		print("Escolha sua ação:")
		print("1: Atacar")
		print("2: Defender")
		print("3: Mostrar Status")
		print("4: Habilidade Especial")

		escolha: int = int(input())

		if(escolha == 1):
			atacante_atual.atacar(Inimigo)
		elif(escolha == 2):
			atacante_atual.defender()
		elif(escolha == 3):
			atacante_atual.mostrarStatus()
		else:
			atacante_atual.habilidadeEspecial()

		if(Inimigo.vida <= 0):
			break

		alvo: Personagem = Aliados[0]

		for membro in range(len(Aliados)):
			if(alvo.vida <= 0 or Aliados[membro].vida < alvo.vida):
				alvo = Aliados[membro]

		Inimigo.atacar(alvo)

		membro_atual += 1

		if(membro_atual > quant - 1):
			membro_atual = 0


	if(Protagonista.vida > 0):
		print("Você venceu seu inimigo!!!")
		print("Recuperou uma parte de sua vida!")
		Protagonista.vida += round(Protagonista.vida / 2)
	else:
		print("Você perdeu, noob fudido imundo")
