package praticando;

import java.util.Scanner;

public class EntradaConsole {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua cidade: ");
		String cidade = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		// %s representa saídas strings e %d representa saídas de inteiros.
		System.out.printf("%s de %d anos mora em %s.%n", nome, idade, cidade);
		
		entrada.close();
		
		
	}

}
