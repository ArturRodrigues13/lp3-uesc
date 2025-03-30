from datetime import date

class class_Data:

	data_atual = date.today()

	def concatena(self):
		return self.data_atual.strftime("%d/%m/%Y")
