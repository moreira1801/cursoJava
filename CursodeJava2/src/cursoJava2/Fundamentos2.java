package cursoJava2;

import java.util.Scanner;

public class Fundamentos2 {

	public static void main(String[] args) {
		String nome = "Gabriel Moreira de Souza";
		int idade = 26;
		char sexo = 'M';
		double temperatura = 27.3;
		boolean arCondicionado = false;
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar Condicionado: " + arCondicionado);
		System.out.println("");
		String nomeDois = "Fernando Bulhões Oliveira";
		int idadeDois = 18;
		// segundo
		double temperaturaDois = 36.7;
		boolean arCondicionadoDois = true;
		System.out.println("Nome: " + nomeDois);
		System.out.println("Idade: " + idadeDois);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura " + temperaturaDois);
		System.out.println("Ar Condicionado: " + arCondicionadoDois);
		System.out.println("");
		// terceiro  
		String nomeTres = "Bruna Guttenberg Lopes";
		int idadeTres = 19;
		char sexoTres = 'F';
		double temperaturaTres = 15.6;
		boolean arCondicionadoTres = false;
		System.out.println("Nome: " + nomeTres);
		System.out.println("Idade: " + idadeTres);
		System.out.println("Sexo: " + sexoTres);
		System.out.println("Temperatura: " + temperaturaTres);
		System.out.println("Ar Condicionado: " + arCondicionadoTres);
		System.out.println("");
		System.out.println("OPERADORES ARITMÉTICOS E ATRIBUIÇÕES");
		System.out.println("_____________________________________");
		double i = 10;
		System.out.println("Exemplos: ");
		System.out.println("i = " +  i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("");
		int n = 127;
		String m = "Dream";
		String w = "WayV";
		System.out.println("O Grupo se chama NCT " + n);
		System.out.println("O Grupo se chama NCT " + m);
		System.out.println("O grupo se chama " + w);
		int g = 23;
		System.out.println("O grupo tem " + g + " integrantes");
		String mv = "Taeil";
		String mn = "Jisung"; 
		System.out.println("O membro mais velho se chama " + mv);
		System.out.println("O membro mais novo se chama " + mn);
		int doisMileVinte = 21;
		int doisMileVinteum = 23;
		System.out.println("O grupo possuía " + doisMileVinte + " membros em 2019 e em 2020 foram adicionados mais 2 resultando em " + doisMileVinteum);
		String s = "Shotaro";
		String su = "Sungchan";
		System.out.println("O dois novos membros são: " + s + " e " + su);
		String l = "Taeyoung";
		System.out.println("O líder do grupo se chama " + l);
		String nomeMais = "Gustavo";
		float nota = 8.5f;
		System.out.println("Nome: " + nomeMais);
		System.out.printf("Nota é %.2f \n ", nota);
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		String nomey = teclado.nextLine();
		System.out.print("Digite a nota do aluno: ");
		String notay = teclado.nextLine();
	
		
	}	


}
