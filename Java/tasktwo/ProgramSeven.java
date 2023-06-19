package tasktwo;

import java.util.Scanner;

public class ProgramSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		float num = sc.nextFloat();
		if(num == 0){
			System.out.println("Zero");
		}
		else {
			if(num > 0) {
				System.out.println("positive");
			}
			else if(num < 0) {
				System.out.println("negative");
			}
			if(Math.abs(num)<1) {
				System.out.println("small positive");
			}
			else if(Math.abs(num)>100000) {
				System.out.println("large positive");
			}
		}
			
	}
}
