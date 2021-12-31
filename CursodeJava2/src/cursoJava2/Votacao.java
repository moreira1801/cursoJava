package cursoJava2;

import java.util.Scanner;

public class Votacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual sua idade? ");
		int i = teclado.nextInt();
		if (i < 16) {
			System.out.println("Proibido votar");
		} else if (i < 18 || i > 69) {
			System.out.println("Voto facultativo");
		} else {
			System.out.println("Voto obrigatório");
		}

	}

}
