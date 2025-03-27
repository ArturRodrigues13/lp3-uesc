package Ex04;

import java.time.LocalDate;

public class Data {

	LocalDate dataAtual = LocalDate.now();

	int dia = dataAtual.getDayOfMonth();
	int mes = dataAtual.getMonthValue();
	int ano = dataAtual.getYear();

	public String concatena() {
		return dia + "/" + mes + "/" + ano;
	}
}
