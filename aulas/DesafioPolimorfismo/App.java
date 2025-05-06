package DesafioPolimorfismo;

public class App {
	public static void invocarAnimal(Animal objeto) {

		objeto.emitir_som();
	}
	public static void main(String[] args) {

		invocarAnimal(new Animal());
		invocarAnimal(new Gato());
		invocarAnimal(new Cachorro());

		ExportadorDeDocumentos export = new ExportadorDeDocumentos();

		export.exportarDocumento(new Documento());
		export.exportarDocumento(new PDF());
		export.exportarDocumento(new Word());
		System.out.println(ExportadorDeDocumentos.quantidade_exportada);
	}
}
