package cursoJava2;

import java.util.Scanner;

public class NovoExercicio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double i;
		double salario = 788;
		System.out.println("Sal�rio m�nimo atual R$788,00");
		System.out.print("Digite o seu sal�rio: ");
		i = ler.nextDouble();
		double x = i / salario;
		System.out.println("Voc� recebe " + x + " sal�rios m�nimos");
		

	}

}
