package praticando;

import java.util.Scanner;

public class calculoDeMedia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Solicitando notas
		System.out.println("Informe a nota parcial 1: ");
		double nota1 = entrada.nextDouble();

		System.out.println("Informe a nota parcial 2: ");
		double nota2 = entrada.nextDouble();

		// Cauculo da media
		double media = (nota1 + nota2) / 2.0;

		// Verificando a média
		if (media >= 7.0) {
			System.out.println("Sua média é " + media + " você está APROVADO");
		} else if (media < 7.0 && media > 4.0) {
			System.out.println("Sua média é " + media + " você está em RECUPERAÇÃO");
		} else {
			System.out.println("Sua média é " + media + " você está REPROVADO");
		}

		entrada.close();
	}

}
