package Taskone;

import java.util.Scanner;

public class ProgramThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int z = num1+num2;
		z = z+30;
		System.out.println("Final value :"+ z);
	}
}
