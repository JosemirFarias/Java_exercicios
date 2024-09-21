package controle;

public class Switch1 {
	
	public static void main(String[] args) {
		
		String faixa = "marron";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o bassai Dai");
		case "marron":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godam");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		
		System.out.println("Fim!");
	}

}
