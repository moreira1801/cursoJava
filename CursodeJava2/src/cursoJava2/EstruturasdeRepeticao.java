package cursoJava2;

import java.util.Scanner;

public class EstruturasdeRepeticao {

	public static void main(String[] args) {
		System.out.println("Uso do 'for'");
	for (int i = 1; i <= 10; i++) {
		System.out.println("Conte de 1 a 10 = " + i);
	}
	System.out.println("");
	for (int j = 10; j > 0; j--) {
		System.out.println("Conte de 10 até 0 = " + j);
		System.out.println("");
	}
	System.out.println("TABUADA"); 
	System.out.println("");
	for (int tabuada = 0; tabuada <= 10; tabuada++) {
		System.out.println("");
		for (int valor = 0; valor <= 10; valor++) {
			System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
		}
		System.out.println("");
		System.out.println(" Estrturas While e do while");
	}	int contador = 1;
		while(contador <= 10) {
			System.out.println(contador);
			contador++;
		  
		}
	}
}

