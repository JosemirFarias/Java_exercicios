package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d\n", dia, mes, ano);
	}

}
