package cursoJava2;

import java.util.Scanner;

public class PernasSwitchCase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Quantas pernas tem? ");
		int pernas = teclado.nextInt();
		String tipo;
		switch (pernas) {
		case 1:
			tipo = "Saci";
			break;
		case 2:
			tipo = "Bípede";
			break;
		case 4: 
			tipo = "Quadrupede";
			break;
		case 6:case 8:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
		
		} System.out.println("Isso é um um(a)" + tipo); teclado.close();

	}

}
