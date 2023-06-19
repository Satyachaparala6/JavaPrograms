package tasktwo;

public class ProgramSix {

	public static void main(String[] args) {
		int num = 10;
		if(num %2 != 0) {
			System.out.println("NEW");
		}
		else {
			if(num>=2 && num<=5) {
				System.out.println("OLD");
			}
			else if(num>=6 && num<=30) {
				System.out.println("NEW");
			}
			else if(num>30) {
				System.out.println("OLD");
			}
		}
	}
}
