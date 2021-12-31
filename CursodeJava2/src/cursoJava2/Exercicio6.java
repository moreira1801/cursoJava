package cursoJava2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numero;
		System.out.print("Digite um número: ");
		numero = ler.nextDouble();
		System.out.println("Antecessor " + (numero - 1));
		System.out.println("Sucessor: " + (numero + 1));

	}

}
