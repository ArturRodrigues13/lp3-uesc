package aulas.DesafioData;

public class Data {

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

	private void DataAtual() {

		long millisegundos = System.currentTimeMillis();

		long dias_desde_1970 = millisegundos / (1000 * 60 * 60 * 24);

		this.ano = 1970;

		int dias_no_ano = 1;

		while (dias_desde_1970 > dias_no_ano) {
			if (ehBissexto(ano))
				dias_no_ano = 366;
			else
				dias_no_ano = 365;
			dias_desde_1970 -= dias_no_ano;
			ano ++;
		}

		this.mes = 1;

		this.dia = (int) dias_desde_1970 + 1;

		int[] dias_no_mes = {31, ehBissexto(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for (int i = 0; i < dias_no_mes.length; i++) {

			if (dia > dias_no_mes[i]) {
				dia -= dias_no_mes[i];
				mes ++;
			}
			else
				break;

		}
	}

	public static Boolean ehBissexto(int ano) {
		if (ano % 400 == 0 || ano % 100 != 0 && ano % 4 == 0 )
			return true;
		else
			return false;
	}

	public Data() {
		DataAtual();
	}

	public Data(int _dia, int _mes, int _ano) {
		dia = _dia;
		mes = _mes;
		ano = _ano;
	}

	public Data(String _data) {
		String _dia = _data.substring(0,2);
		String _mes = _data.substring(3,5);
		String _ano = _data.substring(6,10);

		this.dia = Integer.parseInt(_dia);
		this.mes = Integer.parseInt(_mes);
		this.ano = Integer.parseInt(_ano);
	}

	public Boolean dataValida(Data data) {

		int[] dias_no_mes = {31, ehBissexto(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if ( dia < 1 )
			return false;
		else if ( mes < 1 || mes > 12 )
			return false;
		else if ( dia > dias_no_mes[mes - 1] )
			return false;
		else if ( ano < 0 )
			return false;
		else
			return true;

	}

	public static Boolean isEqual(Data data1, Data data2) {
		if (data1.dia == data2.dia && data1.mes == data2.mes && data1.ano == data2.ano)
			return true;
		else
			return false;
	}

	public String concatena() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}

}
