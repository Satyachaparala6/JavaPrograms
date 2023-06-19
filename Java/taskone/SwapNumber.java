package Taskone;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//using 3rd Variable
		int temp = 0;
		temp = a;
		a = b;
		b= temp;
		System.out.println("after swap using 3rd variable: a="+ a +" b="+b);
		/*
		 * // without using 3rd variable a = a+b; b = a-b; a = a-b;
		 * System.out.println("after swap without using 3rd variable: a="+ a +" b="+b);
		 */
	}
	
}
