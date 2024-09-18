package praticando;

import java.util.Scanner;

public class PraticandoIf {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		double idade = entrada.nextDouble();
		
		if (idade <18) {
			System.out.println("Você não pode tirar CNH");
		}
		
		else {
			System.out.println("Parabéns você pode tirar a CNH");
		}
		
		
		entrada.close();
	}

}
