from abc import ABC, abstractmethod
from Personagens import Personagem

class InimigoBase(ABC):
	nome: str
	vida: int
	forca: int

	@abstractmethod
	def atacar():
		pass

	def __init__(self,nome,vida,forca):
		self.nome = nome
		self.vida = vida
		self.forca = forca

class Goblin(InimigoBase):
	def __init__(self, nome, vida, forca):
		super().__init__(nome, vida, forca)

	def atacar(self, alvo: Personagem):
		print(f"{self.nome} causou {self.forca} de dano em {alvo.nome}!")
		alvo.vida -= self.forca
