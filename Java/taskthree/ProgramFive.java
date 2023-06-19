package taskthree;

import java.util.Scanner;

public class ProgramFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		long num = sc.nextLong();
		long sum = 0;
		int count = 0;
		while(num>0) {
			sum = sum + num%10;
			num = num/10;
			count++;
		}
		System.out.println("Number of digits:"+ count);
		System.out.println("Sum of digits:"+ sum);
	}
}
