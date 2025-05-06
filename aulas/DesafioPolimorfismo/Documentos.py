class Documento:
	def exportar(self):
		return "Exportando Documento Genérico..."

class PDF(Documento):
	def exportar(self):
		return "Exportando Documento PDF"

class Word(Documento):
	def exportar(self):
		return "Exportando Documento Word"

class ExportadorDeDocumentos:

	documentos_exportados = 0

	def exportarDocumentos(self, doc: Documento):
		ExportadorDeDocumentos.documentos_exportados += 1
		return doc.exportar()

def main():

	exportador = ExportadorDeDocumentos()

	print(exportador.exportarDocumentos(Documento()))
	print(exportador.exportarDocumentos(PDF()))
	print(exportador.exportarDocumentos(Word()))
	print(exportador.documentos_exportados)

main()
