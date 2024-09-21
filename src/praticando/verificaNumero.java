package praticando;

import java.util.Scanner;

public class verificaNumero {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//solicita ao usuário que digite um número
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
		//Verifica se o número está entre 0 e 10 e se é par
		if (numero >=0 && numero <=10) {
			if (numero % 2 == 0) {
				System.out.println("O número " + numero + " está entre 0 e 10 e é par!");
			} else {
				System.out.println("O número " + numero + " está entre 0 e 10 mais não é par!");
			}
		} else {
			System.out.println("O número " + numero + " não está entre 0 e 10!");
		}
		
		
		entrada.close();
	}

}
