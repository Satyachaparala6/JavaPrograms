package tasktwo;

public class ProgramThree {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		double avg = (a+b+c)/3;
		System.out.println("Avg:"+ avg);
		if(avg > a && avg>b && avg>c) {
			System.out.println("Avg is higher than a,b,c");
		}
		else {
			if(avg>a && avg>b) {
				System.out.println("Avg is higher than a,b");
			}
			else {
				if(avg>a && avg>c) {
					System.out.println("Avg is higher than a,c");
				}
				else {
					if(avg>b && avg>c) {
						System.out.println("Avg is higher than b,c");
					}
					else {
						if(avg>a) {
							System.out.println("Avg is higher than a");
						}
						else if(avg>b) {
							System.out.println("Avg is higher than b");
						}
						else if(avg>c) {
							System.out.println("Avg is higher than c");
						}
						
					}
				}
			}
		}
	}
}
