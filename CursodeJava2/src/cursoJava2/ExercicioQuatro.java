package cursoJava2;

public class ExercicioQuatro {

	public static void main(String[] args) {
		double hp = 2.6, lp = 1.6, ha = 0.35, la = 0.3, qtd;
		qtd = (hp*lp) / (ha*la);
		System.out.println("O n�mero de azulejos necess�rios � de: " + qtd);
		
		double v, r = 0.5, a = 1.5;
		v = 3.14159 * r * r * a;
		System.out.println("O valor do volume � de: " + v + "m�");
		
		double m = 21, h = 2.2, t = 1.4, c;
		c = (m*h/t)/745.6999;
		System.out.println("A quantidade de cavalos � de: " + c);
		
	}

}
