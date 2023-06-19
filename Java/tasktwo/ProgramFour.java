package tasktwo;

import java.util.Scanner;

public class ProgramFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		for(int i =1; i<num; i++) {
			if(num<0) {
				break;
			}
			System.out.println("It’s Over");
		}
		for(int i = 1; i< num; i++) {
			if(num>0) {
				continue;
			}
			System.out.println("Good Going");
		}
	}
}
