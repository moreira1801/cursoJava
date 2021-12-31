package cursoJava2;

public class OperadoresComparativos {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println("A é maior que B");
		System.out.println(a > b);
		System.out.println("A é menor que B");
		System.out.println(a < b);
		System.out.println("Ambas são verdadeiras");
		System.out.println((a > b) && (a < b));
		System.out.println("Pelo menos uma é verdadeira");
		System.out.println((a > b) || (a < b));
		System.out.println("As duas são falsas");
		System.out.println(!(a > b) == (a < b));
	}

}
