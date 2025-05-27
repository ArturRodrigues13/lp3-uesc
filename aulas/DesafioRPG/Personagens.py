from abc import ABC, abstractmethod

class IHabilidadeEspecial(ABC):
	@abstractmethod
	def habilidadeEspecial():
		pass

class Personagem(ABC):
	nome: str
	vida: int
	forca: int
	defender: bool

	@abstractmethod
	def atacar():
		pass

	@abstractmethod
	def defender():
		pass

	def mostrarStatus(self):
		print(f"Nome do Personagem: {self.nome}\nVida do Personagem: {self.vida}\nForça do Personagem: {self.forca}")

	def __init__(self,nome,vida,defender,forca):
		self.nome = nome
		self.vida = vida
		self.forca = forca
		self.defender = defender

class Guerreiro(Personagem, IHabilidadeEspecial):
	escudo: int
	usouHabilidade: bool
	def __init__(self, nome, vida, defender, forca, escudo):
		super().__init__(nome, vida, defender, forca)
		self.escudo = escudo
		self.usouHabilidade = False

	def atacar(self, alvo: Personagem):
		print(f"{self.nome} causou {self.forca + 5} de dano em {alvo.nome}!")
		alvo.vida -= self.forca + 5

	def defender(self):
		if(self.usouHabilidade == False):
			print(f"{self.nome} usou seu escudo para bloquear o ataque, reduziu muito o dano!")
		else:
			print(f"{self.nome} está sem seu escudo, conseguiu bloquear apenas metade do dano!")

	def habilidadeEspecial(self):
		if(self.usouHabilidade == False):
			self.escudo = 0
			self.forca *= 2
			print(f"{self.nome} usou INVESTIDA!!! Seu ataque dobrou, porém ele perdeu seu escudo!")
			self.usouHabilidade = True
		else:
			print("Você já usou sua habilidade")

	def mostrarStatus(self):
		super().mostrarStatus()
		print(f"Escudo do personagem: {self.escudo}")


class Clerigo(Personagem, IHabilidadeEspecial):
	fe: int
	def __init__(self, nome, vida, defender, forca, fe):
		super().__init__(nome, vida, defender, forca)
		self.fe = fe

	def atacar(self, alvo: Personagem):
		print(f"{self.nome} causou {self.forca} de dano em {alvo.nome}!")
		alvo.vida -= self.forca

	def defender(self):
		print(f"{self.nome} está em posição de defesa, reduziu um pouco o dano!")

	def habilidadeEspecial(self):
		pass

	def mostrarStatus(self):
		super().mostrarStatus()
		print(f"Fé do personagem: {self.fe}")

class Ladino(Personagem, IHabilidadeEspecial):
	stealh: bool
	def __init__(self, nome, vida, defender, forca, stealh):
		super().__init__(nome, vida, defender, forca)
		self.stealh = stealh

	def atacar(self, alvo: Personagem):
		print(f"{self.nome} causou {self.forca + 7} de dano em {alvo.nome}!")
		alvo.vida -= self.forca + 7

	def defender(self):
		print(f"{self.nome} está em posição de defesa, reduziu um pouco o dano!")

	def habilidadeEspecial(self):
		pass

	def mostrarStatus(self):
		super().mostrarStatus()
		print("Está em stealh: Sim") if self.stealh == True else print("Está em stealh: Não")


class Mago(Personagem, IHabilidadeEspecial):
	mana: int
	def __init__(self, nome, vida, defender, forca, mana):
		super().__init__(nome, vida, defender, forca)
		self.mana = mana

	def atacar(self, alvo: Personagem):
		if(self.mana > 10):
			self.mana -= 10
			print(f"{self.nome} usou sua magia, causou {self.forca * 2} de dano em {alvo.nome} e gastou 10 de mana!")
			alvo.vida -= self.forca * 2
		else:
			print("Mana Insuficiente")

	def defender(self):
		print(f"{self.nome} está em posição de defesa, reduziu um pouco o dano")

	def habilidadeEspecial(self):
		self.mana += 20
		print(f"{self.nome} usou TELEPORTE!!! Conseguiu se esconder para recuperar mana!")

	def mostrarStatus(self):
		super().mostrarStatus()
		print(f"Mana do personagem: {self.mana}")

class Arqueiro(Personagem, IHabilidadeEspecial):
	flechas: int
	def __init__(self, nome, vida, defender, forca, flechas):
		super().__init__(nome, vida, defender, forca)
		self.flechas = flechas

	def atacar(self,alvo: Personagem):
		if(self.flechas > 0):
			self.flechas -= 1
			print(f"{self.nome} atirou uma flecha no seu alvo, causou {self.forca + 3} de dano em {alvo.nome} e gastou uma flecha!")
			alvo.vida -= self.forca + 3

	def defender(self):
		print(f"{self.nome} defendeu o ataque, reduziu moderadamente o dano!")

	def habilidadeEspecial(self):
		if(self.flechas > 2):
			self.flechas -= 3
			print(f"{self.nome} usou CHUVA DE FLECHAS!!! Gastou 3 flechas e acertou todos os inimigos!")
		else:
			print("Flechas insuficientes!")

	def mostrarStatus(self):
		super().mostrarStatus()
		print(f"Flechas do personagem: {self.flechas}")
