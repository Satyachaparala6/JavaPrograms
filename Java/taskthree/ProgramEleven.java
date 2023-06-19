package taskthree;

import java.util.Scanner;

public class ProgramEleven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		 double num1 = sc.nextDouble();
		 System.out.println("Enter Second number:");
		 double num2 = sc.nextDouble();
		if (Math.abs(num1 - num2) <= 0.01) { 
		     System.out.println("Numbers are the same."); 
		 } 
		 else { 
		     System.out.println("Numbers are different."); 
		 } 
	}
}
