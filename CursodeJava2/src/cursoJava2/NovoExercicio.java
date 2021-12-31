package cursoJava2;

import java.util.Scanner;

public class NovoExercicio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double i;
		double salario = 788;
		System.out.println("Salário mínimo atual R$788,00");
		System.out.print("Digite o seu salário: ");
		i = ler.nextDouble();
		double x = i / salario;
		System.out.println("Você recebe " + x + " salários mínimos");
		

	}

}
