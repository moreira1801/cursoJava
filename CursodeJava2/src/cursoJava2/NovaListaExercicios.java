package cursoJava2;

import java.util.Scanner;

public class NovaListaExercicios {

	public static void main(String[] args) {
		System.out.println("EXERCÍCIO 1");
		double c, k, re, ra, f;
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe a temperatura em C°: ");
		c = ler.nextDouble(); 
		System.out.println(c + "° Celsius");
		k = c + 273.15;
		System.out.println(k + "° Kelvin");
		re = c * 0.8;
		System.out.println(re + "° Réaumur");
		ra = c * 1.8 + 32 + 459.67;
		System.out.println(ra + "° Rankine");
		f = c * 1.8 + 32;
		System.out.println(f + "° Fahrenheit");
		ler.close();
		
		
		
	}

}
