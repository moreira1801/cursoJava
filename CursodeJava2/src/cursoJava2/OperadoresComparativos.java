package cursoJava2;

public class OperadoresComparativos {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println("A � maior que B");
		System.out.println(a > b);
		System.out.println("A � menor que B");
		System.out.println(a < b);
		System.out.println("Ambas s�o verdadeiras");
		System.out.println((a > b) && (a < b));
		System.out.println("Pelo menos uma � verdadeira");
		System.out.println((a > b) || (a < b));
		System.out.println("As duas s�o falsas");
		System.out.println(!(a > b) == (a < b));
	}

}
