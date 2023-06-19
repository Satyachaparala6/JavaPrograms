package taskthree;

import java.util.Scanner;

public class ProgramSix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1<num2 && num2<num3) {
			System.out.println("INCREASING");
		}else if(num1>num2 && num2>num3) {
			System.out.println("DECREASING");
		}
		else
			System.out.println("Neither increasing nor decreasing\r\n"
					+ "order");
	}
}
