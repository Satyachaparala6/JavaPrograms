package taskthree;

import java.util.Scanner;

public class ProgramThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 1-12:");
		int i = sc.nextInt();
		
			if(i%2 !=0 || i==8) {
				System.out.println("number of days: 31");
			}
			else if (i == 2) {
				System.out.println("number of days: 28");
			}
			else if(i%2 ==0){
				System.out.println("number of days: 30");
			}
			else {
				System.out.println("Invalid Details");
			}
		
	}
}
