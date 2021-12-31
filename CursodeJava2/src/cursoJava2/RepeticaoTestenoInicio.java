package cursoJava2;

public class RepeticaoTestenoInicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cc = 0;
		while (cc<10) {
			cc++;
			if (cc == 2 || cc == 3 || cc == 4) {
				continue;
			} if (cc == 7) {
				break;
			}
			System.out.println("Cambalhota " + cc);
		}
	}

}
