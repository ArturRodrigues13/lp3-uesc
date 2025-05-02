class SensorBase:
	def __init__(self):
		pass

	def coletar_dados(self):
		return "\nColetando Dados Genéricos..."

class SensorTemperatura(SensorBase):
	def __init__(self):
		pass

	def coletar_dados(self):
		dados = super().coletar_dados()
		return "\nTemperatura: 22°C " + dados

class SensorUmidade(SensorBase):
	def __init__(self):
		pass

	def coletar_dados(self):
		dados = super().coletar_dados()
		return "\nUmidade: 45% " + dados

class SensorComposto(SensorTemperatura,SensorUmidade):
	def __init__(self):
		pass

	def coletar_dados(self):
		sensor_texto = super().coletar_dados()
		sensor_texto = sensor_texto.replace("Coletando Dados Genéricos...","")

		return "\nDados Combinados:" + sensor_texto

def main():

	s4 = SensorComposto()
	print(s4.coletar_dados())

main()
