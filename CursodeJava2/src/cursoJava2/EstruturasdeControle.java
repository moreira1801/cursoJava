package cursoJava2;

public class EstruturasdeControle {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		if (a > b) {
			System.out.println("A � maior que B");
		} else  {
			System.out.println("A � menor que B");
		} 
		char sexo = 'M';
		if (sexo == 'M') {
			System.out.println("ALISTAMENTO MILITAR OBRIGAT�RIO");
			System.out.println("");
		}
		
		int idade = 56;
		System.out.println("Uso do 'if-else'");
		if (idade > 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
			System.out.println("");
		}
		
		System.out.println("Uso do 'else-if'");
		if (idade >= 18 && idade < 70) {
			System.out.println("VOTO OBRIGAT�RIO");
		} else if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		} else {
			System.out.println("VOTO FACULTATIVO");
			System.out.println("");
		}
		
		System.out.println("Uso do 'switch-case'");
		System.out.println("1. Cadastro de Clientes");
		System.out.println("2. Cadastro dos Usu�rios");
		System.out.println("3. Relat�rios");
		int opcao = 2;
		switch (opcao) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2: 
			System.out.println("USU�RIOS");
			break; 
		case 3: 
			System.out.println("RELAT�RIOS");
			break;
		default: 
			System.out.println("OP��O INV�LIDA");
			break;
			
		}
		System.out.println("ESTRUTURA WHILE");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("Estrutura 'DO WHILE'");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente? ");
			novoJogo = 'n';
		} while (novoJogo == 's');
			System.out.println("GAME OVER");
	}
}
