package DesafioPolimorfismo;

public class Documento {

	public String exportar() {

		return "Exportando Documento Genérico...";
	}
}

class PDF extends Documento {

	public String exportar() {

		return "Exportando Documento PDF";
	}
}

class Word extends Documento {

	public String exportar() {

		return "Exportando Documento Word";
	}
}

class ExportadorDeDocumentos {

	public static int quantidade_exportada = 0;

	public void exportarDocumento(Documento doc) {

		quantidade_exportada ++;
		System.out.println(doc.exportar());
	}
}
