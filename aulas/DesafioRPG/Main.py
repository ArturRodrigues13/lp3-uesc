from Classes import Guerreiro,Mago,Arqueiro

def main():
	guerreiro = Guerreiro("Ronaldo",100,20,10)
	guerreiro.mostrarStatus()

	mago = Mago("Tutu",100,30,50)
	mago.mostrarStatus()

	guerreiro.atacar(mago)

	mago.mostrarStatus()

	mago.atacar(guerreiro)

	guerreiro.mostrarStatus()

main()
