package tasktwo;

public class ProgramOne {
	public static void main(String[] args) {
		int num =3;
		if(num%5 ==0) {
			System.out.println("JAVA Training");
		}
		else if(num%3 == 0) {
			System.out.println("Consultadd");
		}
		else if (num%5 == 0 && num%3==0) {
			System.out.println("Consultadd JAVA Training");
		}
	}
}
