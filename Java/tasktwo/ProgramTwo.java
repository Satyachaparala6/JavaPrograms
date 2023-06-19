package tasktwo;

import java.util.Scanner;

public class ProgramTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Enter 2 number:");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int result = 0;
		switch(num) {
		case 1:
			result= first+second;
			break;
		case 2:
			result = first-second;
			break;
		case 3:
			result = first*second;
			break;
		case 4:
			result = first/second;
			break;
		case 5:
			System.out.println("Enter 2 more number:");
			int first1 = sc.nextInt();
			int second1 = sc.nextInt();
			result = (first+second+first1+second1)/4;
			break;
		}
		
		if(result<0) {
			System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
		}
		else {
			System.out.println("The result is:"+ result);
		}
		
	}
}
