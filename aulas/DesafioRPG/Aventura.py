from Inimigos import InimigoBase,Goblin
from Personagens import Personagem
from Batalha import batalhar

def RodadaAtual(Player: Personagem, Aliados: list, rodada_atual: int):

	if(rodada_atual == 1):
		print("Voce encontra um poderoso guerreiro impedindo sua passagem, parece que ele quer brigar")
		inimigo = Goblin("Ronaldo",40,10)
		print("Ronaldo Ronaldo Ronaldo RONALDO!!!")

		print("Parece que você vai ter que lutar com ele!!!")

		batalhar(Player,Aliados,inimigo)

	if(rodada_atual == 2):
		print("Voce encontra um Mendingo fudido")
		inimigo = Goblin("Temencle",80,15)
		print("FAZER O QUE COM O QUE?? EPIC BATTLE FANTASY 4 JOGO FODA, OU CÊS JÁ JOGARAM RAIN WORLD???")

		print("Parece que você vai ter que lutar com ele!!!")

		batalhar(Player,Aliados,inimigo)
