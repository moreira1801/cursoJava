package cursoJava2;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// segundo exercicio
				System.out.println("");
				System.out.println("EXERC�CIO 2");
				double altura, maior = 0, menor = 0, somaH = 0, medH = 0;
				char caractere;
				int i, Mulheres = 0, Homens = 0;
				Scanner entrada = new Scanner(System.in); 
				Scanner ler = new Scanner (System.in);
				for (i=0; i<3; i++) {
					System.out.print("Digite o sexo [F/M]: ");
					caractere = entrada.nextLine().charAt(0);
					System.out.print("Digite a altura [m]: ");
					altura = ler.nextDouble();
				if (caractere == 'F') {
					Mulheres++;
				} else if (caractere == 'M') {
					Homens++;
					somaH = somaH + altura;
				} else {
					System.out.println("OPC�O INV�LIDA");
				} 
				if (altura > maior) {
					maior = altura;
				} else if (altura > menor) {
						menor = altura;
				} 
				} medH = somaH / Homens;
				System.out.println("M�dia das alturas dos homens �: " + medH);
				System.out.println("A maior altura do grupo � " + maior + " e a menor �: " + menor);
				System.out.println("O n�mero de mulheres �: " + Mulheres);
					
	}

}
