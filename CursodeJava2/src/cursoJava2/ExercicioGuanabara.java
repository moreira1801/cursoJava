package cursoJava2;

import java.util.Scanner;

public class ExercicioGuanabara {

	public static void main(String[] args) {
		System.out.println("CONDICIONAL SIMPLES");
		Scanner ler = new Scanner(System.in);
		double n1, n2, m;
		System.out.print("Escreva o primeiro número: ");
		n1 = ler.nextDouble();
		System.out.print("Escreva o segundo número: ");
		n2 = ler.nextDouble();
		m = (n1 + n2)/2;
		System.out.println("Sua média foi: " + m);
		if (m>9) {
			System.out.println("PARABÉNS"); 
			
		System.out.println("CONDICIONAL COMPOSTA");
		int i, nasc;
		System.out.println("Digite o ano de nascimento: ");
		nasc = ler.nextInt();
		i = 2015 - nasc;
		if (i >= 18) {
			System.out.println("Você tem " + i + " anos e é maior de idade");
		} else  {
			System.out.println("Você tem " + i + " anos e é menor de idade");
		}
		}

	}

}
