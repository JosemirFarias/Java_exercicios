package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data(28, 9, 2024);
		
		var d2 = new Data();
		
		d2.dia = 1;
		d2.mes = 1;
		d2.ano = 1970;
		
		System.out.printf(d1.obterDataFormatada());
		System.out.printf(d2.obterDataFormatada());
		
	}

}
