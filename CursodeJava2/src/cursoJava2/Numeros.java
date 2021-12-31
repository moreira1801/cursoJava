package cursoJava2;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		int n = 0, s = 0;
		String resp = null;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Digite um número: ");
			teclado.nextInt();
			System.out.println("Quer continuar? [S/N]");
		} while(resp.equals("s")); 
		System.out.println("As somas dos valores é " + s);

	}

}
