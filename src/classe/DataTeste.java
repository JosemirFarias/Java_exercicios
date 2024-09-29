package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		d1.dia = 28;
		d1.mes = 9;
		d1.ano = 2024;
		
		var d2 = new Data();
		
		d2.dia = 27;
		d2.mes = 9;
		d2.ano = 2024;
		
		System.out.printf(d1.obterDataFormatada());
		System.out.printf(d1.obterDataFormatada());
		
	}

}
