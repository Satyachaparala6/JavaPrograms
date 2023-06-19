package taskthree;

import java.util.Scanner;

public class ProgramTwo {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int sum = 0;
		double avg = 0.0;
	   for(int i = 1; i<=10; i++) {
		 int num = sc.nextInt();
		   sum = sum+num;
		   avg = sum/i;
	   }
	   System.out.println("Sum of 10 numbers: "+ sum);
	   System.out.println("Avg of 10 numbers: "+ avg);
}
}
