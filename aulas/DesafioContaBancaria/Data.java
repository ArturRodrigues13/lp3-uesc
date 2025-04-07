import java.time.LocalDate;

public class Data {

	LocalDate dataAtual = LocalDate.now();

	private int dia;
	private int mes;
	private int ano;

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public void setData(int _dia, int _mes, int _ano) {
		this.dia = _dia;
		this.mes = _mes;
		this.ano = _ano;
	}


	public static Boolean ehBissexto(int ano) {
		if (ano % 400 == 0 || ano % 100 != 0 && ano % 4 == 0 )
			return true;
		else
			return false;
	}

	public Data() {
		setData(dataAtual.getDayOfMonth(), dataAtual.getMonthValue(), dataAtual.getYear());
	}

	public Data(int _dia, int _mes, int _ano) {
		setData(_dia, _mes, _ano);
	}

	public Data(String _data) {
		String _dia = _data.substring(0,2);
		String _mes = _data.substring(3,5);
		String _ano = _data.substring(6,10);

		setData(Integer.parseInt(_dia), Integer.parseInt(_mes), Integer.parseInt(_ano));
	}

	public Boolean dataValida(Data data) {

		int[] dias_no_mes = {31, ehBissexto(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if ( dia < 1 ) {
			setData(1, 1, 2000);
			return false;
		}
		else if ( mes < 1 || mes > 12 ) {
			System.out.println("Data inválida, mudando para padrão");
			setData(1, 1, 2000);
			return false;
		}
		else if ( dia > dias_no_mes[mes - 1] ) {
			System.out.println("Data inválida, mudando para padrão");
			setData(1, 1, 2000);
			return false;
		}
		else if ( ano < 0 ) {
			System.out.println("Data inválida, mudando para padrão");
			setData(1, 1, 2000);
			return false;
		}
		else
			return true;
	}

	public static Boolean isEqual(Data data1, Data data2) {
		if (data1.dia == data2.dia && data1.mes == data2.mes && data1.ano == data2.ano)
			return true;
		else
			return false;
	}

	public String toString() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}

}
