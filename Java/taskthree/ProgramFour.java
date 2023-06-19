package taskthree;

import java.util.Scanner;

public class ProgramFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int sum = 0;
		for(int i =1;i<=num; i++) {
			sum =sum + num;
		}
		System.out.println("Sum:"+sum);
	}
}
