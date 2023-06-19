package taskthree;

import java.util.Scanner;

public class ProgramTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows = sc.nextInt();
		int count =1;
		for(int i=0;i<rows;i++)
	    {
	        for(int j=1;j<=rows-i;j++)
	        System.out.print(" ");
	        for(int k=0;k<=i;k++)
	        {
	            if (k==0||i==0)
	            	count=1;
	            else
	               count=count*(i-k+1)/k;
	            System.out.print(" "+count);
	        }
	        System.out.print("\n");
	    }
	
	}

}
